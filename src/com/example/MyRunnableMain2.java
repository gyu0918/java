package com.example;

public class MyRunnableMain2 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("ddkdkdkdk");
            }
        };
        RunnableExecute runnableExecute = new RunnableExecute();
        runnableExecute.execute(myRunnable);

        // 이름없는 생성자를 바로 호출해서 리턴도 가능하다
        RunnableExecute runnableExecute1 = new RunnableExecute();
        runnableExecute.execute(new MyRunnable() {
            @Override
            public void run() {
                System.out.println("11111 ");
            }
        });
        System.out.println("-------------------간략화-------");
        // 더 간략하게 만들수 있다.
        RunnableExecute runnableExecute2 = new RunnableExecute();
        runnableExecute2.execute(()->{
                System.out.println("11111 ");
            }
        );
    }
}
