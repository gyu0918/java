public class Bus2 extends Car2{
    public Bus2(){
        super(); // Bus2생성자에서 아무것도 없을시 자동적으로 super(); == 부모의 생성자를 자동으로 호출하는 함수 가 기입된다.
        // 이때 부모 생성자의 기본생성자가 없을 경우 자식 생성자에서는  super("sdfdsf") 이런식으로 직접 부모생성자를 호출해줘야한다 .
        System.out.println("Bus2() 생성자 호출");
    }
    // Car2의 상속을 받는데 이때 Car2는 abstract run 이라는 추상메소드가 있기 떄문에 '
    // 부모가 가지고 있는 추상메소드는 자식에서는 꼭 구현을 해줘야한다.
    // 이때 컨트롤 + 엔터 를 치면 Override mathod라고 있는데 이걸 선택하면 된다.

    @Override
    public void run() {
        System.out.println("후륜구동으로 움직인다.");
    }
}
