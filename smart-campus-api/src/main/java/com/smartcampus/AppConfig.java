package com.smartcampus;

import org.glassfish.jersey.server.ResourceConfig;
import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/api/v1")
public class AppConfig extends ResourceConfig {

    public AppConfig() {
        // This tells Jersey to scan your package for all resources
        packages("com.smartcampus");
    }
}