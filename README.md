vertx-utils
===========

Various utilities and helpers useful, when developing applications and modules with vert.x.

Utility classes
---------------

### ReplyHandler<T>

A wrapper for vert.x event bus message reply handlers, that nicely handles ReplyExceptionMessages. This comes 
particularly useful, when dispatching a message on the event bus without a timeout  (send(...)) and the corresponding
message handler might call message.fail(..) to notify the sender about a failed execution.

It utilizes the type erasure feature of the java runtime to process arbitrary types of messages, but compiles 
without warnings.

Here is how to use it:

```
vertx.eventBus().send("address", "message", new ReplyHandler<String>(new Handler<Message<String>>() {
  @Override
  public void handle(Message<String> stringMessage) {
    ...
  }
}) {
  @Override
  public void handleFailure(ReplyException ex) {
    ...
  }
});
```
