package com.idea4j.jvm.heap;

import java.util.Vector;

/**
 * 设置最大堆内存
 * -Xmx20M
 * Created by markee on 2016/12/19.
 */
public class HeapXmx {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            byte[] b = new byte[1024 * 1024];
            v.add(b);
            System.out.println(i + "M is allocated");
        }
        System.out.println("Max memory:" + Runtime.getRuntime().maxMemory()/1024/1024+"M");
    }
}
