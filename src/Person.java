public class Person {
    String name = "홍길동";      // static 이 안 붙어 있으므로 인스턴스 필드
    String address = "ㄴㄴㄴ";
    boolean isVip;
    static int count;           // static 이 붙어  있으므로 클래스 필드

    static{                     // 클래스 필드는 static 블록에서 초기화 할수 있다.
        count = 10;
    }
    public void printNumber(){            // 인스턴스 메소드
        System.out.println("내 이름은" + name);
    }

    public static void printCount(){          // 클래스 메소드
        System.out.println("count : " + count );
    }
}
