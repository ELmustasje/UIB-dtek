//for å auto impotere shift + alt + o
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        //for å få input på vi bruke Scanner klassen, Scanner "navn på variabel" = new Scanner(system.in)
        //her lager vi et nytt objekt med new Scanner(system.in)
        Scanner input = new Scanner(System.in);
       
        //promt bruker får opp
        System.out.println("hva heter du?");

        //venter til brukeren har gitt input
        //input typer, hvilke type input du forventer å få
        //nextInt(), et heltall 32bit
        //nextLine(), en string
        //nextBoolean(), true / false
        //nextByte(), 8bit 
        //nextDouble(), 64bit 
        //nextFloat(), 32bit 
        //nextLong(), stort heltal
        //nextShort(), lite heltal
        String line = input.nextLine();
        
        //utskriften etter inputen
        System.out.println("hei " + line);
        input.close();
    }
}
