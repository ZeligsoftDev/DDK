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
package com.zeligsoft.domain.zml.api.ZML_Core;

import com.zeligsoft.base.zdl.staticapi.functions.TypeSelectPredicate;

public interface Parameter extends TypedElement {
	org.eclipse.uml2.uml.Parameter asParameter();

	/**
	 * A predicate which returns true if the Object is an
	 * instance of Parameter
	 */
	static final TypeSelectPredicate<Parameter> type = new TypeSelectPredicate<Parameter>(
			"ZMLMM::ZML_Core::Parameter", //$NON-NLS-1$
			Parameter.class);
}
