package com.byshu.roc;


public interface Filter {


    void doFilter(Request request, Response response, FilterChain chain);


    class Request {}

    class Response {}
}
