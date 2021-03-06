/**
 * generated by Xtext 2.25.0
 */
package org.xtext.idmProject.iDMProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.idmProject.iDMProject.ArrayObject#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.xtext.idmProject.iDMProject.IDMProjectPackage#getArrayObject()
 * @model
 * @generated
 */
public interface ArrayObject extends JsonPrimitive
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.idmProject.iDMProject.JsonObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.xtext.idmProject.iDMProject.IDMProjectPackage#getArrayObject_Values()
   * @model containment="true"
   * @generated
   */
  EList<JsonObject> getValues();

} // ArrayObject
