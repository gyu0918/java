import sun.lwawt.macosx.CSystemTray;

public class VendingMachine {
    public String pushProduceButton(int menuId){
        System.out.println(menuId + "를 전달받았습니다");
        return "콜라";
    }
    public static void printVersion(){
        System.out.println("v 1.0");
    }
}
