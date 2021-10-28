package map;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {

    HashMap<Integer,String> hm = new HashMap();
    TreeMap<Integer, String> hmm = new TreeMap();

    public Map() {
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
       

        String v = hm.get(2);

        System.out.println("v= " + v);

    }

    public static void main(String[] args) {
        new Map();
    }

}
