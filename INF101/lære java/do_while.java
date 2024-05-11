import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
         * veldig dårlig loop, gjentar kode!
         * System.out.println("skriv et tall");
         * 
         * int verdi = scanner.nextInt();
         * 
         * while (verdi != 5) {
         * System.out.println("skriv et tall");
         * verdi = scanner.nextInt();
         * }
         * System.out.println("du fikk 5!");
         * loop med do while løkke, da kan du kjøre gjennom loppen en gang før du skjekker for boolean er true
         */
        int verdi;
        do {
            System.out.println("skriv et tall");
            verdi = scanner.nextInt();
        } while (verdi != 5);

    }
}
