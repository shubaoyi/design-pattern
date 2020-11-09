package com.byshu.roc;

/**
 * 模拟servlet filter
 */
public class Test {

    static class CharsetFilter implements Filter {

        @Override
        public void doFilter(Request request, Response response, FilterChain chain) {
            System.out.println("decode request..");
            chain.doFilter(request, response);
            System.out.println("encode response..");
        }
    }

    static class LogFilter implements Filter {

        @Override
        public void doFilter(Request request, Response response, FilterChain chain) {
            System.out.println("log request..");
            chain.doFilter(request, response);
            System.out.println("log response..");
        }
    }


    public static void main(String[] args) {
        Filter charsetFilter = new CharsetFilter();
        Filter logFilter = new LogFilter();

        FilterChain chain = new FilterChain();
        chain.addFilter(logFilter).addFilter(charsetFilter);

        chain.doFilter(new Filter.Request(), new Filter.Response());
    }
}
