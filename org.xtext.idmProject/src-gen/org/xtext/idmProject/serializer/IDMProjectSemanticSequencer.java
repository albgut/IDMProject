/*
 * generated by Xtext 2.25.0
 */
package org.xtext.idmProject.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.idmProject.iDMProject.ArrayObject;
import org.xtext.idmProject.iDMProject.BooleanObject;
import org.xtext.idmProject.iDMProject.IDMProjectPackage;
import org.xtext.idmProject.iDMProject.Initialisation;
import org.xtext.idmProject.iDMProject.Insert;
import org.xtext.idmProject.iDMProject.JsonCommand;
import org.xtext.idmProject.iDMProject.JsonCommands;
import org.xtext.idmProject.iDMProject.JsonEntries;
import org.xtext.idmProject.iDMProject.JsonEntry;
import org.xtext.idmProject.iDMProject.JsonPrimitive;
import org.xtext.idmProject.iDMProject.Modify;
import org.xtext.idmProject.iDMProject.Mult;
import org.xtext.idmProject.iDMProject.Path;
import org.xtext.idmProject.iDMProject.Print;
import org.xtext.idmProject.iDMProject.Remove;
import org.xtext.idmProject.iDMProject.Select;
import org.xtext.idmProject.iDMProject.Store;
import org.xtext.idmProject.iDMProject.StringObject;
import org.xtext.idmProject.iDMProject.Sum;
import org.xtext.idmProject.services.IDMProjectGrammarAccess;

