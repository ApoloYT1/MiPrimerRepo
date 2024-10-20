package org.example;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import org.antlr.v4.runtime.*;
import org.example.Archivos.gramaticaLexer;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class Menu extends JFrame {

    // Declaración de componentes
    private JTextArea txtInput;
    private JTable tbTokens;
    private JButton btnCompilar;
    private JButton btnLimpiar;

    // Constructor de la interfaz
    public Menu() {
        // Cambiar el Look and Feel a Nimbus para un diseño más moderno
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Configuración del layout principal
        setLayout(new BorderLayout());

        // Crear el título "COMPILADOR"
        JLabel lblTitulo = new JLabel("COMPILADOR AUTOMATAS 2", JLabel.CENTER);
        lblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 28));

        // Inicializar los componentes
        txtInput = new JTextArea("Ingresa tu codigo para analizar...");
        tbTokens = new JTable();  // Se definirá el modelo de tabla más adelante
        btnCompilar = new JButton("Compilar");
        btnLimpiar = new JButton("Limpiar");

        // Ajustar tamaño del botón "Compilar"
        btnCompilar.setPreferredSize(new Dimension(100, 30));
        btnLimpiar.setPreferredSize(new Dimension(100, 30));

        // Configurar tabla con columnas "Tokens" y "Lexema"
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Componente Lexico");
        model.addColumn("Lexema");
        tbTokens.setModel(model);
        tbTokens.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbTokens.setRowHeight(25);
        tbTokens.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));  // Fuente del encabezado

        // Añadir acción al hacer clic en txtInput para borrar el texto
        txtInput.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(txtInput.getText().equals("Ingresa tu codigo para analizar...")){
                    txtInput.setText("");  // Borra el contenido de txtInput al hacer clic
                }
            }
        });

        // Acción para el botón "Limpiar"
        btnLimpiar.addActionListener(e -> {
            // Limpiar los JTextArea
            txtInput.setText("Ingresa tu codigo para analizar...");
            // Limpiar la tabla tbTokens
            model.setRowCount(0);  // Eliminar todas las filas de la tabla
        });

        btnCompilar.addActionListener(e -> {
            System.out.println("entra al boton");
            String input = txtInput.getText();
            try {
                analisisTexto(input, model);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        // Crear paneles y configurar bordes
        JPanel panelIzquierdo = new JPanel(new BorderLayout());
        panelIzquierdo.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.BLACK), "Código Fuente", TitledBorder.CENTER, TitledBorder.TOP));
        panelIzquierdo.add(new JScrollPane(txtInput), BorderLayout.CENTER);

        JPanel panelDerecho = new JPanel(new BorderLayout());
        panelDerecho.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.BLACK), "Tokens", TitledBorder.CENTER, TitledBorder.TOP));
        panelDerecho.add(new JScrollPane(tbTokens), BorderLayout.CENTER);

        // Usar JSplitPane para dividir el área principal
        JSplitPane splitPaneHorizontal = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelIzquierdo, panelDerecho);
        splitPaneHorizontal.setDividerLocation(500);  // Ancho inicial del panel izquierdo
        splitPaneHorizontal.setResizeWeight(0.5);  // Ajusta cuánto espacio ocupará al redimensionar

        // Crear un panel para los botones (Limpiar a la izquierda, Compilar a la derecha)
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));  // Alinear a la derecha con espacio
        panelBotones.add(btnLimpiar);
        panelBotones.add(btnCompilar);

        // Colores personalizados para los botones
        btnCompilar.setBackground(new Color(70, 130, 180));  // Azul claro
        btnCompilar.setForeground(Color.WHITE);  // Texto blanco
        btnLimpiar.setBackground(new Color(220, 20, 60));  // Rojo claro
        btnLimpiar.setForeground(Color.WHITE);  // Texto blanco

        // Crear un panel superior para el título y los botones
        JPanel panelSuperior = new JPanel(new BorderLayout());
        panelSuperior.add(lblTitulo, BorderLayout.NORTH);  // Título arriba
        panelSuperior.add(panelBotones, BorderLayout.SOUTH);  // Botones abajo

        // Fondo amarillo claro para los paneles
        panelSuperior.setBackground(new Color(255, 255, 224));  // Fondo amarillo claro para el panel superior
        panelIzquierdo.setBackground(new Color(255, 255, 224));  // Fondo amarillo claro para el panel izquierdo
        panelDerecho.setBackground(new Color(255, 255, 224));  // Fondo amarillo claro para el panel derecho

        // Agregar los paneles al frame principal
        add(panelSuperior, BorderLayout.NORTH);  // Título y botones en la parte superior
        add(splitPaneHorizontal, BorderLayout.CENTER);  // División horizontal entre txtInput y tbTokens

        // Configuración de la ventana
        setTitle("Compilador - Menú Principal");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Centrar la ventana
        setVisible(true);
    } // fin Menu

    private void analisisTexto(String input, DefaultTableModel model) throws Exception {
        // PARTE LEXICA
        System.out.println("entra al procesarTexto");
        // crear el lexer a partir del input
        gramaticaLexer lexer = new gramaticaLexer(CharStreams.fromString(input));
        // genera los tokens utilizando el lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // llenamos el token stream
        tokens.fill();
        // limpiamos antes de llenar la tabla
        model.setRowCount(0);
        Vocabulary vocabulario = lexer.getVocabulary();

        // Recorre los tokens y los agrega a la tabla
        for (Token token : tokens.getTokens()) {
            if (token.getType() == Token.EOF) {
                break;
            }

            String nombreToken = vocabulario.getSymbolicName(token.getType());
            String lexema = token.getText();
            model.addRow(new Object[]{nombreToken, lexema});
        }
    } // TERMINA LA PARTE LEXICA

    // METODO PRINCIPAL
    public static void main(String[] args) {
        new Menu();
    }
}
