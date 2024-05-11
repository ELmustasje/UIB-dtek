package leseTekstfiler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class lese_tekstfiler1 {/// letteste måten å lese filer på
    public static void main(String[] args) throws IOException  {
    vanskeliglest v = new vanskeliglest();
}
}
class lettlest {// letteste måten
    public lettlest()throws FileNotFoundException {
        String fil1 = "C:/Users/thoma/THOMASALT/lære java/leseTekstfiler/tekst.txt";

        File fil = new File(fil1);

        Scanner in = new Scanner(fil);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(line);
        }
        in.close();
    }
}
class vanskeliglest{//litt vanskeligere måte men har mer variasjon
    public vanskeliglest() throws IOException{
        File fil = new File("l\u00E6re java\\leseTekstfiler\\tekst.txt");

        FileReader fr = new FileReader(fil);
        BufferedReader br = new BufferedReader(fr);
        String line;
        try {
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            // TODO: handle exception
        }
        
    }
}

