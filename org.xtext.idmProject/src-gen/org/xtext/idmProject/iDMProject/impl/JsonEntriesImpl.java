/**
 * generated by Xtext 2.25.0
 */
package org.xtext.idmProject.iDMProject.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.idmProject.iDMProject.IDMProjectPackage;
import org.xtext.idmProject.iDMProject.JsonEntries;
import org.xtext.idmProject.iDMProject.JsonEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Entries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.idmProject.iDMProject.impl.JsonEntriesImpl#getListEntries <em>List Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsonEntriesImpl extends JsonObjectImpl implements JsonEntries
{
  /**
   * The cached value of the '{@link #getListEntries() <em>List Entries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListEntries()
   * @generated
   * @ordered
   */
  protected EList<JsonEntry> listEntries;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonEntriesImpl()
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
    return IDMProjectPackage.Literals.JSON_ENTRIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<JsonEntry> getListEntries()
  {
    if (listEntries == null)
    {
      listEntries = new EObjectContainmentEList<JsonEntry>(JsonEntry.class, this, IDMProjectPackage.JSON_ENTRIES__LIST_ENTRIES);
    }
    return listEntries;
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
      case IDMProjectPackage.JSON_ENTRIES__LIST_ENTRIES:
        return ((InternalEList<?>)getListEntries()).basicRemove(otherEnd, msgs);
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
      case IDMProjectPackage.JSON_ENTRIES__LIST_ENTRIES:
        return getListEntries();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IDMProjectPackage.JSON_ENTRIES__LIST_ENTRIES:
        getListEntries().clear();
        getListEntries().addAll((Collection<? extends JsonEntry>)newValue);
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
      case IDMProjectPackage.JSON_ENTRIES__LIST_ENTRIES:
        getListEntries().clear();
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
      case IDMProjectPackage.JSON_ENTRIES__LIST_ENTRIES:
        return listEntries != null && !listEntries.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JsonEntriesImpl
