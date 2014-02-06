package com.dreikraft.vertx.utils;

import org.junit.Assert;
import org.junit.Test;
import org.vertx.java.core.AsyncResult;
import org.vertx.java.core.Handler;
import org.vertx.java.core.buffer.Buffer;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.core.eventbus.ReplyException;
import org.vertx.java.core.eventbus.ReplyFailure;
import org.vertx.java.core.json.JsonArray;
import org.vertx.java.core.json.JsonObject;

/**
 * Created by jan_solo on 06.02.14.
 */
public class ReplyHandlerTest {

    @Test
    public void testReplyHandler() {
        new ReplyHandler<String>(new Handler<Message<String>>() {
            @Override
            public void handle(Message<String> stringMessage) {
                Assert.assertTrue(stringMessage.body() instanceof String);
            }
        }) {
            @Override
            public void handleFailure(ReplyException ex) {
                Assert.fail("should not be here");
            }
        }.handle(new DummyStringMessage());
    }

    @Test
    public void testReplyFailureHandler() {
        new ReplyHandler(new Handler<Message<String>>() {
            @Override
            public void handle(Message<String> stringMessage) {
                Assert.fail("should not be here");
            }
        }) {
            @Override
            public void handleFailure(ReplyException ex) {
                System.out.println(ex);
            }
        }.handle(new DummyFailureMessage());
    }

    class DummyFailureMessage implements Message<ReplyException> {

        @Override
        public String address() {
            return null;
        }

        @Override
        public ReplyException body() {
            return new ReplyException(ReplyFailure.RECIPIENT_FAILURE);
        }

        @Override
        public String replyAddress() {
            return null;
        }

        @Override
        public void reply() {

        }

        @Override
        public void reply(Object o) {

        }

        @Override
        public void reply(JsonObject jsonObject) {

        }

        @Override
        public void reply(JsonArray objects) {

        }

        @Override
        public void reply(String s) {

        }

        @Override
        public void reply(Buffer buffer) {

        }

        @Override
        public void reply(byte[] bytes) {

        }

        @Override
        public void reply(Integer integer) {

        }

        @Override
        public void reply(Long aLong) {

        }

        @Override
        public void reply(Short aShort) {

        }

        @Override
        public void reply(Character character) {

        }

        @Override
        public void reply(Boolean aBoolean) {

        }

        @Override
        public void reply(Float aFloat) {

        }

        @Override
        public void reply(Double aDouble) {

        }

        @Override
        public <T> void reply(Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Object o, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Object o, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(JsonObject jsonObject, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(JsonObject jsonObject, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(JsonArray objects, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(JsonArray objects, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(String s, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(String s, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Buffer buffer, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Buffer buffer, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(byte[] bytes, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(byte[] bytes, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Integer integer, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Integer integer, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Long aLong, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Long aLong, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Short aShort, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Short aShort, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Character character, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Character character, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Boolean aBoolean, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Boolean aBoolean, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Float aFloat, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Float aFloat, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Double aDouble, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Double aDouble, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public void fail(int i, String s) {

        }
    }

    class DummyStringMessage implements Message<String> {

        @Override
        public String address() {
            return null;
        }

        @Override
        public String body() {
            return "xxx";
        }

        @Override
        public String replyAddress() {
            return null;
        }

        @Override
        public void reply() {

        }

        @Override
        public void reply(Object o) {

        }

        @Override
        public void reply(JsonObject jsonObject) {

        }

        @Override
        public void reply(JsonArray objects) {

        }

        @Override
        public void reply(String s) {

        }

        @Override
        public void reply(Buffer buffer) {

        }

        @Override
        public void reply(byte[] bytes) {

        }

        @Override
        public void reply(Integer integer) {

        }

        @Override
        public void reply(Long aLong) {

        }

        @Override
        public void reply(Short aShort) {

        }

        @Override
        public void reply(Character character) {

        }

        @Override
        public void reply(Boolean aBoolean) {

        }

        @Override
        public void reply(Float aFloat) {

        }

        @Override
        public void reply(Double aDouble) {

        }

        @Override
        public <T> void reply(Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Object o, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Object o, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(JsonObject jsonObject, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(JsonObject jsonObject, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(JsonArray objects, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(JsonArray objects, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(String s, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(String s, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Buffer buffer, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Buffer buffer, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(byte[] bytes, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(byte[] bytes, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Integer integer, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Integer integer, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Long aLong, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Long aLong, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Short aShort, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Short aShort, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Character character, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Character character, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Boolean aBoolean, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Boolean aBoolean, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Float aFloat, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Float aFloat, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public <T> void reply(Double aDouble, Handler<Message<T>> messageHandler) {

        }

        @Override
        public <T> void replyWithTimeout(Double aDouble, long l, Handler<AsyncResult<Message<T>>> asyncResultHandler) {

        }

        @Override
        public void fail(int i, String s) {

        }
    }
}
