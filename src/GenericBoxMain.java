public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.set("sssss");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

        //genericBox.set(new Integer(5)); // genericBox에서 <>여기 안에 있는 부분이 string으로 선언되었기 때문에 숫자는 오지 못한다.
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.set(12);
        Integer value = intBox.get();
        System.out.println(value);
    }
}
