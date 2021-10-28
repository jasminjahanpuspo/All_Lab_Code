package hidden;

import java.io.File;

public class Hidden {

    public Hidden() {
        try {
            File f = new File("D:\\audios");
            File[] folder = f.listFiles();
            for (int i = 0; i < folder.length; i++) {
                File Folder = folder[i];
                if (Folder.isHidden() == true) {
                    System.out.println(Folder.getName());
                }
            }

        } catch (Exception ex) {
            System.out.println("Cant read file");
        }
    }

    public static void main(String[] args) {
        new Hidden();
    }

}
