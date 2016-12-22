package com.idea4j.jvm.bingfa.guardedsuspension;

import java.util.LinkedList;

/**
 * Created by markee on 2016/12/18.
 */
public class RequestQueue {
    private LinkedList queue = new LinkedList();
    public synchronized Request getRequest(){
        while (queue.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return (Request) queue.remove();
    }

    public synchronized void addRequest(Request request) {
        queue.add(request);
        notifyAll();
    }
}
