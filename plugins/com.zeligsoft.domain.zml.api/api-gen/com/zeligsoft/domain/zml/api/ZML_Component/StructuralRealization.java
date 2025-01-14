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
package com.zeligsoft.domain.zml.api.ZML_Component;

 import com.zeligsoft.base.zdl.staticapi.core.ZObject;
import com.zeligsoft.base.zdl.staticapi.functions.TypeSelectPredicate;

public interface StructuralRealization extends ZObject {
java.util.List<Part> getPart();
void addPart(Part val);
<T extends Part> T addPart(Class<T> typeToCreate, String concept);
java.util.List<AssemblyConnector> getConnector();
void addConnector(AssemblyConnector val);
<T extends AssemblyConnector> T addConnector(Class<T> typeToCreate, String concept);
AssemblyConnector addConnector();
java.util.List<Port> getOwnedPort();
void addOwnedPort(Port val);
<T extends Port> T addOwnedPort(Class<T> typeToCreate, String concept);
java.util.List<WorkerFunction> getWorker();
void addWorker(WorkerFunction val);
<T extends WorkerFunction> T addWorker(Class<T> typeToCreate, String concept);
WorkerFunction addWorker();
ComponentInterface getInterface();
void setInterface(ComponentInterface val)
;
java.util.List<WorkerFunctionImpl> getWorkerImpl();
void addWorkerImpl(WorkerFunctionImpl val);
<T extends WorkerFunctionImpl> T addWorkerImpl(Class<T> typeToCreate, String concept);
WorkerFunctionImpl addWorkerImpl();
org.eclipse.uml2.uml.Component asComponent();
/**
 * A predicate which returns true if the Object is an
 * instance of StructuralRealization
 */
static final TypeSelectPredicate<StructuralRealization> type = 
    new TypeSelectPredicate<StructuralRealization>(
        "ZMLMM::ZML_Component::StructuralRealization", //$NON-NLS-1$
        StructuralRealization.class); 
}
