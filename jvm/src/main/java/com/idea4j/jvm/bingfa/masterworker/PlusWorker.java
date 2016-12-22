package com.idea4j.jvm.bingfa.masterworker;

/**
 * Created by markee on 2016/12/16.
 */
public class PlusWorker extends Worker {
    @Override
    public Object handle(Object input) {
        Integer i = (Integer) input;
        return i*i*i;
    }
}
