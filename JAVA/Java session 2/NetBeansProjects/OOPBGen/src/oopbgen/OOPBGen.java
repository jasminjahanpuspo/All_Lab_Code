/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopbgen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class OOPBGen {

    Vector<String> data = new Vector();

    ArrayList<Integer> list = new ArrayList();

    public OOPBGen() {
//        
//        data.add("hi");
//        data.add("Okay");
//       
//        System.out.println("total="+data.size());
//        System.out.println("second="+data.get(1));
//        

        list.add(2);
        list.add(0);
        list.add(545);

        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        } 
        Collections.sort(list);
        System.out.println("after sorted");
          for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
//        
        
    }

    public static void main(String[] args) {
        new OOPBGen();
    }

}
