public class StandardOutpPut {
    public void println(boolean b){
        System.out.println(b);
    }
    public void println(int i){
        System.out.println(i);
    }
    public void println(double d){
        System.out.println(d);
    }
    public void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        StandardOutpPut pl1 = new StandardOutpPut();

        pl1.println(1.12 );
    }
}
