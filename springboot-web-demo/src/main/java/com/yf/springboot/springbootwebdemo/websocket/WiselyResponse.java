package com.yf.springboot.springbootwebdemo.websocket;

/**
 * @author yunfeng
 * @version V.1.0
 * @title
 * @Desc
 * @create 2017-09-28 23:14
 **/
public class WiselyResponse {
    private String responseMessage;


    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    @Override
    public String toString() {
        return "WiselyResponse{" +
                "responseMessage='" + responseMessage + '\'' +
                '}';
    }
}
