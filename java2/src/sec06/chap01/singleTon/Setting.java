package sec06.chap01.singleTon;

public class Setting {
    private int volume = 5;

    public int getVolume() {
        return volume;
    }
    public void incVolume() { volume++; }
    public void decVolume() { volume--; }
}