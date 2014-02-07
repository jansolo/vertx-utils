package com.dreikraft.vertx.utils;

import org.vertx.java.core.json.JsonObject;

/**
 * Logging Utilities.
 */
public class MessageHelper {

    /**
     * Prevents instantiation.
     */
    private MessageHelper() {}

    public static String starting(final String name){
        return String.format("starting %1$s ...", name);
    }

    public static String startSuccess(final String name){
        return String.format("successfully started %1$s", name);
    }

    public static String startError(final String name, final Throwable t){
        return String.format("failed to start %1$s: %2$s", name, t.getMessage());
    }

    public static String registering(final String name){
        return String.format("starting %1$s ...", name);
    }

    public static String registerSuccess(final String name){
        return String.format("successfully started %1$s", name);
    }

    public static String registerError(final String name, final Throwable t){
        return String.format("failed to start %1$s: %2$s", name, t.getMessage());
    }
}
