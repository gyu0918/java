package collectionFrameWork;
import  java.util.ArrayList;
public class ListExam01 {
    public static void main(String[] args) {
        //자료구조 객체들은 generic을 사용하지 않으면 Object타입으로 저장한다.
        ArrayList list = new ArrayList();
        list.add("kim");
        list.add("jung");
        list.add("kyu");
// LIst는 순서가 보장 
        String str1 = (String)list.get(0);
        String str2 = (String)list.get(1);
        String str3 = (String)list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
