package com.idea4j.jvm.heap;

import java.util.Vector;

/**
 * 设置新生代大小
 * -Xmx11M -Xms11M -Xmn2M -xx:+PrintGCDetails
 * Created by markee on 2016/12/19.
 */
public class HeapXmn {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            byte[] b = new byte[1024 * 1024];
            v.add(b);
            if (v.size() == 3) {
                v.clear();
            }
        }
    }
}
