package com.byshu.template;

public abstract class ProcessorTemplate {

    public final void process() {
        resolveRequest();
        dispatch();
        sendResponse();
    }

    public abstract void resolveRequest();

    public abstract void dispatch();

    public abstract void sendResponse();
}
