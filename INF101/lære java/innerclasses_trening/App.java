package innerclasses_trening;

public class App {
    public static void main(String[] args) {
        player p1 = new player();
        player.legs leg = p1.new legs();
        leg.move("left");
    }
}
