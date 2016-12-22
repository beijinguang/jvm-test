package com.idea4j.jvm.bingfa.future;

/**
 * Created by markee on 2016/12/15.
 */
public class FutureData implements Data {

    protected RealData realData = null;

    protected  boolean isReady = false;
    @Override
    public synchronized String getResult() {
        while (!isReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return realData.result;
    }

    public synchronized void setRealData(RealData realData) {
        if (isReady) {
            return;
        }
        this.realData = realData;
        isReady = true;
        notify();
    }


}
