package lagreting;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class lese {
    public static void main(String[] args) {
        try (FileInputStream fi = new FileInputStream("C:\\Users\\thoma\\THOMASALT\\l\u00E6re java\\lagreting\\personer.bat")) {
            ObjectInputStream oi = new ObjectInputStream(fi);
            person person1 = (person) oi.readObject();
            oi.close();
            System.out.println(person1);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
