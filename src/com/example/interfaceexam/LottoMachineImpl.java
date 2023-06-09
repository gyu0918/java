package com.example.interfaceexam;

//인터페이스를 구현하게 된다면 반드시 인터페이스가 가지고 있는 메소드를 오버라이딩 해야한다.
public class LottoMachineImpl implements LottoMachine{
    @Override
    public void setBall(Ball[] balls) {

    }

    @Override
    public void mix() {

    }

    @Override
    public Ball[] getBalls() {
        return new Ball[0];
    }
}
