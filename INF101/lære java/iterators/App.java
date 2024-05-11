package iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class App {
    
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("hund");
        ls.add("katt");
        ls.add("hest");

        ListIterator<String> it = ls.listIterator();

        while(it.hasNext()){
           
            if (it.next() == "katt"){
                it.remove();
                it.add("stygg katt");
            }
        }
        System.out.println(ls);

        urllibrary urls = new urllibrary();

        for(String url : urls){
            System.out.println(url);
        }
    }
}
