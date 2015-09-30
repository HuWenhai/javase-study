package com.edgar.vertx.rxjava.eventbus;

import com.edgar.vertx.util.Runner;
import io.vertx.rxjava.core.AbstractVerticle;
import io.vertx.rxjava.core.eventbus.EventBus;

public class PingPong extends AbstractVerticle {
    private static final String ADDRESS = "ping-address";

    // Convenience method so you can run it in your IDE
    public static void main(String[] args) {
        Runner.runClusteredExample(PingPong.class);
    }

    @Override
    public void start() throws Exception {
        EventBus eb = vertx.eventBus();
        eb.consumer(ADDRESS)
                .toObservable()
                .subscribe(message -> {
                    System.out.println("Received " + message.body());
                    message.reply("PONG");
                });
// Send a message every second
        vertx.setPeriodic(1000, v -> {
            eb.sendObservable(ADDRESS, "PING")
                    .subscribe(reply -> {
                        System.out.println("Received reply " + reply.body());
                    });
        });
    }
}