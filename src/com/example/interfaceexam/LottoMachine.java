package com.example.interfaceexam;

/*
1. 1~45까지 써있는 Ball 을 로또 기계에 넣는다.
2. 로또 기계에 있는 Ball을 섞는다.
3. 6개의 Ball을 꺼낸다.
 */

public interface LottoMachine {
    int MAX_BALL_COUNT = 45;
    int RETURN_BALL_COUNT = 6;
    public void setBalls(Ball[] balls);
    public void mix();     // 자기가 가지고 있는 볼들을 섞는다.
    public  Ball[] getBalls();        // 6개의 볼을 반환한다.
}
