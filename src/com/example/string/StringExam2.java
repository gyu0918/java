package com.example.string;

public class StringExam2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        if (str1.equals(str2)){               // equls 함수는 값이 같은지 판별할떄 쓰인다.
            System.out.println("str1 == str2 ");
        }
        // String은 불변 class 이다
    }
}
