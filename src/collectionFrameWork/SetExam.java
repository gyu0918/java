package collectionFrameWork;
import  java.util.*;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();   //순서에 대해서 보장해주지 않는다
        boolean flag1 = set.add("ddd");
        boolean flag2 = set.add("fff");
        boolean flag3 = set.add("asdf");
        boolean flag4 = set.add("asdf");
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);      //중복된 값은 flase가 뜬다

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
