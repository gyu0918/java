public abstract class Car2 {
    public  Car2(){
        System.out.println("Car2() 생성자를 호출했습니다.");
    }

    //추상메소드 == 선언은 되어 있지만 블록안에 어떠한 것도 없는 메소드
    //run(); 이라는 메소드를 Car2의 상속을 받는 자손들에게 각각 구현하고 싶을떄 abstract쓴다.
    public abstract void run();
}
