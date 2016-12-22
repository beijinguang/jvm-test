package com.idea4j.jvm.bingfa.masterworker;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by markee on 2016/12/16.
 */
public class Master {
    protected Queue<Object> workQueue = new ConcurrentLinkedQueue<Object>();

    protected Map<String, Thread> threadMap = new HashMap<>();

    protected Map<String, Object> resultMap = new ConcurrentHashMap<>();


    public boolean isComplete() {
        for (Map.Entry<String, Thread> entry : threadMap.entrySet()) {
            if (entry.getValue().getState() != Thread.State.TERMINATED) {
                return false;
            }
        }
        return true;
    }

    public Master(Worker worker, int countWorker) {
        worker.setWorkQueue(workQueue);
        worker.setResultMap(resultMap);
        for (int i = 0; i < countWorker; i++) {
            threadMap.put(Integer.toString(i),new Thread(worker,Integer.toString(i)));
        }
    }

    public void submit(Object obj){
        workQueue.add(obj);
    }

    public Map<String, Object> getResultMap() {
        return resultMap;
    }

    public void exectue(){
        for (Map.Entry<String,Thread> entry: threadMap.entrySet()) {
            entry.getValue().start();
        }
    }
}
