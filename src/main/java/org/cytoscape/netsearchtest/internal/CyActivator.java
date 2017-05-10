package org.cytoscape.netsearchtest.internal;

import org.cytoscape.netsearchtest.internal.task.CustomOptionsTaskFactory;
import org.cytoscape.netsearchtest.internal.task.CustomQueryTaskFactory;
import org.cytoscape.netsearchtest.internal.task.TunableOptionsTaskFactory;
import org.cytoscape.service.util.AbstractCyActivator;
import org.cytoscape.service.util.CyServiceRegistrar;
import org.osgi.framework.BundleContext;

public class CyActivator extends AbstractCyActivator {

	@Override
	public void start(BundleContext bc) throws Exception {
		CyServiceRegistrar serviceRegistrar = getService(bc, CyServiceRegistrar.class);
		
		registerAllServices(bc, new TunableOptionsTaskFactory());
		registerAllServices(bc, new CustomOptionsTaskFactory());
		registerAllServices(bc, new CustomQueryTaskFactory(serviceRegistrar));
	}
}
