package com.company.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    private static final ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        logger.debug("Starting the app.");
        while (true) {
            logger.debug("Displaying Options.");
            logger.debug("Got Beverage request for - {}.", "finalBeverageRequest.getBeverageName()");
            threadPoolExecutor.execute(() -> {
                try {
                    logger.debug("Launching thread for beverage {} on outlet {}.", "finalBeverageRequest.getBeverageName()", "finalOutlet.getId()");
                }  catch (Exception e) {
                    System.out.println(e.getMessage());
                    logger.debug(e.getMessage());
                }
            });
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                logger.debug("Thread sleep waiting for options got interrupted", e);
            }
        }
    }
}
