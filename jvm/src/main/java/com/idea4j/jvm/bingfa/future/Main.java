package com.idea4j.jvm.bingfa.future;

/**
 * Created by markee on 2016/12/15.
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Data data = client.request("name");
        System.out.println("finished request");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(data.getResult());
    }
}
