public class BookExam {
    public static void main(String[] args){
        Book b1 = new Book();
       // b1.price = 1000;
       // System.out.println(b1.price);       // 이렇게 필드를 직접적으로 접근 하는 것은 좋지 못하다. ->private
        b1.setPrice(50000);
        System.out.println(b1.getPrice());
        b1.setTitle("즐거운 java여행");
        System.out.println(b1.getTitle());
    }
}
