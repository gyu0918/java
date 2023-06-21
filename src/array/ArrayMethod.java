package array;

import java.util.Arrays;
//java.lang 패키지의 클래스는 import 하지 않아도 된다. 사용가능

public class ArrayMethod {
    public static void main(String[] args) {
        int[] copyForm = {1,2,3};

        int[] copyTo = java.util.Arrays.copyOf(copyForm, copyForm.length);

        for(int c : copyForm)
            System.out.println(c);
        System.out.println("----------------");
        int[] copyTo2 = Arrays.copyOf(copyTo, 5);

        for(int d : copyTo2)
            System.out.println(d);
        if (copyForm != copyTo)
            System.out.println("sss");
        //int[] copyForm = copyTo  이렇게 지정해주면 두개의 배열은 같은 메모리를 가르킨다
        // 하지만 Arrays.copyOf 메소드를 사용하게되면 메모리에 새로운 배열을 하나만들고 거기에 copyForm의 내용을 복사해서 거기를 가르킨다
        // 즉 같지 않다.

        //copy를 범위로 할수도 있다.
        char[] copy3 = {'h','e','l','l','o'};

        char[] copy4 = java.util.Arrays.copyOfRange(copy3, 2, 5);
        for (char c : copy4)
            System.out.println(c);
    }
}
