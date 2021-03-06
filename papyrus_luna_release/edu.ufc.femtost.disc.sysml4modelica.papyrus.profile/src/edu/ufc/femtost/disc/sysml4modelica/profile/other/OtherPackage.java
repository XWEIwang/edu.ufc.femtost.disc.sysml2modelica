/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.other;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.other.OtherFactory
 * @model kind="package"
 * @generated
 */
public interface OtherPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "other";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.femto-st.fr/disc/SysML4Modelica/Other";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Other";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OtherPackage eINSTANCE = edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.OtherPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.ModelicaAnnotationImpl <em>Modelica Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.ModelicaAnnotationImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.OtherPackageImpl#getModelicaAnnotation()
	 * @generated
	 */
	int MODELICA_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_ANNOTATION__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Modelica Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.ModelicaSimulationImpl <em>Modelica Simulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.ModelicaSimulationImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.OtherPackageImpl#getModelicaSimulation()
	 * @generated
	 */
	int MODELICA_SIMULATION = 1;

	/**
	 * The number of structural features of the '<em>Modelica Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_SIMULATION_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.other.ModelicaAnnotation <em>Modelica Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Annotation</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.other.ModelicaAnnotation
	 * @generated
	 */
	EClass getModelicaAnnotation();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.profile.other.ModelicaAnnotation#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.other.ModelicaAnnotation#getBase_Comment()
	 * @see #getModelicaAnnotation()
	 * @generated
	 */
	EReference getModelicaAnnotation_Base_Comment();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.other.ModelicaSimulation <em>Modelica Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Simulation</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.other.ModelicaSimulation
	 * @generated
	 */
	EClass getModelicaSimulation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OtherFactory getOtherFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.ModelicaAnnotationImpl <em>Modelica Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.ModelicaAnnotationImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.OtherPackageImpl#getModelicaAnnotation()
		 * @generated
		 */
		EClass MODELICA_ANNOTATION = eINSTANCE.getModelicaAnnotation();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_ANNOTATION__BASE_COMMENT = eINSTANCE.getModelicaAnnotation_Base_Comment();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.ModelicaSimulationImpl <em>Modelica Simulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.ModelicaSimulationImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.OtherPackageImpl#getModelicaSimulation()
		 * @generated
		 */
		EClass MODELICA_SIMULATION = eINSTANCE.getModelicaSimulation();

	}

} //OtherPackage
