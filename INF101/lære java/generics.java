import java.util.ArrayList;
import java.util.HashMap;

class ting {

}
public class generics {
    public static void main(String[] args) {
        /////////før java 5///////
        ArrayList frukt = new ArrayList();
        frukt.add("epple");
        frukt.add("appelsin");
        frukt.add("banan");

        String frukt1 = (String)frukt.get(1);

        System.out.println(frukt1);

        ///////moderne java///////7
        ArrayList<String> dyr = new ArrayList<String>();

        dyr.add("kat");
        dyr.add("hund");
        dyr.add("hest");

        String dyr1 = dyr.get(1);

        System.out.println(dyr1);

        ///////kan ha flere ting////////
        HashMap<Integer,String> maskiner = new HashMap<>(0, 0);
        
        ///////kan bruke egne klasser/////
        ArrayList<ting> ting = new ArrayList<>();

    }
}
