package org.kie.jbpm.cluster.wildfly;


public class WildflySingletonState {

    private static WildflySingletonState INSTANCE;

    public boolean coordinator = false;

    public static WildflySingletonState instance() {

        if(INSTANCE == null) {
            INSTANCE = new WildflySingletonState();
        }
        return INSTANCE;
    }
    
    
    public boolean isCoordinator() {
        return coordinator;
    }

    public void setCoordinator(boolean coordinator) {
        this.coordinator = coordinator;
    }
}
