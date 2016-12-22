package com.idea4j.jvm.stack;

/**
 * 设置线程栈
 * -Xss1M
 * Created by markee on 2016/12/19.
 */
public class Xss {
    public static class MyThread extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int i = 0;
        try{
            for (i = 0; i < 10000; i++) {
                new MyThread().start();
            }
        }catch (OutOfMemoryError e){
            System.out.println("count thread is"+i);
        }

    }
}
