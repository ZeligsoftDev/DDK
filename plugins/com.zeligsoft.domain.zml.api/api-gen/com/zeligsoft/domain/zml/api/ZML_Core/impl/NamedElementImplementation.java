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
package com.zeligsoft.domain.zml.api.ZML_Core.impl;

import com.zeligsoft.base.zdl.staticapi.internal.core.ZObjectImpl;

import com.zeligsoft.domain.zml.api.ZML_Core.NamedElement;

import com.zeligsoft.base.zdl.util.ZDLUtil;

public abstract class NamedElementImplementation extends ZObjectImpl implements
		NamedElement {
	public NamedElementImplementation(org.eclipse.emf.ecore.EObject element) {
		super(element);
	}

	@Override
	public String getQualifiedName() {
		final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil.getValue(
				eObject(), "ZMLMM::ZML_Core::NamedElement", "qualifiedName");
		return (String) rawValue;
	}

	@Override
	public String getName() {
		final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil.getValue(
				eObject(), "ZMLMM::ZML_Core::NamedElement", "name");
		return (String) rawValue;
	}

	@Override
	public void setName(String val) {
		ZDLUtil.setValue(element, "ZMLMM::ZML_Core::NamedElement", "name", val);
	}

	@Override
	public org.eclipse.uml2.uml.NamedElement asNamedElement() {
		return (org.eclipse.uml2.uml.NamedElement) eObject();
	}
}
