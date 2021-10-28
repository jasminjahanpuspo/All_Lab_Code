package explore;

import java.io.File;

public class Explore {

    public Explore() {

        File f = new File("F:\\");
        if (f.exists() && f.isDirectory()) {
            File[] folder = f.listFiles();
            System.out.println(f);
            RecursivePrint(folder, 0);
        }
    }

    static void RecursivePrint(File[] folder, int level) {
        for (File f : folder) {

            for (int i = 0; i < level; i++) {
                System.out.println("\t");
            }
            if (f.isFile()) {
                System.out.println("isFile\t" + f.getName());
            } else if (f.isDirectory()) {
                System.out.println("isDirectory\t" + f.getName());
                RecursivePrint(f.listFiles(), level + 1);
            }
        }

    }

    public static void main(String[] args) {
        new Explore();

    }

}
