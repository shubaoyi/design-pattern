package com.byshu.roc;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public void doFilter(Filter.Request request, Filter.Response response) {
        if (index < filters.size()) {
            filters.get(index++).doFilter(request, response, this);
        }
    }

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

}
