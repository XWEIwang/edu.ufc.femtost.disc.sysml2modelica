/*******************************************************************************
 * Copyright (c) 2013-2016 Jean-Marie Gauthier, University of Franche-Comte, and Samares-Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Jean-Marie Gauthier, University of Franche-Comte - initial API and implementation
 * Jean-Marie Gauthier, Samares-Engineering - Neon implementation
 *******************************************************************************/
/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.provider;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.util.modelicaAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class modelicaItemProviderAdapterFactory extends modelicaAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modelicaItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Class} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassItemProvider classItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this);
		}

		return classItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorItemProvider connectorItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectorAdapter() {
		if (connectorItemProvider == null) {
			connectorItemProvider = new ConnectorItemProvider(this);
		}

		return connectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Model} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelItemProvider modelItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelAdapter() {
		if (modelItemProvider == null) {
			modelItemProvider = new ModelItemProvider(this);
		}

		return modelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Record} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordItemProvider recordItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Record}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRecordAdapter() {
		if (recordItemProvider == null) {
			recordItemProvider = new RecordItemProvider(this);
		}

		return recordItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Block} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockItemProvider blockItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBlockAdapter() {
		if (blockItemProvider == null) {
			blockItemProvider = new BlockItemProvider(this);
		}

		return blockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageItemProvider packageItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this);
		}

		return packageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionItemProvider functionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionAdapter() {
		if (functionItemProvider == null) {
			functionItemProvider = new FunctionItemProvider(this);
		}

		return functionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerFunctionItemProvider derFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDerFunctionAdapter() {
		if (derFunctionItemProvider == null) {
			derFunctionItemProvider = new DerFunctionItemProvider(this);
		}

		return derFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendsClauseItemProvider extendsClauseItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtendsClauseAdapter() {
		if (extendsClauseItemProvider == null) {
			extendsClauseItemProvider = new ExtendsClauseItemProvider(this);
		}

		return extendsClauseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaModelItemProvider modelicaModelItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelicaModelAdapter() {
		if (modelicaModelItemProvider == null) {
			modelicaModelItemProvider = new ModelicaModelItemProvider(this);
		}

		return modelicaModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaValuePropertyItemProvider modelicaValuePropertyItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelicaValuePropertyAdapter() {
		if (modelicaValuePropertyItemProvider == null) {
			modelicaValuePropertyItemProvider = new ModelicaValuePropertyItemProvider(this);
		}

		return modelicaValuePropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaPartItemProvider modelicaPartItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelicaPartAdapter() {
		if (modelicaPartItemProvider == null) {
			modelicaPartItemProvider = new ModelicaPartItemProvider(this);
		}

		return modelicaPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaPortItemProvider modelicaPortItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelicaPortAdapter() {
		if (modelicaPortItemProvider == null) {
			modelicaPortItemProvider = new ModelicaPortItemProvider(this);
		}

		return modelicaPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquationItemProvider equationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEquationAdapter() {
		if (equationItemProvider == null) {
			equationItemProvider = new EquationItemProvider(this);
		}

		return equationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectItemProvider connectItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectAdapter() {
		if (connectItemProvider == null) {
			connectItemProvider = new ConnectItemProvider(this);
		}

		return connectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquationSectionItemProvider equationSectionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEquationSectionAdapter() {
		if (equationSectionItemProvider == null) {
			equationSectionItemProvider = new EquationSectionItemProvider(this);
		}

		return equationSectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaFunctionParameterItemProvider modelicaFunctionParameterItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelicaFunctionParameterAdapter() {
		if (modelicaFunctionParameterItemProvider == null) {
			modelicaFunctionParameterItemProvider = new ModelicaFunctionParameterItemProvider(this);
		}

		return modelicaFunctionParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmSectionItemProvider algorithmSectionItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlgorithmSectionAdapter() {
		if (algorithmSectionItemProvider == null) {
			algorithmSectionItemProvider = new AlgorithmSectionItemProvider(this);
		}

		return algorithmSectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstrainedByClauseItemProvider constrainedByClauseItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstrainedByClauseAdapter() {
		if (constrainedByClauseItemProvider == null) {
			constrainedByClauseItemProvider = new ConstrainedByClauseItemProvider(this);
		}

		return constrainedByClauseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationItemProvider annotationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotationAdapter() {
		if (annotationItemProvider == null) {
			annotationItemProvider = new AnnotationItemProvider(this);
		}

		return annotationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentItemProvider commentItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommentAdapter() {
		if (commentItemProvider == null) {
			commentItemProvider = new CommentItemProvider(this);
		}

		return commentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Type} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItemProvider typeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeAdapter() {
		if (typeItemProvider == null) {
			typeItemProvider = new TypeItemProvider(this);
		}

		return typeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Algorithm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmItemProvider algorithmItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Algorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlgorithmAdapter() {
		if (algorithmItemProvider == null) {
			algorithmItemProvider = new AlgorithmItemProvider(this);
		}

		return algorithmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Enumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationItemProvider enumerationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationAdapter() {
		if (enumerationItemProvider == null) {
			enumerationItemProvider = new EnumerationItemProvider(this);
		}

		return enumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EnumerationLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralItemProvider enumerationLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationLiteralAdapter() {
		if (enumerationLiteralItemProvider == null) {
			enumerationLiteralItemProvider = new EnumerationLiteralItemProvider(this);
		}

		return enumerationLiteralItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (classItemProvider != null) classItemProvider.dispose();
		if (connectorItemProvider != null) connectorItemProvider.dispose();
		if (modelItemProvider != null) modelItemProvider.dispose();
		if (recordItemProvider != null) recordItemProvider.dispose();
		if (blockItemProvider != null) blockItemProvider.dispose();
		if (packageItemProvider != null) packageItemProvider.dispose();
		if (functionItemProvider != null) functionItemProvider.dispose();
		if (derFunctionItemProvider != null) derFunctionItemProvider.dispose();
		if (extendsClauseItemProvider != null) extendsClauseItemProvider.dispose();
		if (modelicaModelItemProvider != null) modelicaModelItemProvider.dispose();
		if (modelicaValuePropertyItemProvider != null) modelicaValuePropertyItemProvider.dispose();
		if (modelicaPartItemProvider != null) modelicaPartItemProvider.dispose();
		if (modelicaPortItemProvider != null) modelicaPortItemProvider.dispose();
		if (equationItemProvider != null) equationItemProvider.dispose();
		if (connectItemProvider != null) connectItemProvider.dispose();
		if (equationSectionItemProvider != null) equationSectionItemProvider.dispose();
		if (modelicaFunctionParameterItemProvider != null) modelicaFunctionParameterItemProvider.dispose();
		if (algorithmSectionItemProvider != null) algorithmSectionItemProvider.dispose();
		if (constrainedByClauseItemProvider != null) constrainedByClauseItemProvider.dispose();
		if (annotationItemProvider != null) annotationItemProvider.dispose();
		if (commentItemProvider != null) commentItemProvider.dispose();
		if (typeItemProvider != null) typeItemProvider.dispose();
		if (algorithmItemProvider != null) algorithmItemProvider.dispose();
		if (enumerationItemProvider != null) enumerationItemProvider.dispose();
		if (enumerationLiteralItemProvider != null) enumerationLiteralItemProvider.dispose();
	}

}
