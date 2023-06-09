public class User {
    private String name;
    private String email;
    private String password;

    //생성자를 하나라도 만들게 되면 기본 생성자는 만들어지지 않는다 그래서 오류가 생기는거임 ->
    public User(String name, String password) {          //constructor == 생성자;
        this.name = name;
        this.password = password;
    }

    // 같은 이름의 생성자가 지금 위에 밑에 두개 있지만 파라미터가 다르다--> 생성자 오버로딩   이라고 한다.
    public User(String name, String password, String email시) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    //생성자들이 private라서 외부에서 접근을 하지 못한다. 따라서 getter setter이용한다.
    //생성자들을 외부로 리턴하는 함수 == getter  // 생성자들을 외부에서 바꿀수 있게 해주는 함수 == setter
    // 생성자들에 넣어준 값을 리턴하는 기능만 있는 객체를 == 불변 객체   라고 부른다. 중요!!!!!!!!!!!!!!
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    //toString을 이용해서 필드들을 리턴해준다.

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
