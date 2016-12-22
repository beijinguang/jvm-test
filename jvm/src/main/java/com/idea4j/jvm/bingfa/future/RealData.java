package com.idea4j.jvm.bingfa.future;

/**
 * Created by markee on 2016/12/15.
 */
public class RealData implements Data {
    protected final String result;

    public RealData(String queryStr) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            sb.append(queryStr);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        result = sb.toString();
    }

    @Override
    public String getResult() {
        return result;
    }
}
