package com.smartcampus;

import jakarta.ws.rs.container.*;
import jakarta.ws.rs.ext.Provider;

import java.util.logging.Logger;

@Provider
public class LoggingFilter implements ContainerRequestFilter, ContainerResponseFilter {

    private static final Logger logger = Logger.getLogger(LoggingFilter.class.getName());

    @Override
    public void filter(ContainerRequestContext requestContext) {
        logger.info("REQUEST: " + requestContext.getMethod() + " " +
                requestContext.getUriInfo().getRequestUri());
    }

    @Override
    public void filter(ContainerRequestContext requestContext,
                       ContainerResponseContext responseContext) {
        logger.info("RESPONSE: Status " + responseContext.getStatus());
    }
}