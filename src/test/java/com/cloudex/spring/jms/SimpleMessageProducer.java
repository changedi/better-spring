package com.cloudex.spring.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import java.util.Date;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * Created by zunyuan.jy on 16/12/13.
 */
public class SimpleMessageProducer {

    @Autowired
    protected JmsTemplate producerTemplate;
    protected int numberOfMessages = 100;

    public void sendMessages() throws JMSException {

        StringBuilder payload = null;


        for (int i = 0; i < numberOfMessages; ++i) {


            payload = new StringBuilder();

            payload.append("Message [").append(i).append("] sent at: ").append(new Date());


            StringBuilder finalPayload = payload;
            int finalI = i;
            producerTemplate.send(session -> {

                TextMessage message = session.createTextMessage(finalPayload.toString());

                message.setIntProperty("messageCount", finalI);

                System.out.println("Sending message number [" + finalI + "]");

                return message;

            });

        }

    }

}
