package com.example.interfaceexam;
//불변 객체
public class Ball {
    private int number;
    public Ball(int number){
        this.number = number;
    }
    // 위와 같이 생성자를 통해 number을 초기화 해줬을 때 number을 외부에서 필요할때 어떤함수가 필요하다? getter!!!!

    public int getNumber() {
        return number;
    }
}
