package innheritance;

public class app {
    public static void main(String[] args) {
        maskin maskin1 = new maskin();
        car bil1 = new car();
        bil1.skruPå();
        maskin1.skruPå();
        bil1.vinduvisker();
        bil1.skruAv();
    }

}
