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
package com.zeligsoft.ddk.zdlgen2umlprofile.filesystem;

import com.zeligsoft.ddk.zdlgen2umlprofile.internal.filesystem.EclipseFileSystemAccess;

/**
 * @author prismtech
 *
 */
public final class EclipseFileSystemFactory {
	public static final EclipseFileSystemFactory INSTANCE = 
			new EclipseFileSystemFactory();
	
	/**
	 * Construct me
	 */
	private EclipseFileSystemFactory() {
		// nothing to do
	}
	
	public IEclipseFileSystemAccess create() {
		return new EclipseFileSystemAccess();
	}
}
