package text;

import java.io.File;

public class Text {

    public Text() {
        File f = new File("D:\\books");
        File[] folder = f.listFiles();
        for (int i = 0; i < folder.length; i++) {
            File Folder = folder[i];
            String name = Folder.getName();
            if (name.endsWith(".txt")) {
                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        new Text();
    }

}
