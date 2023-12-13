package sec06.chap01.singleTon;

//싱글톤 적용전
//public class Tab {
//    private Setting setting = new Setting();
//
//    public Setting getSetting() {
//        return setting;
//    }
//}

//싱글톤 적용후
public class Tab {
    private Setting setting = null;

    public Tab() {}

    //  ⭐️ 두 번째 생성자
    public Tab(Setting setting) {
        this.setting = setting;
    }

    //  ⭐️ 세터
    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    public Setting getSetting() {
        return setting;
    }
}