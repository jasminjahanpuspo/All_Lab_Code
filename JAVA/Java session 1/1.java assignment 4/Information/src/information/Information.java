package information;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Information {

    public Information() {
        try {
            Scanner sc = new Scanner(System.in);

            PrintWriter pw = new PrintWriter("puspo.txt");
            while (true) {
                String a = sc.nextLine();
                if (a.equals("exit")) {
                    break;
                }
                pw.println(a);
            }
            System.out.println("\n");

            pw.flush();
            pw.close();

//            FileReader fr = new FileReader("puspo.txt");
//            BufferedReader br = new BufferedReader(fr);
//
//            while (true) {
//                String line = br.readLine();
//                if (line == null) {
//                    break;
//                }
//
//            }
//            br.close();
        } catch (Exception ex) {
            System.out.println("sorry");
        }
    }

    public static void main(String[] args) {
        new Information();
    }

}
