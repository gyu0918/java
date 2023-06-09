public class UserExam {
    public static void main(String[] args) {
        User use = new User("길동이", "dkfkskdk");
        System.out.println(use.getEmail());
        System.out.println(use.getPassword());

        // 생성자 오버로딩 예시
        User u2 = new User("홍길도", "123123", "아나@naver.com");
        System.out.println(u2.getPassword());
        System.out.println(u2.getEmail());
        System.out.println(u2.getName());

        //toString 을 이용해서 출력
        System.out.println(use);
    }
}
