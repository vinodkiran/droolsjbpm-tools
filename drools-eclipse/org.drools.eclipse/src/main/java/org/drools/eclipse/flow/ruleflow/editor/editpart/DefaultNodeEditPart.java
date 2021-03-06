/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.eclipse.flow.ruleflow.editor.editpart;

import org.drools.eclipse.flow.common.editor.editpart.ElementEditPart;
import org.drools.eclipse.flow.ruleflow.core.NodeWrapper;
import org.drools.eclipse.flow.ruleflow.editor.editpart.figure.DefaultNodeFigure;
import org.eclipse.draw2d.IFigure;
import org.jbpm.workflow.core.Node;
import org.jbpm.workflow.core.NodeExtension;

public class DefaultNodeEditPart extends ElementEditPart {

    protected IFigure createFigure() {
        DefaultNodeFigure figure = new DefaultNodeFigure();
        Node node = ((NodeWrapper) getElementWrapper()).getNode();
        if (node instanceof NodeExtension) {
            figure.setIcon(((NodeExtension) node).getIcon());
        }
        return figure;
    }

}
