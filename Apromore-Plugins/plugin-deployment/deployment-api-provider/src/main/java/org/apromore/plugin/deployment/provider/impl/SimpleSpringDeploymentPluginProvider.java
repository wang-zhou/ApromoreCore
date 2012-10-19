/**
 * Copyright 2012, Felix Mannhardt
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.apromore.plugin.deployment.provider.impl;

import org.apromore.plugin.deployment.DeploymentPlugin;
import org.apromore.plugin.provider.PluginProviderHelper;
import org.springframework.stereotype.Service;

/**
 * Using Spring/Reflection to find all installed Deployment Plugins
 *
 * @author <a href="mailto:felix.mannhardt@smail.wir.h-brs.de">Felix Mannhardt</a>
 *
 */
@Service
public class SimpleSpringDeploymentPluginProvider extends DeploymentPluginProviderImpl {

    public SimpleSpringDeploymentPluginProvider() {
        super();
        setInternalDeploymentPluginSet(PluginProviderHelper.findPluginsByClass(DeploymentPlugin.class, "org.apromore.plugin.deployment"));
    }


}