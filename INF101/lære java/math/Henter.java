package math;

import java.util.Scanner;

public class Henter {
    Scanner input = new Scanner(System.in);

    public double hentTall() {
        System.out.println("skriv et desimaltall");
        float tall = input.nextFloat();
        return tall;
    }

}
