package stokk_kortstokk;

import java.util.ArrayList;
import java.util.Random;

public class kortStokk {
    private String[] type = { "hjerter", "ruter", "kløver", "spar" };
    private int[] tall = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private String[] bilde = { "ace", "knekt", "dronning", "konge" };
    public ArrayList kort = lagKort(type, tall, bilde);

    private ArrayList lagKort(String[] type, int[] tall, String[] bilde) {
        ArrayList<Object> kort = new ArrayList<Object>();
        for (String i : type) {
            for (int t : tall) {
                kort.add(i + " " + t);
            }
            for (String g : bilde) {
                kort.add(i + " " + g);
            }
        }
        return kort;
    }

    public void stokk(){
        ArrayList<Object> stokketkort = new ArrayList<Object>();
        stokketkort = (ArrayList<Object>) this.kort.clone();
        for (int i = 0; i < kort.size();i++){
            Random ran = new Random();
            int nr = ran.nextInt(0,51);
            Object kort = this.kort.get(i);
            stokketkort.set(nr,(String)kort);
        }
        this.kort = (ArrayList<Object>) stokketkort.clone();
    }
}
