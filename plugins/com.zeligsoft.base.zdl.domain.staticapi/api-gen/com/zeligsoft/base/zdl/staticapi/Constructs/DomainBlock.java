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
package com.zeligsoft.base.zdl.staticapi.Constructs;

import com.zeligsoft.base.zdl.staticapi.Validation.ExternalDomainConstraint;
import com.zeligsoft.base.zdl.staticapi.functions.TypeSelectPredicate;

public interface DomainBlock extends DomainNamedElement {
	java.util.List<DomainClassifier> getClassifier();

	void addClassifier(DomainClassifier val);

	<T extends DomainClassifier> T addClassifier(Class<T> typeToCreate,
			String concept);

	java.util.List<ExternalDomainConstraint> getConstraint();

	void addConstraint(ExternalDomainConstraint val);

	<T extends ExternalDomainConstraint> T addConstraint(Class<T> typeToCreate,
			String concept);

	ExternalDomainConstraint addConstraint();

	org.eclipse.uml2.uml.Package asPackage();

	/**
	 * A predicate which returns true if the Object is an
	 * instance of DomainBlock
	 */
	static final TypeSelectPredicate<DomainBlock> type = new TypeSelectPredicate<DomainBlock>(
			"ZDL::Constructs::DomainBlock", //$NON-NLS-1$
			DomainBlock.class);
}
