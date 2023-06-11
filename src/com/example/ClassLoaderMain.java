package com.example;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception{
        Bus b1 = new Bus();
        b1.a();
        // a() 메소드를 가지고 있는 클래스가 있다.
        // 이 클래스 이름이 아직 뭔지 모르겠다. 나중에 이클래스 이름을 알려주겠다.
        // a() 메소드를 실행 할수 있도록 코드를 작성해

        //ClassName 에 해당하는 클래스 정보를 CLASSPATH에서 찾는다. 이떄 정보가 없다면 error출력
        //위의 정보를 찾았을 떄 clazz가 그정보를 참조할수 있게 한다.
        String className = "com.example.Bus";       // 패키지 이름부터 써 준다.
        Class clazz = Class.forName(className);
        Object o = clazz.newInstance(); //-> new instance 를 생성한다.

        // 위의 3줄은 결국
        // Object o = new Bus();  이 식을 의미하는 것이다.
    }

}
