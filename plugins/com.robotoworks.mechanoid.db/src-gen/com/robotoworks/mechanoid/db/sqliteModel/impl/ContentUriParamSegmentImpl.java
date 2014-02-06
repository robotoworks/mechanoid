/**
 */
package com.robotoworks.mechanoid.db.sqliteModel.impl;

import com.robotoworks.mechanoid.db.sqliteModel.ContentUriParamSegment;
import com.robotoworks.mechanoid.db.sqliteModel.SqliteModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Uri Param Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ContentUriParamSegmentImpl#isNum <em>Num</em>}</li>
 *   <li>{@link com.robotoworks.mechanoid.db.sqliteModel.impl.ContentUriParamSegmentImpl#isText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentUriParamSegmentImpl extends ContentUriSegmentImpl implements ContentUriParamSegment
{
  /**
   * The default value of the '{@link #isNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNum()
   * @generated
   * @ordered
   */
  protected static final boolean NUM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNum()
   * @generated
   * @ordered
   */
  protected boolean num = NUM_EDEFAULT;

  /**
   * The default value of the '{@link #isText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isText()
   * @generated
   * @ordered
   */
  protected static final boolean TEXT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isText()
   * @generated
   * @ordered
   */
  protected boolean text = TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentUriParamSegmentImpl()
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
    return SqliteModelPackage.Literals.CONTENT_URI_PARAM_SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNum()
  {
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNum(boolean newNum)
  {
    boolean oldNum = num;
    num = newNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CONTENT_URI_PARAM_SEGMENT__NUM, oldNum, num));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(boolean newText)
  {
    boolean oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteModelPackage.CONTENT_URI_PARAM_SEGMENT__TEXT, oldText, text));
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
      case SqliteModelPackage.CONTENT_URI_PARAM_SEGMENT__NUM:
        return isNum();
      case SqliteModelPackage.CONTENT_URI_PARAM_SEGMENT__TEXT:
        return isText();
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
      case SqliteModelPackage.CONTENT_URI_PARAM_SEGMENT__NUM:
        setNum((Boolean)newValue);
        return;
      case SqliteModelPackage.CONTENT_URI_PARAM_SEGMENT__TEXT:
        setText((Boolean)newValue);
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
      case SqliteModelPackage.CONTENT_URI_PARAM_SEGMENT__NUM:
        setNum(NUM_EDEFAULT);
        return;
      case SqliteModelPackage.CONTENT_URI_PARAM_SEGMENT__TEXT:
        setText(TEXT_EDEFAULT);
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
      case SqliteModelPackage.CONTENT_URI_PARAM_SEGMENT__NUM:
        return num != NUM_EDEFAULT;
      case SqliteModelPackage.CONTENT_URI_PARAM_SEGMENT__TEXT:
        return text != TEXT_EDEFAULT;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (num: ");
    result.append(num);
    result.append(", text: ");
    result.append(text);
    result.append(')');
    return result.toString();
  }

} //ContentUriParamSegmentImpl
