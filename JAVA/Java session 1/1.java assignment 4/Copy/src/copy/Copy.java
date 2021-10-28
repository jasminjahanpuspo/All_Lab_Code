package copy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Copy {

    public Copy() {
        try {
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter("hi.txt");
            while (true) {
                String s = sc.next();
                if (s.equals("exit")) {
                    break;
                }
                pw.println(s);
                pw.flush();

                FileReader fr = new FileReader("hi.txt");
                BufferedReader br = new BufferedReader(fr);
                PrintWriter pw2 = new PrintWriter("hello.txt");
                while (true) {
                    String line = br.readLine();
                    if (line == null) {
                        break;
                    }
                    pw2.println(line);                 

                } pw2.flush();
              
            }
             
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Copy();
    }

}
