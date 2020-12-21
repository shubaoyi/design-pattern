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

    public static void main(String[] args) {
        ProcessorTemplate p1 = new HttpRequestProcessor();
        ProcessorTemplate p2 = new FtpRequestProcessor();
        p1.process();
        p2.process();
    }
}
