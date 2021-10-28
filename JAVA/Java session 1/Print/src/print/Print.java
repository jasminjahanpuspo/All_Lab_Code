package print;

import java.io.File;
import java.io.PrintWriter;

public class Print {

    public Print() {
        File f = new File("hello.txt");
        try {
            PrintWriter pw = new PrintWriter("hello.txt");
            pw.print("line 1");
            pw.flush();
        } catch (Exception ex) {

        }

    }

    public static void main(String[] args) {
        new Print();
    }

}
