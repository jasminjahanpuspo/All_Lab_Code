package dic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Dic {

    public Dic() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            String search = sc.next();
            if (search.equals("exit")) {
                break;
            }
            try {
                FileReader f = new FileReader("dict.txt");
                BufferedReader br = new BufferedReader(f);
                String line;
                boolean isFound = false;
                while ((line = br.readLine()) != null) {
                    String[] info = line.split("=");
                    String word = info[0];
                    String meaning = info[1];
                    if (search.equals(word)) {
                        isFound = true;
                        System.out.println("Found: " + meaning);
                        break;
                    }
                }
                if (!isFound) {
                    System.out.println("Sorry the word " + search + " not in dictionary.");
                }
                br.close();
            } catch (Exception ex) {
                System.out.println("can't read file");
            }
        }

    }

    public static void main(String[] args) {
        new Dic();
    }

}
