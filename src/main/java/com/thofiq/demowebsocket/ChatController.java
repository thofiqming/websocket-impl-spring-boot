package com.thofiq.demowebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/message")
    @SendTo("/topic/greetings")
    public ChatContent publishMessage(ChatContent message) {
        return message;
    }
}
