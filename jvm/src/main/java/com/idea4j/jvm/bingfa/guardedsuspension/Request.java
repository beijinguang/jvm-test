package com.idea4j.jvm.bingfa.guardedsuspension;

import com.idea4j.jvm.bingfa.future.Data;

/**
 * Created by markee on 2016/12/18.
 */
public class Request {
    private String name;
    private Data response;
    public synchronized Data getResponse() {
        return response;
    }

    public synchronized void setResponse(Data response) {
        this.response = response;
    }
    public String getName() {
        return name;
    }

    public Request(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                '}';
    }
}
