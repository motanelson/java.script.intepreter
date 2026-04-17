// Generated from js.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jsParser}.
 */
public interface jsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jsParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(jsParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(jsParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(jsParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(jsParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariavel(jsParser.DeclaracaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariavel(jsParser.DeclaracaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoFuncao(jsParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoFuncao(jsParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#parametroLista}.
	 * @param ctx the parse tree
	 */
	void enterParametroLista(jsParser.ParametroListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#parametroLista}.
	 * @param ctx the parse tree
	 */
	void exitParametroLista(jsParser.ParametroListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(jsParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(jsParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(jsParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(jsParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(jsParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(jsParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(jsParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(jsParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void enterComparacao(jsParser.ComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void exitComparacao(jsParser.ComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#soma}.
	 * @param ctx the parse tree
	 */
	void enterSoma(jsParser.SomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#soma}.
	 * @param ctx the parse tree
	 */
	void exitSoma(jsParser.SomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#produto}.
	 * @param ctx the parse tree
	 */
	void enterProduto(jsParser.ProdutoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#produto}.
	 * @param ctx the parse tree
	 */
	void exitProduto(jsParser.ProdutoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(jsParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(jsParser.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(jsParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(jsParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#argumentoLista}.
	 * @param ctx the parse tree
	 */
	void enterArgumentoLista(jsParser.ArgumentoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#argumentoLista}.
	 * @param ctx the parse tree
	 */
	void exitArgumentoLista(jsParser.ArgumentoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jsParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(jsParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jsParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(jsParser.TipoContext ctx);
}