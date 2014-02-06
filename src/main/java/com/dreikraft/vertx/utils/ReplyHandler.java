package com.dreikraft.vertx.utils;

import org.vertx.java.core.Handler;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.core.eventbus.ReplyException;

/**
 * A wrapper for vert.x event bus message reply handlers, that nicely handles ReplyExceptionMessages. This is
 * particularly
 * useful, when using a reply handler without timeout (send(...)) and the message handles calls fail(..) on the
 * message. It utilizes the type erasure feature of the java runtime to process arbitrary types of messages, but
 * compiles without warnings.
 *
 * @author jansolo (jan.illetschko@3kraft.com)
 */
public abstract class ReplyHandler<T> implements Handler<Message<T>> {

    private Handler<Message<T>> wrapped;

    /**
     * Wraps a message reply handler.
     * @param wrapped the message handler to wrap
     */
    public ReplyHandler(final Handler<Message<T>> wrapped) {
        this.wrapped = wrapped;
    }

    /**
     * Handles the reply message. If it is a message of the given type, the reply will be delegated to the wrapped
     * handler. If the message contains a ReplyException instead of the given type,
     * it will call handleFailure(ReplyException ex)
     *
     * @param message a message with an arbitrary type
     */
    @Override
    public void handle(Message message) {
        if ((message.body()) instanceof ReplyException) {
            handleFailure((ReplyException)message.body());
        } else {
            wrapped.handle(message);
        }
    }

    /**
     * Handles ReplyExceptions passed by the message handler (message.fail()). Needs to be overriden by the concrete
     * implementation.
     *
     * @param ex a ReplyException instance
     */
    public abstract void handleFailure(final ReplyException ex);
}
