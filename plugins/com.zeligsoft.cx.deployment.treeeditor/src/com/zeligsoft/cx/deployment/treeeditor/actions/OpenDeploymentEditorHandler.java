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
package com.zeligsoft.cx.deployment.treeeditor.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.core.sashwindows.di.service.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

import com.zeligsoft.base.ui.utils.BaseUIUtil;
import com.zeligsoft.base.zdl.util.ZDLUtil;
import com.zeligsoft.domain.zml.util.ZMLMMNames;

public class OpenDeploymentEditorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		ServicesRegistry serviceRegistry = null;
		if (editor instanceof IMultiDiagramEditor) {
			IMultiDiagramEditor multiEditor = (IMultiDiagramEditor) editor;
			serviceRegistry = multiEditor.getServicesRegistry();
		} else {
			return null;
		}

		EObject eo = BaseUIUtil.getEObjectFromSelection(BaseUIUtil.getSelection());
		if (eo == null || !ZDLUtil.isZDLConcept(eo, ZMLMMNames.DEPLOYMENT)) {
			return null;
		}

		try {
			IPageManager pageManager = ServiceUtils.getInstance().getIPageManager(serviceRegistry);
			if (pageManager.isOpen(eo)) {
				pageManager.selectPage(eo);
			} else {
				pageManager.openPage(eo);
			}
		} catch (ServiceException e1) {
			// do nothing
		}

		return null;
	}

}