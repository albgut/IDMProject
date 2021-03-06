/**
 * generated by Xtext 2.25.0
 */
package org.xtext.idmProject.iDMProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.idmProject.iDMProject.Modify#getPath <em>Path</em>}</li>
 *   <li>{@link org.xtext.idmProject.iDMProject.Modify#getJsonObject <em>Json Object</em>}</li>
 * </ul>
 *
 * @see org.xtext.idmProject.iDMProject.IDMProjectPackage#getModify()
 * @model
 * @generated
 */
public interface Modify extends Operation
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(Path)
   * @see org.xtext.idmProject.iDMProject.IDMProjectPackage#getModify_Path()
   * @model containment="true"
   * @generated
   */
  Path getPath();

  /**
   * Sets the value of the '{@link org.xtext.idmProject.iDMProject.Modify#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(Path value);

  /**
   * Returns the value of the '<em><b>Json Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Json Object</em>' containment reference.
   * @see #setJsonObject(JsonObject)
   * @see org.xtext.idmProject.iDMProject.IDMProjectPackage#getModify_JsonObject()
   * @model containment="true"
   * @generated
   */
  JsonObject getJsonObject();

  /**
   * Sets the value of the '{@link org.xtext.idmProject.iDMProject.Modify#getJsonObject <em>Json Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Json Object</em>' containment reference.
   * @see #getJsonObject()
   * @generated
   */
  void setJsonObject(JsonObject value);

} // Modify
