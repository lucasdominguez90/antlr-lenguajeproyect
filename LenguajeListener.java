// Generated from Lenguaje.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LenguajeParser}.
 */
public interface LenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LenguajeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LenguajeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(LenguajeParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(LenguajeParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#seleccion}.
	 * @param ctx the parse tree
	 */
	void enterSeleccion(LenguajeParser.SeleccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#seleccion}.
	 * @param ctx the parse tree
	 */
	void exitSeleccion(LenguajeParser.SeleccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(LenguajeParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(LenguajeParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#caso_defecto}.
	 * @param ctx the parse tree
	 */
	void enterCaso_defecto(LenguajeParser.Caso_defectoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#caso_defecto}.
	 * @param ctx the parse tree
	 */
	void exitCaso_defecto(LenguajeParser.Caso_defectoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(LenguajeParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(LenguajeParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#salida}.
	 * @param ctx the parse tree
	 */
	void enterSalida(LenguajeParser.SalidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#salida}.
	 * @param ctx the parse tree
	 */
	void exitSalida(LenguajeParser.SalidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#termina}.
	 * @param ctx the parse tree
	 */
	void enterTermina(LenguajeParser.TerminaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#termina}.
	 * @param ctx the parse tree
	 */
	void exitTermina(LenguajeParser.TerminaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(LenguajeParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(LenguajeParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(LenguajeParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(LenguajeParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(LenguajeParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(LenguajeParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(LenguajeParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(LenguajeParser.NumeroContext ctx);
}