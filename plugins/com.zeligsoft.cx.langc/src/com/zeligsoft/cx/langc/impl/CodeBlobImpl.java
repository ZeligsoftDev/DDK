/*******************************************************************************
 * Copyright (c) 2020 Northrop Grumman Systems Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.zeligsoft.cx.langc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.zeligsoft.cx.codegen.UserEditableRegion;
import com.zeligsoft.cx.codegen.io.CodeWriter;
import com.zeligsoft.cx.langc.CodeBlob;
import com.zeligsoft.cx.langc.DependencyBlob;
import com.zeligsoft.cx.langc.LangCPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Blob</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.zeligsoft.cx.langc.impl.CodeBlobImpl#getText <em>Text</em>}</li>
 *   <li>{@link com.zeligsoft.cx.langc.impl.CodeBlobImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link com.zeligsoft.cx.langc.impl.CodeBlobImpl#getMarkerComment <em>Marker Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("nls")
public class CodeBlobImpl extends CodeBlockImpl implements CodeBlob {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected DependencyBlob dependencies;

	/**
	 * The default value of the '{@link #getMarkerComment() <em>Marker Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerComment()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarkerComment() <em>Marker Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerComment()
	 * @generated
	 * @ordered
	 */
	protected String markerComment = MARKER_COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeBlobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LangCPackage.Literals.CODE_BLOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyBlob getDependencies() {
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencies(DependencyBlob newDependencies, NotificationChain msgs) {
		DependencyBlob oldDependencies = dependencies;
		dependencies = newDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangCPackage.CODE_BLOB__DEPENDENCIES, oldDependencies, newDependencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencies(DependencyBlob newDependencies) {
		if (newDependencies != dependencies) {
			NotificationChain msgs = null;
			if (dependencies != null)
				msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangCPackage.CODE_BLOB__DEPENDENCIES, null, msgs);
			if (newDependencies != null)
				msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangCPackage.CODE_BLOB__DEPENDENCIES, null, msgs);
			msgs = basicSetDependencies(newDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LangCPackage.CODE_BLOB__DEPENDENCIES, newDependencies, newDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerComment() {
		return markerComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerComment(String newMarkerComment) {
		String oldMarkerComment = markerComment;
		markerComment = newMarkerComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LangCPackage.CODE_BLOB__MARKER_COMMENT, oldMarkerComment, markerComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LangCPackage.CODE_BLOB__DEPENDENCIES:
				return basicSetDependencies(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LangCPackage.CODE_BLOB__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LangCPackage.CODE_BLOB__TEXT:
				return getText();
			case LangCPackage.CODE_BLOB__DEPENDENCIES:
				return getDependencies();
			case LangCPackage.CODE_BLOB__MARKER_COMMENT:
				return getMarkerComment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LangCPackage.CODE_BLOB__TEXT:
				setText((String)newValue);
				return;
			case LangCPackage.CODE_BLOB__DEPENDENCIES:
				setDependencies((DependencyBlob)newValue);
				return;
			case LangCPackage.CODE_BLOB__MARKER_COMMENT:
				setMarkerComment((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case LangCPackage.CODE_BLOB__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case LangCPackage.CODE_BLOB__DEPENDENCIES:
				setDependencies((DependencyBlob)null);
				return;
			case LangCPackage.CODE_BLOB__MARKER_COMMENT:
				setMarkerComment(MARKER_COMMENT_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LangCPackage.CODE_BLOB__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case LangCPackage.CODE_BLOB__DEPENDENCIES:
				return dependencies != null;
			case LangCPackage.CODE_BLOB__MARKER_COMMENT:
				return MARKER_COMMENT_EDEFAULT == null ? markerComment != null : !MARKER_COMMENT_EDEFAULT.equals(markerComment);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (text: ");
		result.append(text);
		result.append(", markerComment: ");
		result.append(markerComment);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean write(CodeWriter code) {

		boolean hasMarkerComment
			= this.markerComment != null
		   && this.markerComment.length() > 0;

		return code.openBrace()
			&& ( ! hasMarkerComment || code.writeLn( this.markerComment ) )
			&& code.writeLn( getText().trim() )
			&& ( ! hasMarkerComment || code.writeLn( UserEditableRegion.userEditEnd() ) )
			&& code.closeBrace()
			&& code.newline();
	}

} //CodeBlobImpl
