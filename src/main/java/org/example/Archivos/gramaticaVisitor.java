// Generated from C:/Users/abrah/IdeaProjects/proyectoU3/src/main/java/org/example/gramatica.g4 by ANTLR 4.13.1
package org.example.Archivos;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#prule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrule(gramaticaParser.PruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link gramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(gramaticaParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multidecla}
	 * labeled alternative in {@link gramaticaParser#segunda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultidecla(gramaticaParser.MultideclaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code punto_coma}
	 * labeled alternative in {@link gramaticaParser#segunda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPunto_coma(gramaticaParser.Punto_comaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignarvalor}
	 * labeled alternative in {@link gramaticaParser#segunda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignarvalor(gramaticaParser.AsignarvalorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code entero}
	 * labeled alternative in {@link gramaticaParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(gramaticaParser.EnteroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fraccionario}
	 * labeled alternative in {@link gramaticaParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFraccionario(gramaticaParser.FraccionarioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link gramaticaParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(gramaticaParser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link gramaticaParser#fracciona}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(gramaticaParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#condicionales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionales(gramaticaParser.CondicionalesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(gramaticaParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#condi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondi(gramaticaParser.CondiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numcomp}
	 * labeled alternative in {@link gramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumcomp(gramaticaParser.NumcompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mixtocomp}
	 * labeled alternative in {@link gramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixtocomp(gramaticaParser.MixtocompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleancomp}
	 * labeled alternative in {@link gramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleancomp(gramaticaParser.BooleancompContext ctx);
}