package org.kie.jbpm.cluster.wildfly;

import org.jboss.logging.Logger;
import org.kie.api.internal.utils.ClusterAwareService;

public class JBPMWildflyClusterAwareService implements ClusterAwareService {

    private final Logger LOG = Logger.getLogger(JBPMWildflyClusterAwareService.class);
    
    
    public JBPMWildflyClusterAwareService() {
        LOG.info("jBPM wildfly cluster extension initialized");
    }

    public boolean isCoordinator() {
        return WildflySingletonState.instance().isCoordinator();
    }

}
