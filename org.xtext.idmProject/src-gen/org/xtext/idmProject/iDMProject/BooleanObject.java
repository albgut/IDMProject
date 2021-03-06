/**
 * generated by Xtext 2.25.0
 */
package org.xtext.idmProject.iDMProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.idmProject.iDMProject.BooleanObject#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.idmProject.iDMProject.IDMProjectPackage#getBooleanObject()
 * @model
 * @generated
 */
public interface BooleanObject extends JsonPrimitive
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.idmProject.iDMProject.Boolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.xtext.idmProject.iDMProject.Boolean
   * @see #setValue(org.xtext.idmProject.iDMProject.Boolean)
   * @see org.xtext.idmProject.iDMProject.IDMProjectPackage#getBooleanObject_Value()
   * @model
   * @generated
   */
  org.xtext.idmProject.iDMProject.Boolean getValue();

  /**
   * Sets the value of the '{@link org.xtext.idmProject.iDMProject.BooleanObject#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.xtext.idmProject.iDMProject.Boolean
   * @see #getValue()
   * @generated
   */
  void setValue(org.xtext.idmProject.iDMProject.Boolean value);

} // BooleanObject
