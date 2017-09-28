package com.yf.springboot.springbootwebdemo.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ws")
public class WsController {


    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage wiselyMessage) throws InterruptedException {
        Thread.sleep(1000);
        return new WiselyResponse("welcome:" + wiselyMessage.getName());
    }
}
