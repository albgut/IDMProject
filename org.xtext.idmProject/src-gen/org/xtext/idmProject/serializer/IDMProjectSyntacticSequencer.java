/*
 * generated by Xtext 2.25.0
 */
package org.xtext.idmProject.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.idmProject.services.IDMProjectGrammarAccess;

@SuppressWarnings("all")
public class IDMProjectSyntacticSequencer extends AbstractSyntacticSequencer {

	protected IDMProjectGrammarAccess grammarAccess;
	protected AbstractElementAlias match_JsonPrimitive_NULLTerminalRuleCall_2_1_or_NumberObjectParserRuleCall_4_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (IDMProjectGrammarAccess) access;
		match_JsonPrimitive_NULLTerminalRuleCall_2_1_or_NumberObjectParserRuleCall_4_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getJsonPrimitiveAccess().getNULLTerminalRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getJsonPrimitiveAccess().getNumberObjectParserRuleCall_4_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getNULLRule())
			return getNULLToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNumberObjectRule())
			return getNumberObjectToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal NULL:
	 * 	'null'
	 * ;
	 */
	protected String getNULLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "null";
	}
	
	/**
	 * NumberObject:
	 * 	(INT | DOUBLE)
	 * ;
	 */
	protected String getNumberObjectToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_JsonPrimitive_NULLTerminalRuleCall_2_1_or_NumberObjectParserRuleCall_4_1.equals(syntax))
				emit_JsonPrimitive_NULLTerminalRuleCall_2_1_or_NumberObjectParserRuleCall_4_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     NULL | NumberObject
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_JsonPrimitive_NULLTerminalRuleCall_2_1_or_NumberObjectParserRuleCall_4_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}