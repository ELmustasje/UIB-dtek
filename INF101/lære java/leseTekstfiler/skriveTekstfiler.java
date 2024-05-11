package leseTekstfiler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class skriveTekstfiler {
    public static void main(String[] args) {
        File fil = new File("C:/Users/thoma/THOMASALT/lære java/leseTekstfiler/tekst.txt");

        try (BufferedWriter bf = new BufferedWriter(new FileWriter(fil))) {
            bf.write("hei,");
            bf.newLine();
            bf.write("hva heter du?");
            bf.append("hva heter ddddd", 0, 0);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
