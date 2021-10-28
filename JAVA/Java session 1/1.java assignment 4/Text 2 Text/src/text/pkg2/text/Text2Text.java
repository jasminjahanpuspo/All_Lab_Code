package text.pkg2.text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Text2Text {

    public Text2Text() {
        try {

            PrintWriter pw = new PrintWriter("Text1.txt");
            pw.println("hi");
            pw.println(" i am a girl and doinng ");
            pw.flush();

            FileReader fr = new FileReader("Text1.txt");
            BufferedReader br = new BufferedReader(fr);
            PrintWriter pw2 = new PrintWriter("text2.txt");

            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                pw2.println(line);
                pw2.flush();

            }

        } catch (Exception ex) {
            System.out.println("sorry");
        }

    }

    public static void main(String[] args) {
        new Text2Text();

    }

}
