package com.example.interfaceexam;


import java.util.function.LongToDoubleFunction;

public class LottoMachineMain {
    public static void main(String[] args) {

        //여기서 주의 해야될게 ball instance 45개를 참조할수 있는 배열을 만들었다는 이야기이다.
        Ball[] balls = new Ball[45];
        for(int i = 0; i < 45; i++){
            balls[i] = new Ball(i + 1 );
        }


        // 바로 아래를 보면 LottoMachine 인스턴스가 생성되었다.
        LottoMachine lottoMachine = new LottoMachineImpl();  // 이렇게 인터페이스는 타입형태는 가능하다.
        LottoMachine.setBalls(balls);
        LottoMachine.mix();
        Ball[] result = LottoMachine.getBalls();
        for(int i = 0; i < result.length; i++){
            
        }
    }
}
