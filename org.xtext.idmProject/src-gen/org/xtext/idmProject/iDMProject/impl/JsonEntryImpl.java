/**
 * generated by Xtext 2.25.0
 */
package org.xtext.idmProject.iDMProject.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.idmProject.iDMProject.IDMProjectPackage;
import org.xtext.idmProject.iDMProject.JsonEntry;
import org.xtext.idmProject.iDMProject.JsonObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.idmProject.iDMProject.impl.JsonEntryImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.xtext.idmProject.iDMProject.impl.JsonEntryImpl#getJsonObject <em>Json Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsonEntryImpl extends MinimalEObjectImpl.Container implements JsonEntry
{
  /**
   * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected static final String KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected String key = KEY_EDEFAULT;

  /**
   * The cached value of the '{@link #getJsonObject() <em>Json Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJsonObject()
   * @generated
   * @ordered
   */
  protected JsonObject jsonObject;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonEntryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IDMProjectPackage.Literals.JSON_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setKey(String newKey)
  {
    String oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDMProjectPackage.JSON_ENTRY__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JsonObject getJsonObject()
  {
    return jsonObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJsonObject(JsonObject newJsonObject, NotificationChain msgs)
  {
    JsonObject oldJsonObject = jsonObject;
    jsonObject = newJsonObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IDMProjectPackage.JSON_ENTRY__JSON_OBJECT, oldJsonObject, newJsonObject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setJsonObject(JsonObject newJsonObject)
  {
    if (newJsonObject != jsonObject)
    {
      NotificationChain msgs = null;
      if (jsonObject != null)
        msgs = ((InternalEObject)jsonObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IDMProjectPackage.JSON_ENTRY__JSON_OBJECT, null, msgs);
      if (newJsonObject != null)
        msgs = ((InternalEObject)newJsonObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IDMProjectPackage.JSON_ENTRY__JSON_OBJECT, null, msgs);
      msgs = basicSetJsonObject(newJsonObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDMProjectPackage.JSON_ENTRY__JSON_OBJECT, newJsonObject, newJsonObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IDMProjectPackage.JSON_ENTRY__JSON_OBJECT:
        return basicSetJsonObject(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IDMProjectPackage.JSON_ENTRY__KEY:
        return getKey();
      case IDMProjectPackage.JSON_ENTRY__JSON_OBJECT:
        return getJsonObject();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IDMProjectPackage.JSON_ENTRY__KEY:
        setKey((String)newValue);
        return;
      case IDMProjectPackage.JSON_ENTRY__JSON_OBJECT:
        setJsonObject((JsonObject)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IDMProjectPackage.JSON_ENTRY__KEY:
        setKey(KEY_EDEFAULT);
        return;
      case IDMProjectPackage.JSON_ENTRY__JSON_OBJECT:
        setJsonObject((JsonObject)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IDMProjectPackage.JSON_ENTRY__KEY:
        return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
      case IDMProjectPackage.JSON_ENTRY__JSON_OBJECT:
        return jsonObject != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (key: ");
    result.append(key);
    result.append(')');
    return result.toString();
  }

} //JsonEntryImpl