@SuppressWarnings("all")
public class IDMProjectSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IDMProjectGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == IDMProjectPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case IDMProjectPackage.ARRAY_OBJECT:
				sequence_ArrayObject(context, (ArrayObject) semanticObject); 
				return; 
			case IDMProjectPackage.BOOLEAN_OBJECT:
				sequence_BooleanObject(context, (BooleanObject) semanticObject); 
				return; 
			case IDMProjectPackage.INITIALISATION:
				sequence_Initialisation(context, (Initialisation) semanticObject); 
				return; 
			case IDMProjectPackage.INSERT:
				sequence_Insert(context, (Insert) semanticObject); 
				return; 
			case IDMProjectPackage.JSON_COMMAND:
				sequence_JsonCommand(context, (JsonCommand) semanticObject); 
				return; 
			case IDMProjectPackage.JSON_COMMANDS:
				sequence_JsonCommands(context, (JsonCommands) semanticObject); 
				return; 
			case IDMProjectPackage.JSON_ENTRIES:
				sequence_JsonEntries(context, (JsonEntries) semanticObject); 
				return; 
			case IDMProjectPackage.JSON_ENTRY:
				sequence_JsonEntry(context, (JsonEntry) semanticObject); 
				return; 
			case IDMProjectPackage.JSON_PRIMITIVE:
				sequence_JsonPrimitive(context, (JsonPrimitive) semanticObject); 
				return; 
			case IDMProjectPackage.MODIFY:
				sequence_Modify(context, (Modify) semanticObject); 
				return; 
			case IDMProjectPackage.MULT:
				sequence_Mult(context, (Mult) semanticObject); 
				return; 
			case IDMProjectPackage.PATH:
				sequence_Path(context, (Path) semanticObject); 
				return; 
			case IDMProjectPackage.PRINT:
				sequence_Print(context, (Print) semanticObject); 
				return; 
			case IDMProjectPackage.REMOVE:
				sequence_Remove(context, (Remove) semanticObject); 
				return; 
			case IDMProjectPackage.SELECT:
				sequence_Select(context, (Select) semanticObject); 
				return; 
			case IDMProjectPackage.STORE:
				sequence_Store(context, (Store) semanticObject); 
				return; 
			case IDMProjectPackage.STRING_OBJECT:
				sequence_StringObject(context, (StringObject) semanticObject); 
				return; 
			case IDMProjectPackage.SUM:
				sequence_Sum(context, (Sum) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     JsonObject returns ArrayObject
	 *     JsonPrimitive returns ArrayObject
	 *     ArrayObject returns ArrayObject
	 *
	 * Constraint:
	 *     (values+=JsonObject values+=JsonObject*)?
	 */
	protected void sequence_ArrayObject(ISerializationContext context, ArrayObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JsonObject returns BooleanObject
	 *     JsonPrimitive returns BooleanObject
	 *     BooleanObject returns BooleanObject
	 *
	 * Constraint:
	 *     value=Boolean
	 */
	protected void sequence_BooleanObject(ISerializationContext context, BooleanObject semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IDMProjectPackage.Literals.BOOLEAN_OBJECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IDMProjectPackage.Literals.BOOLEAN_OBJECT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanObjectAccess().getValueBooleanEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Initialisation returns Initialisation
	 *
	 * Constraint:
	 *     filePath=STRING
	 */
	protected void sequence_Initialisation(ISerializationContext context, Initialisation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IDMProjectPackage.Literals.INITIALISATION__FILE_PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IDMProjectPackage.Literals.INITIALISATION__FILE_PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInitialisationAccess().getFilePathSTRINGTerminalRuleCall_1_0(), semanticObject.getFilePath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Insert
	 *     Insert returns Insert
	 *
	 * Constraint:
	 *     (path=Path jsonInString=STRING)
	 */
	protected void sequence_Insert(ISerializationContext context, Insert semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IDMProjectPackage.Literals.INSERT__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IDMProjectPackage.Literals.INSERT__PATH));
			if (transientValues.isValueTransient(semanticObject, IDMProjectPackage.Literals.INSERT__JSON_IN_STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IDMProjectPackage.Literals.INSERT__JSON_IN_STRING));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInsertAccess().getPathPathParserRuleCall_1_0(), semanticObject.getPath());
		feeder.accept(grammarAccess.getInsertAccess().getJsonInStringSTRINGTerminalRuleCall_2_0(), semanticObject.getJsonInString());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JsonCommand returns JsonCommand
	 *
	 * Constraint:
	 *     (init=Initialisation operations+=Operation* final=Final)
	 */
	protected void sequence_JsonCommand(ISerializationContext context, JsonCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JsonCommands returns JsonCommands
	 *
	 * Constraint:
	 *     jsonCommands+=JsonCommand+
	 */
	protected void sequence_JsonCommands(ISerializationContext context, JsonCommands semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JsonObject returns JsonEntries
	 *     JsonEntries returns JsonEntries
	 *
	 * Constraint:
	 *     (listEntries+=JsonEntry listEntries+=JsonEntry*)
	 */
	protected void sequence_JsonEntries(ISerializationContext context, JsonEntries semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JsonEntry returns JsonEntry
	 *
	 * Constraint:
	 *     (key=ID jsonObject=JsonObject)
	 */
	protected void sequence_JsonEntry(ISerializationContext context, JsonEntry semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IDMProjectPackage.Literals.JSON_ENTRY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IDMProjectPackage.Literals.JSON_ENTRY__KEY));
			if (transientValues.isValueTransient(semanticObject, IDMProjectPackage.Literals.JSON_ENTRY__JSON_OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IDMProjectPackage.Literals.JSON_ENTRY__JSON_OBJECT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJsonEntryAccess().getKeyIDTerminalRuleCall_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getJsonEntryAccess().getJsonObjectJsonObjectParserRuleCall_4_0(), semanticObject.getJsonObject());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JsonObject returns JsonPrimitive
	 *     JsonPrimitive returns JsonPrimitive
	 *
	 * Constraint:
	 *     {JsonPrimitive}
	 */
	protected void sequence_JsonPrimitive(ISerializationContext context, JsonPrimitive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Modify
	 *     Modify returns Modify
	 *
	 * Constraint:
	 *     (path=Path? jsonObject=JsonObject)
	 */
	protected void sequence_Modify(ISerializationContext context, Modify semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Mult
	 *     Mult returns Mult
	 *
	 * Constraint:
	 *     (pathTOStore=Path pathToMult=Path)
	 */
	protected void sequence_Mult(ISerializationContext context, Mult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IDMProjectPackage.Literals.MULT__PATH_TO_STORE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IDMProjectPackage.Literals.MULT__PATH_TO_STORE));
			if (transientValues.isValueTransient(semanticObject, IDMProjectPackage.Literals.MULT__PATH_TO_MULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IDMProjectPackage.Literals.MULT__PATH_TO_MULT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultAccess().getPathTOStorePathParserRuleCall_1_0(), semanticObject.getPathTOStore());
		feeder.accept(grammarAccess.getMultAccess().getPathToMultPathParserRuleCall_2_0(), semanticObject.getPathToMult());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Path returns Path
	 *
	 * Constraint:
	 *     ((values+=GOBACK | values+=ROOT | values+=ID) values+=GOBACK? (values+=ID? values+=GOBACK?)*)
	 */
	protected void sequence_Path(ISerializationContext context, Path semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Final returns Print
	 *     Print returns Print
	 *
	 * Constraint:
	 *     path=Path?
	 */
	protected void sequence_Print(ISerializationContext context, Print semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Remove
	 *     Remove returns Remove
	 *
	 * Constraint:
	 *     path=Path?
	 */
	protected void sequence_Remove(ISerializationContext context, Remove semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Select
	 *     Select returns Select
	 *
	 * Constraint:
	 *     path=Path
	 */
	protected void sequence_Select(ISerializationContext context, Select semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IDMProjectPackage.Literals.SELECT__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IDMProjectPackage.Literals.SELECT__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSelectAccess().getPathPathParserRuleCall_1_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Final returns Store
	 *     Store returns Store
	 *
	 * Constraint:
	 *     (path=Path? filePath=STRING)
	 */
	protected void sequence_Store(ISerializationContext context, Store semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JsonObject returns StringObject
	 *     JsonPrimitive returns StringObject
	 *     StringObject returns StringObject
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringObject(ISerializationContext context, StringObject semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IDMProjectPackage.Literals.STRING_OBJECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IDMProjectPackage.Literals.STRING_OBJECT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringObjectAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Sum
	 *     Sum returns Sum
	 *
	 * Constraint:
	 *     (pathTOStore=Path pathToAdd=Path)
	 */
	protected void sequence_Sum(ISerializationContext context, Sum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IDMProjectPackage.Literals.SUM__PATH_TO_STORE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IDMProjectPackage.Literals.SUM__PATH_TO_STORE));
			if (transientValues.isValueTransient(semanticObject, IDMProjectPackage.Literals.SUM__PATH_TO_ADD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IDMProjectPackage.Literals.SUM__PATH_TO_ADD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSumAccess().getPathTOStorePathParserRuleCall_1_0(), semanticObject.getPathTOStore());
		feeder.accept(grammarAccess.getSumAccess().getPathToAddPathParserRuleCall_2_0(), semanticObject.getPathToAdd());
		feeder.finish();
	}
	
	
}