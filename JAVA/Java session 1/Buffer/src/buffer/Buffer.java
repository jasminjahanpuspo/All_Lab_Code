package buffer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Buffer {

    public Buffer() {
        try {
            File f = new File("hello.txt");
            PrintWriter pw = new PrintWriter("hello.txt");
            pw.print("i am ");
            pw.flush();

            FileReader fr = new FileReader("hello.txt");
            BufferedReader br = new BufferedReader(fr);
            PrintWriter pw2 = new PrintWriter("hi.txt");
            while (true) {
                String line = br.readLine();
                pw2.print(line);
                if (line == null) {
                    break;
                }

            }

        } catch (Exception ex) {

        }
    }

    public static void main(String[] args) {
        new Buffer();
    }

}
