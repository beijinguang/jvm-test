package com.idea4j.jvm.bingfa.guardedsuspension;

import com.idea4j.jvm.bingfa.future.FutureData;

/**
 * Created by markee on 2016/12/18.
 */
public class ClientThread extends Thread{

    private RequestQueue requestQueue;

    public ClientThread(RequestQueue requestQueue, String name) {
        super(name);
        this.requestQueue = requestQueue;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Request request = new Request("RequestID:" + i + " Thread_Name:" + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName()+"requests " +request);
            request.setResponse(new FutureData());
            requestQueue.addRequest(request);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ClientThread Name is " + Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getName() + " request end");
    }
}
