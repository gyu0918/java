package com.example;

public class MyRunnableMain {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable() {            //interface는 인스턴스가 될수 없다.
            @Override
            public void run() {
                System.out.println("skdkdkddkdk");
            }
        };
        r.run();
    }
}
