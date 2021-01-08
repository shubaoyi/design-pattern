package com.byshu.template;

public class HttpRequestProcessor extends ProcessorTemplate {

    @Override
    public void resolveRequest() {
        System.out.println("resolve http request..");
    }

    @Override
    public void dispatch() {
        System.out.println("dispatch http request..");
    }

    @Override
    public void sendResponse() {
        System.out.println("send http response..");
    }

}
