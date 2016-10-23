package com.idea4j.jvm.SOFDemo;

/**
 * 创建线程导致内存溢出异常
 * VM Args: -Xss2M
 * Created by wangjinguang on 2016/10/23.
 */
public class JavaVMStackOOM {
    private void  dontStop() {
        while (true) {

        }
    }

    public void stackLeakByThread(){
        while (true) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
