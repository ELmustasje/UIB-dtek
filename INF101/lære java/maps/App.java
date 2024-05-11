package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        // hasmap - ikke sortert//
        Map<Integer, String> hashmap = new HashMap<Integer, String>();
        Map<Integer, String> linkedmap = new LinkedHashMap<Integer, String>();
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();

        testMap(hashmap);//kan være random rekkefølge ting kommer ut på
        testMap(linkedmap);//kommer ut i samme rekkefølge som den ble sutte inn i
        testMap(treeMap);//kommer i naturlig rekkeførlge fra key 0 og oppover.
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(1, "ape");
        map.put(4, "hund");
        map.put(6, "katt");
        map.put(2, "løve");
        map.put(10, "mus");

        for(Map.Entry<Integer,String> entry: map.entrySet()){
            int key = entry.getKey();
            String info = entry.getValue();

            System.out.println(key + " : "+ info);

        }
    }
}
