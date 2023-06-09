package com.example.string;

public class StringExam {
    public static void main(StringExam[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        if (str1 == str2)            // 레퍼런스 타입의 == 는 값이 같은 값을 가지냐? 를 판단하는게 아니라 같은 것을 참조 하느냐? 이다!!
            System.out.println("str1 == str2!!");
        if (str1 == str3)
            System.out.println("str1 == str3!!");
        System.out.println(str1);
        System.out.println(str2);
    }
}
