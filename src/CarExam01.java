public class CarExam01 {
    public static void main(String[] args){
        Bus b1 = new Bus();
        b1.run();
        b1.안내방송();

        Car car = new Bus();    // 버스는 자동차이다. 자동차의 기능만 써라!
        car.run();
        //car.안내방송(); 이 메소드는 사용할수 없다.
        System.out.println("-----------------");
        // 오버라이딩 부분
        Bus b2 = new Bus();
        Car car2 = new Bus();     //둘다 Bus 인스턴스를 참조 하고 있기 때문에 run 은 둘다 모두 "후륜 구동을 하다" 이다.
        b2.run();
        car2.run();
        // 꼭 암기 해야될 부분
        // 메소드가 오버라이딩 되면 무조건 자식의 메소드가 실행된다.

        Car b3 = new SuperCar();
        b3.run();
        SuperCar b4 = new SuperCar();
        b4.run();

        // 나는 오버라이딩 된것 말고 Bus의 기능을 쓰고 싶을 때 방법
        Car b5 = new Bus();
        Bus b6 = (Bus)b5;
        b6.안내방송();
    }
}
