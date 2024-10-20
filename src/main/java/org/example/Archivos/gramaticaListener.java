// Generated from C:/Users/abrah/IdeaProjects/proyectoU3/src/main/java/org/example/gramatica.g4 by ANTLR 4.13.1
package org.example.Archivos;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(gramaticaParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(gramaticaParser.PruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link gramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(gramaticaParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link gramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(gramaticaParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multidecla}
	 * labeled alternative in {@link gramaticaParser#segunda}.
	 * @param ctx the parse tree
	 */
	void enterMultidecla(gramaticaParser.MultideclaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multidecla}
	 * labeled alternative in {@link gramaticaParser#segunda}.
	 * @param ctx the parse tree
	 */
	void exitMultidecla(gramaticaParser.MultideclaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code punto_coma}
	 * labeled alternative in {@link gramaticaParser#segunda}.
	 * @param ctx the parse tree
	 */
	void enterPunto_coma(gramaticaParser.Punto_comaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code punto_coma}
	 * labeled alternative in {@link gramaticaParser#segunda}.
	 * @param ctx the parse tree
	 */
	void exitPunto_coma(gramaticaParser.Punto_comaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asignarvalor}
	 * labeled alternative in {@link gramaticaParser#segunda}.
	 * @param ctx the parse tree
	 */
	void enterAsignarvalor(gramaticaParser.AsignarvalorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asignarvalor}
	 * labeled alternative in {@link gramaticaParser#segunda}.
	 * @param ctx the parse tree
	 */
	void exitAsignarvalor(gramaticaParser.AsignarvalorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code entero}
	 * labeled alternative in {@link gramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterEntero(gramaticaParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entero}
	 * labeled alternative in {@link gramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitEntero(gramaticaParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fraccionario}
	 * labeled alternative in {@link gramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterFraccionario(gramaticaParser.FraccionarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fraccionario}
	 * labeled alternative in {@link gramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitFraccionario(gramaticaParser.FraccionarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link gramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(gramaticaParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link gramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(gramaticaParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link gramaticaParser#fracciona}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(gramaticaParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link gramaticaParser#fracciona}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(gramaticaParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterCondicionales(gramaticaParser.CondicionalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitCondicionales(gramaticaParser.CondicionalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(gramaticaParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(gramaticaParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#condi}.
	 * @param ctx the parse tree
	 */
	void enterCondi(gramaticaParser.CondiContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#condi}.
	 * @param ctx the parse tree
	 */
	void exitCondi(gramaticaParser.CondiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numcomp}
	 * labeled alternative in {@link gramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterNumcomp(gramaticaParser.NumcompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numcomp}
	 * labeled alternative in {@link gramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitNumcomp(gramaticaParser.NumcompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mixtocomp}
	 * labeled alternative in {@link gramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterMixtocomp(gramaticaParser.MixtocompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mixtocomp}
	 * labeled alternative in {@link gramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitMixtocomp(gramaticaParser.MixtocompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleancomp}
	 * labeled alternative in {@link gramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterBooleancomp(gramaticaParser.BooleancompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleancomp}
	 * labeled alternative in {@link gramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitBooleancomp(gramaticaParser.BooleancompContext ctx);
}