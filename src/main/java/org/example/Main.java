package org.example;

import org.example.Archivos.gramaticaLexer;
import org.example.Archivos.gramaticaParser;



import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;

import static org.antlr.v4.runtime.CharStreams.fromString;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            String input;
            Scanner scanner = new Scanner(System.in);
            do {

                System.out.print("ingrese una expresion >");
                input = scanner.nextLine();

                if (input.equals("exit")) {
                    continue;
                }
                //;

                CharStream ch = fromString(input + "\n");
                gramaticaLexer lexer = new gramaticaLexer(ch);
                CommonTokenStream token = new CommonTokenStream(lexer);
                gramaticaParser parser = new gramaticaParser(token);

                ParseTree tree = parser.prule();
                //System.out.println(tree.toStringTree(parser)); //mostrar arbol



                MyVisitor visitor = new MyVisitor();
                visitor.visit(tree);


            } while (!input.equals("exit"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}