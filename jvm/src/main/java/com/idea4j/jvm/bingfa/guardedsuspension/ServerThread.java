package com.idea4j.jvm.bingfa.guardedsuspension;

import com.idea4j.jvm.bingfa.future.FutureData;
import com.idea4j.jvm.bingfa.future.RealData;

/**
 * Created by markee on 2016/12/18.
 */
public class ServerThread extends Thread{
    private RequestQueue requestQueue;

    public ServerThread(RequestQueue requestQueue, String name) {
        super(name);
        this.requestQueue = requestQueue;
    }
    @Override
    public void run() {
        while (true) {
            final Request request = requestQueue.getRequest();

            final FutureData futureData = (FutureData) request.getResponse();

            RealData realData = new RealData(request.getName());

            futureData.setRealData(realData);

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName()+" handles" + request);

        }
    }
}
