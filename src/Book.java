public class Book {
    private int price;
    private String title;
    // private한 필드에 접근하기 위해서는 getter setter 를 사용한다
    // spring 에서 setter getter == 프로퍼티(property) 라고 한다.

    public int getPrice() {
        return this.price;        // this는 내 자신 인스턴스를 참조하는 예약어
    }

    public void setPrice(int price) {    //지역변수 price변수
        this.price = price;               // 인스턴스 변수 == this.price
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
