package iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class urllibrary implements Iterable<String> {
    LinkedList<String> urls = new LinkedList<String>();
    
    
    public urllibrary(){
        urls.add("www.google.com");
        urls.add("www.facebook.com");
        urls.add("www.netflix.com");
    }


    @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }
    
}
