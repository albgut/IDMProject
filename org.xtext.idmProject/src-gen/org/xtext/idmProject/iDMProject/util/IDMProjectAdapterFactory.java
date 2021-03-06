/**
 * generated by Xtext 2.25.0
 */
package org.xtext.idmProject.iDMProject.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.idmProject.iDMProject.ArrayObject;
import org.xtext.idmProject.iDMProject.BooleanObject;
import org.xtext.idmProject.iDMProject.Final;
import org.xtext.idmProject.iDMProject.IDMProjectPackage;
import org.xtext.idmProject.iDMProject.Initialisation;
import org.xtext.idmProject.iDMProject.Insert;
import org.xtext.idmProject.iDMProject.JsonCommand;
import org.xtext.idmProject.iDMProject.JsonCommands;
import org.xtext.idmProject.iDMProject.JsonEntries;
import org.xtext.idmProject.iDMProject.JsonEntry;
import org.xtext.idmProject.iDMProject.JsonObject;
import org.xtext.idmProject.iDMProject.JsonPrimitive;
import org.xtext.idmProject.iDMProject.Modify;
import org.xtext.idmProject.iDMProject.Mult;
import org.xtext.idmProject.iDMProject.Operation;
import org.xtext.idmProject.iDMProject.Path;
import org.xtext.idmProject.iDMProject.Print;
import org.xtext.idmProject.iDMProject.Remove;
import org.xtext.idmProject.iDMProject.Select;
import org.xtext.idmProject.iDMProject.Store;
import org.xtext.idmProject.iDMProject.StringObject;
import org.xtext.idmProject.iDMProject.Sum;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.idmProject.iDMProject.IDMProjectPackage
 * @generated
 */
public class IDMProjectAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IDMProjectPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDMProjectAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = IDMProjectPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IDMProjectSwitch<Adapter> modelSwitch =
    new IDMProjectSwitch<Adapter>()
    {
      @Override
      public Adapter caseJsonCommands(JsonCommands object)
      {
        return createJsonCommandsAdapter();
      }
      @Override
      public Adapter caseJsonCommand(JsonCommand object)
      {
        return createJsonCommandAdapter();
      }
      @Override
      public Adapter caseInitialisation(Initialisation object)
      {
        return createInitialisationAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseInsert(Insert object)
      {
        return createInsertAdapter();
      }
      @Override
      public Adapter casePath(Path object)
      {
        return createPathAdapter();
      }
      @Override
      public Adapter caseModify(Modify object)
      {
        return createModifyAdapter();
      }
      @Override
      public Adapter caseSum(Sum object)
      {
        return createSumAdapter();
      }
      @Override
      public Adapter caseRemove(Remove object)
      {
        return createRemoveAdapter();
      }
      @Override
      public Adapter caseMult(Mult object)
      {
        return createMultAdapter();
      }
      @Override
      public Adapter caseSelect(Select object)
      {
        return createSelectAdapter();
      }
      @Override
      public Adapter caseFinal(Final object)
      {
        return createFinalAdapter();
      }
      @Override
      public Adapter caseStore(Store object)
      {
        return createStoreAdapter();
      }
      @Override
      public Adapter casePrint(Print object)
      {
        return createPrintAdapter();
      }
      @Override
      public Adapter caseJsonObject(JsonObject object)
      {
        return createJsonObjectAdapter();
      }
      @Override
      public Adapter caseJsonPrimitive(JsonPrimitive object)
      {
        return createJsonPrimitiveAdapter();
      }
      @Override
      public Adapter caseArrayObject(ArrayObject object)
      {
        return createArrayObjectAdapter();
      }
      @Override
      public Adapter caseBooleanObject(BooleanObject object)
      {
        return createBooleanObjectAdapter();
      }
      @Override
      public Adapter caseStringObject(StringObject object)
      {
        return createStringObjectAdapter();
      }
      @Override
      public Adapter caseJsonEntries(JsonEntries object)
      {
        return createJsonEntriesAdapter();
      }
      @Override
      public Adapter caseJsonEntry(JsonEntry object)
      {
        return createJsonEntryAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.JsonCommands <em>Json Commands</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.JsonCommands
   * @generated
   */
  public Adapter createJsonCommandsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.JsonCommand <em>Json Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.JsonCommand
   * @generated
   */
  public Adapter createJsonCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.Initialisation <em>Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.Initialisation
   * @generated
   */
  public Adapter createInitialisationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.Insert <em>Insert</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.Insert
   * @generated
   */
  public Adapter createInsertAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.Path
   * @generated
   */
  public Adapter createPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.Modify <em>Modify</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.Modify
   * @generated
   */
  public Adapter createModifyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.Sum <em>Sum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.Sum
   * @generated
   */
  public Adapter createSumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.Remove <em>Remove</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.Remove
   * @generated
   */
  public Adapter createRemoveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.Mult <em>Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.Mult
   * @generated
   */
  public Adapter createMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.Select
   * @generated
   */
  public Adapter createSelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.Final <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.Final
   * @generated
   */
  public Adapter createFinalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.Store <em>Store</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.Store
   * @generated
   */
  public Adapter createStoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.Print <em>Print</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.Print
   * @generated
   */
  public Adapter createPrintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.JsonObject <em>Json Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.JsonObject
   * @generated
   */
  public Adapter createJsonObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.JsonPrimitive <em>Json Primitive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.JsonPrimitive
   * @generated
   */
  public Adapter createJsonPrimitiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.ArrayObject <em>Array Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.ArrayObject
   * @generated
   */
  public Adapter createArrayObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.BooleanObject <em>Boolean Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.BooleanObject
   * @generated
   */
  public Adapter createBooleanObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.StringObject <em>String Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.StringObject
   * @generated
   */
  public Adapter createStringObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.JsonEntries <em>Json Entries</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.JsonEntries
   * @generated
   */
  public Adapter createJsonEntriesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.idmProject.iDMProject.JsonEntry <em>Json Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.idmProject.iDMProject.JsonEntry
   * @generated
   */
  public Adapter createJsonEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //IDMProjectAdapterFactory
