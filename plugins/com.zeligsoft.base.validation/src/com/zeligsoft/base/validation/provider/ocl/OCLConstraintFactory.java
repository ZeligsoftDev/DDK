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
package com.zeligsoft.base.validation.provider.ocl;

import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.uml2.uml.Constraint;

import com.zeligsoft.base.validation.provider.IZDLConstraintFactory;
import com.zeligsoft.base.validation.util.IOCLProvider;
import com.zeligsoft.base.validation.util.InvalidConstraintException;
import com.zeligsoft.base.validation.util.ValidationUtil;

/**
 * A factory for constraints defined in the <tt>Java</tt> language. These
 * constraints specify a class in the bundle that deploys the ZDL model in which
 * the constraint is defined.
 * 
 * @author Christian W. Damus (cdamus)
 */
public class OCLConstraintFactory
		implements IZDLConstraintFactory {

	/**
	 * Initializes me.
	 */
	public OCLConstraintFactory() {
		super();
	}

	@Override
	public String getLanguage() {
		return IOCLProvider.OCL_LANGUAGE;
	}

	@Override
	public IModelConstraint createConstraint(Constraint umlConstraint,
			String body, IConstraintDescriptor descriptor)
			throws InvalidConstraintException {
		String context =
			ValidationUtil.getConstraintContext(umlConstraint);
		return new OCLConstraint(context,
			body, descriptor);
	}
}
