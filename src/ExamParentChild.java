public class ExamParentChild {
    public static void main(String[] args){
        Child c1 = new Child();
        System.out.println(c1.i) ;
        c1.printI();
        System.out.println("---------------------");
        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.printI();
        System.out.println("---------------------");
        Parent p2 = new Child();
        System.out.println(p2.i);     // 필드는 타입인 Parent 를 따라가고
        p2.printI();                  //  메소드는 오버라이딩 될경우 자식 클래스의 메소드를 따른다.
    }
}
