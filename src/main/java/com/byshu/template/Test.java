package com.byshu.template;


public class Test {

    public static void main(String[] args) {
        ProcessorTemplate p1 = new HttpRequestProcessor();
        ProcessorTemplate p2 = new FtpRequestProcessor();
        p1.process();
        p2.process();
    }

}
