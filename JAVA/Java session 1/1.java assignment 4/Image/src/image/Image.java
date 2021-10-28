package image;

import java.io.File;
import java.io.PrintWriter;

public class Image {

    public Image() {
        try {
            File f = new File("D:\\DCIM\\puspo");
            PrintWriter pw = new PrintWriter("hello.txt");
            File[] folder = f.listFiles();
            for (int i = 0; i < folder.length; i++) {
                File Folder = folder[i];
                String name = Folder.getName();
                if (name.endsWith(".jpg")) {
                    pw.println(name);
                }
            }
            pw.flush();
        } catch (Exception ex) {

        }

    }

    public static void main(String[] args) {
        new Image();
    }

}
