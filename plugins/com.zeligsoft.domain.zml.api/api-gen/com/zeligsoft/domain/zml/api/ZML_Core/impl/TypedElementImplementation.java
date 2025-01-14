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

import com.zeligsoft.base.zdl.staticapi.util.ZDLFactoryRegistry;
import com.zeligsoft.base.zdl.staticapi.internal.core.ZObjectImpl;

import com.zeligsoft.domain.zml.api.ZML_Core.TypedElement;

import com.zeligsoft.domain.zml.api.ZML_Core.Type;

import com.zeligsoft.base.zdl.util.ZDLUtil;

public abstract class TypedElementImplementation extends ZObjectImpl implements
		TypedElement {
	protected Type _type;

	public TypedElementImplementation(org.eclipse.emf.ecore.EObject element) {
		super(element);
	}

	@Override
	public Type getType() {
		if (_type == null) {
			final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil
					.getValue(eObject(), "ZMLMM::ZML_Core::TypedElement",
							"type");
			if (rawValue instanceof org.eclipse.emf.ecore.EObject) {
				_type = ZDLFactoryRegistry.INSTANCE.create(
						(org.eclipse.emf.ecore.EObject) rawValue, Type.class);
			}
		}
		return _type;
	}

	@Override
	public void setType(Type val) {
		ZDLUtil.setValue(element, "ZMLMM::ZML_Core::TypedElement", "type",
				val.eObject());
	}

	@Override
	public Integer getUpperBound() {
		final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil.getValue(
				eObject(), "ZMLMM::ZML_Core::TypedElement", "upperBound");
		return (Integer) rawValue;
	}

	@Override
	public void setUpperBound(Integer val) {
		ZDLUtil.setValue(element, "ZMLMM::ZML_Core::TypedElement",
				"upperBound", val);
	}

	@Override
	public Integer getLowerBound() {
		final Object rawValue = com.zeligsoft.base.zdl.util.ZDLUtil.getValue(
				eObject(), "ZMLMM::ZML_Core::TypedElement", "lowerBound");
		return (Integer) rawValue;
	}

	@Override
	public void setLowerBound(Integer val) {
		ZDLUtil.setValue(element, "ZMLMM::ZML_Core::TypedElement",
				"lowerBound", val);
	}

}
