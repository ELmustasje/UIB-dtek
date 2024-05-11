package lagreting;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class lagre {
    public static void main(String[] args) {
        person per = new person(3, "per");
        try (FileOutputStream in = new FileOutputStream("C:\\Users\\thoma\\THOMASALT\\l\u00E6re java\\lagreting\\personer.bat")) {
            ObjectOutputStream ob = new ObjectOutputStream(in);
            ob.writeObject(per);
            ob.close();
                
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
