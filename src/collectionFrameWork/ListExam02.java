package collectionFrameWork;
import  java.util.ArrayList;

//generic을 이용한 배열 선언!
public class ListExam02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("kim");
        list.add("jung");
        list.add("kyu");

        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
