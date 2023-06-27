package collectionFrameWork;
import  java.util.ArrayList;
import  java.util.Iterator;
import  java.util.Collection;

public class ListExam03 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
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
