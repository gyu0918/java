import java.util.PropertyResourceBundle;

public class PersonTest {
    public static void main(String[] args) {
       // Person p1;    // 이렇게 선언한다면 p1 = null 이다.
       Person p1 = new Person();

        System.out.println(p1.isVip);
        System.out.println(p1.address.length() );
        System.out.println(p1.name);
    }
}
