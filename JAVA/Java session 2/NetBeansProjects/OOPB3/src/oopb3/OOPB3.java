/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopb3;

import java.util.Scanner;

 
public class OOPB3 {

    public static void main(String[] args) {
        String s = "Hello";
        String s2 = "Hello";
        int a = 434;
        int b = 33;
        System.out.println(a + "" + b);
//        String ss=s+" "+s2+" "+(a+b);
//        System.out.println(ss);
        System.out.println("length=" + s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
            int d = (int) ch;
            System.out.println("d=" + d);
        }

        if (s.startsWith("He")) {
            System.out.println("yes. it is");
        }
        if (s2.endsWith("B")) {
            System.out.println("this is ended with B");
        } else {
            System.out.println("Nope.");
        }
        if (s.equals(s2)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        int[] d = new int[4];
        d[0] = 33;
        d[1] = 11;
        String[] sa = new String[44];
        sa[0] = "Hokyo";
        sa[1] = "Every";

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter: ");
            String inp = sc.next();
            System.out.println("input=" + inp);
            if(inp.equals("exit")) {
                System.out.println("Good Bye!");
                break;
            }
        }

    }

}
