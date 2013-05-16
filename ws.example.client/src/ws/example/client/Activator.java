package ws.example.client;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;

public class Activator extends DependencyActivatorBase {

	@Override
	public void init(BundleContext ctx, DependencyManager dm) throws Exception {
		dm.add(createComponent().setImplementation(HelloWorldClient.class));
	}

	@Override
	public void destroy(BundleContext ctx, DependencyManager dm)
			throws Exception {
	}

}
