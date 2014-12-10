/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.util;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.EquationsandalgorithmsPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EquationsandalgorithmsXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquationsandalgorithmsXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EquationsandalgorithmsPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the EquationsandalgorithmsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EquationsandalgorithmsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EquationsandalgorithmsResourceFactoryImpl());
		}
		return registrations;
	}

} //EquationsandalgorithmsXMLProcessor
