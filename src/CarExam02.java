public class CarExam02 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1);
    }
}

// 부모타입의 변수로 자식인스턴스를 참조할 수 있다.
// 조상타입의 변수로 후손인스턴스를 참조할 수 있다.
// Car c1 = new Bus();
// Car c2 = new 이층버스();
// 기본적으로 Object 타입이