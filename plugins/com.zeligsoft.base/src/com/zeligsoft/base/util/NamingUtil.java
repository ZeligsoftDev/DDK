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

package com.zeligsoft.base.util;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;

/**
 * Class used to generate unique names for EObjects or classes derived from
 * EObject
 * 
 * @author sduchesneau
 * 
 */
public class NamingUtil {
	/**
	 * Generate a unique name. This function looks through the collection and
	 * will generate a name that doesn't exist in this collection. Unique names
	 * are generated by concatenating a number to the name.
	 * 
	 * @param name
	 * @param col
	 * @return
	 */
	public static String generateUniqueName(String name,
			Collection<? extends Object> col) {

		// Try to see if the given name is unique
		boolean found = false;
		if (col != null) {
			for (Object obj : col) {
				if (obj instanceof EObject) {
					String objectName = EMFCoreUtil.getName((EObject) obj);

					if (objectName != null && objectName.equals(name)) {
						found = true;
						break;
					}
				}
			}
		}
		if (!found) {
			return name;
		}

		// find next available unique name
		int i = 1;
		if (col != null) {
			while (true) {
				found = false;
				for (Object obj : col) {
					if (obj instanceof EObject) {
						String objectName = EMFCoreUtil.getName((EObject) obj);

						if (objectName != null && objectName.equals(name + i)) {
							found = true;
							break;
						}
					}
				}
				if (!found) {
					break;
				}
				i++;
			}
		}

		return name + i;
	}
}
