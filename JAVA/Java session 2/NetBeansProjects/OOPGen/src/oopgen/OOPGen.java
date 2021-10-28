
package oopgen;

import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author ACL
 */
public class OOPGen {

//    HashMap<Integer, String> hm=new HashMap();
    TreeMap<Integer, String> hm=new TreeMap();
    
    public OOPGen() {
        hm.put(1, "first");
        hm.put(2, "second");
        hm.put(3, "third");
        
        
        String v= hm.get(2);
        System.out.println("v="+v);
        
        
        
    }
    public static void main(String[] args) {
        new OOPGen();
    }
    
}
