public class VendingMachineMain {
    public static void main(String[] args){
        VendingMachine.printVersion();
        VendingMachine vm1 = new VendingMachine();

        String product = vm1.pushProduceButton(1000);
        VendingMachine.printVersion();
        vm1.printVersion();  // 이렇게 적으면 선배한테 혼난다. 위의 방식대로 <클레스명.매소드> 이런방식으로 쓴다.
        System.out.println(product);
    }
}


// compiLe 과정
// javac VendingMachine.java
// javac VendingMachineMain.java
// java VendingMachineMain           이런순서대로 컴파일 해주면된다.
// 면접에서 나올수 있는 질문!!
// VendingMachineMain 을 어디서 찾아서 실행할까요?
// 틀린 답) 현재 폴더에서 찾는다.
// 정답 )  CLASSPATH경로에서 VendingMachineMain클래스를  찾아서 실행시킨다.
//        이때 CLASSPATH=. 이라고 현재경로(. 이라고 표현 )에 CLASSPATH가 지정되어있다
// cf) perm이라는 메모리 영역에 읽어 들인 클래스정보를 저장한다. 클래스 정보랑 인스턴스랑은 다르다
//     클래스 정보가 PERM에 저장되면 JVM(java virtual machine)은 해당클래스가 static메소드를 가지고 있는지 인스턴스매소드를 가지고 있는지 알게된다.
//     그래서 jVM은 main메소드를 가장 먼저 찾는거 실행시키다.
//           이떄 stack에 메소드정보가 올라가게 된다.
// stack안에 stackEntry 라고 있는데 여기에 main매소드 안에 선언된 변수들이 저장된다. 이때 변수들을 local변수라고 한다.

// 꼭 기억해야될것!
// 메소드르안에 있는 변수 = 지역변수
// 지역변수-> 메소드가 실행될때 생성되었다가 메소드가 종료될떄 사라진다.
//          동시에 여러 메소드가 호출되어도 상관이 없다.
// 같은 메소드도 동시에 여러번 호출될수 있는데 이때 메소드 안에 선언된 변수들은 stack영억의 각각 다른영역에 저장된다.
// 단!!) 메소드에서 클래스안에 선언된 변수를 사용하는 경우에는 문제가 생길 수 있다.