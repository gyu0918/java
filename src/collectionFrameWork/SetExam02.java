package collectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam02 {
    public static void main(String[] args) {
        Set<MyData> mySet = new HashSet<>(); // 암기!! Hash가 나올경우 클래스에 equals 와 hashcode를 오버라이딩해야한다. 같이 만들게 되어 있음
        mySet.add(new MyData("kim", 500));
        mySet.add(new MyData("jung", 200));
        mySet.add(new MyData("kyu", 100));
        mySet.add(new MyData("kim", 500));
        //mySet에 있는 내용 모두 꺼내고 싶으면 Iterator을 사용한다.
        Iterator<MyData> iter = mySet.iterator();
        while (iter.hasNext()){
            MyData myData = iter.next();
            System.out.println(myData);
        }
    }
}

class MyData{
    private String name;
    private int value;

    public MyData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {                 //toString 이 꼭 필요하다 !
        return "MyData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}