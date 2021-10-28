package pkgchar;

import java.util.Scanner;

public class Char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = sc.next();
        if (s.equals("s2")) {
            System.out.println("same");
        }
        if (s.startsWith("H")) {
            System.out.println("yes");
        }
        if (s.endsWith("O")) {
            System.out.println("No");
        }
        System.out.println("S=" + s.length());
        int a = 34, b = 1;
        String ss = s + " " + s2 + " " + (a + b);
        System.out.println(ss);

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            System.out.print(ch);
            int d=(int)ch;
            System.out.println(" "+d);
        }
    }

}
