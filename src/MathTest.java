public class MathTest {
    public static void main(String[] args) {
        int value = Math.abs(-5);
        System.out.println(value);

        int ss = MyMath.abs(-333333);
        System.out.println(ss);

        // 만약에 생성자가 아무것도 없을 경우 컴파일 할떄 자동으로 생성된다 -> public MyMath(){}
        // private MyMath(){} 생성자 일경우  인스턴스를 하지 못하게 된다.
    }
}
