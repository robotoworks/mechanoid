/**
 */
package com.robotoworks.mechanoid.ops.opServiceModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.robotoworks.mechanoid.ops.opServiceModel.OpServiceModelPackage
 * @generated
 */
public interface OpServiceModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OpServiceModelFactory eINSTANCE = com.robotoworks.mechanoid.ops.opServiceModel.impl.OpServiceModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Service Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Block</em>'.
   * @generated
   */
  ServiceBlock createServiceBlock();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Operation Arg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Arg</em>'.
   * @generated
   */
  OperationArg createOperationArg();

  /**
   * Returns a new object of class '<em>Unique Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unique Clause</em>'.
   * @generated
   */
  UniqueClause createUniqueClause();

  /**
   * Returns a new object of class '<em>Not Unique</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Unique</em>'.
   * @generated
   */
  NotUnique createNotUnique();

  /**
   * Returns a new object of class '<em>Unique Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unique Declaration</em>'.
   * @generated
   */
  UniqueDeclaration createUniqueDeclaration();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OpServiceModelPackage getOpServiceModelPackage();

} //OpServiceModelFactory
