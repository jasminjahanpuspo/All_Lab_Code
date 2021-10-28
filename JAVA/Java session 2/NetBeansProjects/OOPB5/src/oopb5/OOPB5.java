/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oopb5;

/**
 *
 * @author ACL
 */
public class OOPB5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String search="hi";
        String s="hello world=how are you";
        s=s.toUpperCase();
        String[] info=s.split("=");
        String word=info[0];
        String m=info[1];
        
        System.out.println("count="+info.length);
        
        System.out.println("second="+info[1]);
        
        s=s.toUpperCase();
        
    }
    
}
