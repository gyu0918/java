package sec06.chap01.singleTon;

public class Main {
    public static void main(String[] args) {
//        Tab tab1 = new Tab();
//        Tab tab2 = new Tab();
//        Tab tab3 = new Tab();
//
//        System.out.println(tab1.getSetting().getVolume());
//
//        System.out.println("\n- - - - -\n");
//
//        tab1.getSetting().incVolume();
//        tab1.getSetting().incVolume();
//
//        System.out.println(tab1.getSetting().getVolume());
//
//        //  ⚠️ 각 인스턴스는 서로 다른 Setting 인스턴스를 가짐
//        //  - 설정값이 공유되지 못함
//        System.out.println(tab2.getSetting().getVolume());
//        System.out.println(tab3.getSetting().getVolume());
//    }

        //싱글톤 적용후
        //  공유시킬 인스턴스
        Setting setting = new Setting();

        //  💡 방법 1 : 생성자로 주입
        Tab tab1 = new Tab(setting);
        Tab tab2 = new Tab(setting);

        //  💡 방법 2 : setter로 주입
        Tab tab3 = new Tab();
        tab3.setSetting(setting);

        System.out.println(tab1.getSetting().getVolume());
        System.out.println(tab2.getSetting().getVolume());
        System.out.println(tab3.getSetting().getVolume());

        System.out.println("\n- - - - -\n");

        tab1.getSetting().incVolume();
        tab1.getSetting().incVolume();

        System.out.println(tab1.getSetting().getVolume());
        System.out.println(tab2.getSetting().getVolume());
        System.out.println(tab3.getSetting().getVolume());
    }
    //  🤔 인스턴스를 공유할 수 있게 되었지만 번거로움이 남음
    //  - 해당 인스턴스를 외부에서 주입해주어야 함
    //    - 협업 등의 경우 잘못 사용될 여지가 있음
    //  - 더 편리하고 안전한 방법은 없을까?
}
