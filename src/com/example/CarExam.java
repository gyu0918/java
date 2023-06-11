package com.example;

public class CarExam {
    //Car c1 = new Car();         //추상클래스는 인스턴스가 될수 없기 떄문이다.
    Car c1 = new Car(){
        @Override
        public void a() {
            System.out.println("이름없는 객체의 a()메소드 오버라이딩!!");
        };
     //   c1.a();
    };
}
