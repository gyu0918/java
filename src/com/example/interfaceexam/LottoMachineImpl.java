package com.example.interfaceexam;

//인터페이스를 구현하게 된다면 반드시 인터페이스가 가지고 있는 메소드를 오버라이딩 해야한다.
public class LottoMachineImpl implements LottoMachine{
    private Ball[] balls;
    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;

    }
    // Math.random() 함수는 0.0 <= x < 1.0 사이의 숫자가 랜덤으로 나온다.
    @Override
    public void mix() {
        for(int i = 0; i < 10000; i++){
            int x1 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);
            int x2 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);
            if (x1 != x2){
                Ball tmp = balls[x1];
                balls[x1] = balls[x2];
                balls[x2] = tmp;
            }
        }

    }

    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[6];
        for(int i = 0; i < 6; i++){
            result[i] = balls[i];
        }
        return result;
    }
}
