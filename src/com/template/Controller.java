package com.template;

/*
controller 의 종류가 여러개이다.
초기화   -- 같은 코드
실행     -- 다른 코드
마무리   -- 같은 코
 */
public abstract  class Controller {

    //protected 는 같은 package 이거나 상속 받을 경우 접근 가능하다.
    protected final void init(){                    // final ==  해당 메소드의 오버라이딩이 금지된다.
        System.out.println("초기화!!!");
    }
    protected final void close(){
        System.out.println("마무리!!!!");
    }
    protected abstract void run();              // 각각 run이 다르게 작동되어야 하므로 abstract로 다르게 해준다.

    // 내가 가지고 있는 메소드를 호출하는데 어떤 순서가 있다? == 템플릿 메소드 라고 한다.
    public void execute(){
        this.init();
        this.run();
        this.close();
    }
}
