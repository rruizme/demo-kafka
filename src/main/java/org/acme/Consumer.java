package org.acme;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Consumer {

    @Inject
    Logger logger;

    @Incoming("message")
    public void printMessage(String message) {

        logger.info("¡Success! - Message: " + message);
    }
}