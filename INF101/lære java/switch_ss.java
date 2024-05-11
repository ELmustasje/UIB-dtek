import java.util.Scanner;

public class switch_ss {
    public static void main(String[] args) {
        // switch veldig likt som if men kan være en mer effektiv måte, brukes med
        // string og int som oftest
        // case er de senarionene du vil dekke
        // default er det som skjer hvis ingen av case senarioene skjer
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        switch (command) {
            case "start":
                System.out.println("startet");
                break;
            case "stop":
                System.out.println("stoppet");
                break;

            default:
                System.out.println("hahahah");
        }

    }
}
