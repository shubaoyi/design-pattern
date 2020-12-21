package com.byshu.template;

public class FtpRequestProcessor extends ProcessorTemplate {

    @Override
    public void resolveRequest() {
        System.out.println("resolve ftp request..");
    }

    @Override
    public void dispatch() {
        System.out.println("dispatch ftp request..");
    }

    @Override
    public void sendResponse() {
        System.out.println("send ftp response..");
    }

}
