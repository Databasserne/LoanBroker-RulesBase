package com.databasserne.loanbroker.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return super.getClasses();
    }

    private void addResourceClasses(Set<Class<?>> resources) {
        resources.add(com.databasserne.loanbroker.rest.RulesRest.class);
    }
}
