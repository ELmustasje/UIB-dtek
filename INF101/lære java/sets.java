import java.util.HashSet;
import java.util.Set;

public class sets {
    public static void main(String[] args) {
        //HashSet har ingen fast rekkefølge, kan stokke seg random
        //LinkedSet bruker fast rekkefølge
        //TreeSet bruker naturell rekkefølge, str: alfabetisk, int: lav-høy.

        Set<String> set1 = new HashSet<String>();
        set1.add("cat");
        set1.add("dog");
        set1.add("horse");

        //System.out.println(set1);//toStringen gir innholdet i settet
       // set1.add("cat"); //lar deg ikke legge til et duplikat
        //System.out.println(set1);

        //gå gjennom//
        for(String animal:set1){
            System.out.println(animal);
        }
        //finn i set//
        if (set1.contains("dog")){
            System.out.println("har hund");
        }
        //se om tom//
        if(set1.isEmpty()){
            System.out.println("er tom");
        }
        //intersection, finne hvilke element som er like mellom 2 set//
        Set<String> set2 = new HashSet<String>();
        set2.add("cat");
        set2.add("løve");
        //lager duplikat
        Set<String> intersection = new HashSet<String>(set1);
       
        intersection.retainAll(set2);//beholder bare de element som er i intersection og set 2

        
        //forskjell mellom to sett//

        Set<String> forskjel = new HashSet<String>(set1);
        forskjel.removeAll(set2);//fjerner alt som er likt med set2
        System.out.println(forskjel);
        
        /*når bruke set:
        - finne ting i sett

        */
    }
}
