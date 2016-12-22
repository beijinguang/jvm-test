package com.idea4j.jvm.bingfa.masterworker;

import java.util.Map;
import java.util.Set;

/**
 * Created by markee on 2016/12/16.
 */
public class Main {
    public static void main(String[] args) {
        Master m = new Master(new PlusWorker(), 5);
        for (int i = 0; i < 5; i++) {
            m.submit(i);
        }
        m.exectue();
        int re = 0;
        Map<String,Object> resultMap = m.getResultMap();
        while (resultMap.size() > 0 || !m.isComplete()) {
            Set<String> keys = resultMap.keySet();
            String key = null;
            for (String k : keys) {
                key = k;
                break;
            }
            Integer i = null;
            if (key != null) {
                i = (Integer) resultMap.get(key);
            }
            if (i != null) {
                re+=i;
            }
            if (key != null) {
                resultMap.remove(key);
            }
        }
        System.out.println(re);
    }
}
