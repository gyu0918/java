package collectionFrameWork;
import  java.util.ArrayList;
import  java.util.Iterator;
import  java.util.Collection;

public class ListExam03 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();  //이렇게 앞에는 인터페이스 타입!!! 뒤에 인스턴스만드는것만 클래스타입!!!
        collection.add("kkk");
        collection.add("sss");
        collection.add("qqe");

        System.out.println(collection.size());

        Iterator<String> iter = collection.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
