package com.controller;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class RabbitmqConsumerController {

    @StreamListener(Sink.INPUT)
    public void receive(Message<String> message){
        System.out.println("消费者message: " + message);
    }
}
