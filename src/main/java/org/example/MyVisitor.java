package org.example;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.example.Archivos.gramaticaBaseVisitor;
import org.example.Archivos.gramaticaParser;
import org.example.Archivos.gramaticaVisitor;

import java.util.HashMap;
import java.util.Map;


public class MyVisitor extends gramaticaBaseVisitor<Integer> {
    Map<String,Integer> memory=new HashMap<>();
    Map<String, Boolean> variableIni = new HashMap<>();
    Map<String, String> tipoVariable = new HashMap<>();

    private StringBuilder erroresSemanticos = new StringBuilder();

    public String getErroresSemanticos(){
        return erroresSemanticos.toString();
    }


    public void dec(gramaticaParser.DeclaracionContext ctx){
        gramaticaParser.SegundaContext hijos = ctx.segunda();
        System.out.println("numero de hijos segunda: "+hijos.getChildCount());

        String tipo = ctx.TIPO().getText();
        String varName = ctx.ID().getText();
        System.out.println("Nombre VAR: "+varName);

        System.out.println("Variables : "+ctx.ID().getText());
        if(hijos.getChildCount()>1 && hijos.getChild(0).getText().equals("=")) {
            // declaracion de asignacion
            System.out.println("Declaracion de asignacion");
            gramaticaParser.AsignarvalorContext asignacion = (gramaticaParser.AsignarvalorContext) ctx.segunda();
            String valor = asignacion.valor().getText();

            System.out.println("Valor de la variable: " + valor);
            System.out.println("tipo: " + tipo);

            boolean temp = false; // esta variable sirve para validar que el tipo de dato
            // coincida con el valor que se le de segun sea el tipo.


            switch (tipo) {
                case "int":
                    temp = valor.matches("\\d+");
                    break;
                case "double":
                    temp = valor.matches("\\d+\\.\\d+");
                    break;
                case "bool":
                    if (valor.equals("true") | valor.equals("false")) {
                        temp = true;
                    }
                    break;

            }

            if (temp) {
                System.out.println("Analisis de tipo y valor correcto");
            } else {
                System.out.println("Este valor no corresponde al tipo");
            }

        }else {
            System.out.println("Delaracion individual o multiple");
        }


    }

    @Override
    public Integer visitCondicionales(gramaticaParser.CondicionalesContext ctx)
    {
        //visitCondicion(ctx.condicion());
        return visitChildren(ctx);
    }

    // Método auxiliar para obtener el tipo de un numero o true|false
    private String obtenerTipo(String valor) {
        if (valor.matches("\\d+")) {
            return "int";
        } else if (valor.matches("\\d+\\.\\d+")) {
            return "double";
        } else if (valor.equals("true") || valor.equals("false")) {
            return "bool";
        }
        return "";
    }

    private boolean validarTipoAsignacion(String tipo, String valor) {
        switch (tipo) {
            case "int":
                return valor.matches("\\d+");
            case "double":
                return valor.matches("\\d+\\.\\d+");
            case "bool":
                return valor.equals("true") || valor.equals("false");
            default:
                return false;
        }
    }

    public void declaracion(gramaticaParser.DeclaracionContext ctx){
        // este metodo valida la delcaracion de variables
        // es decir que el valor corresponda al tipo de dato
        boolean esTipo = false;  // int=false <---> double=true
        String tipo = ctx.TIPO().getText();
        if (!tipo.equals("int")){
            esTipo=true; // sino es int, entonces es double.
        }

        gramaticaParser.SegundaContext temp = ctx.segunda();

        if(temp.getChildCount()>1) {

            String segundaContent = ctx.segunda().getChild(1).getText(); // esta variable tiene el contenido del hijo del token segunda
            // caracter a buscar  --->  . 'punto'
            // buscamos un punto para saber si es folotante el valor de la variable
            System.out.println("Segunda: " + segundaContent);
            boolean puntoEncontrado = false;
            char punto = '.';

            // Ciclo para recorrer la cadena
            for (int i = 0; i < segundaContent.length(); i++) {
                if (segundaContent.charAt(i) == punto) {
                    puntoEncontrado = true;
                    break;  // Sale del ciclo si encuentra el carácter
                }
            }



            if (puntoEncontrado == esTipo) {
                System.out.println("Analisis correcto");
            } else {
                System.out.println("Valor incorrecto para el tipo de dato");
            }

        }
    }

    @Override
    public Integer visitPrule(gramaticaParser.PruleContext ctx) {
        /*
        //int c=ctx.getChildCount();
        String childrenValue = ctx.children.get(0).getText();//obtener el valor de children en posicion 0
        double noChildren = ctx.children.stream().count();//Cantidad de children
        ctx.children.listIterator();
        //int value =visit(ctx.INT());

        System.out.println(childrenValue);
        System.out.println(noChildren);


        System.out.println("entraa");

         */
        return visitChildren(ctx);

    }

    @Override public Integer visitMultidecla(gramaticaParser.MultideclaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitPunto_coma(gramaticaParser.Punto_comaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitAsignarvalor(gramaticaParser.AsignarvalorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitEntero(gramaticaParser.EnteroContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitFraccionario(gramaticaParser.FraccionarioContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitDecimal(gramaticaParser.DecimalContext ctx) { return visitChildren(ctx); }



}
