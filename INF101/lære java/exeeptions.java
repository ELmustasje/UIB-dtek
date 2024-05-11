import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exeeptions {
   
    public static void main(String[] args) {
        File fil1 = new File("C:\\Users\\thoma\\THOMASALT\\l\u00E6re java\\leseTekstfiler\\tekst.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(fil1))){
            
        } catch (FileNotFoundException e){

        } catch (IOException e ){

        }
    }
    
}
