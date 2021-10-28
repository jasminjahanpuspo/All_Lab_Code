package ooplabb3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author ACL
 */
public class OOPLabB3 {

    public OOPLabB3() {

//        example1();
//        example2();
//        fileReadWriteExample();

        String search="noisy";
//        String search="okay";
        try {
            FileReader f = new FileReader("dict.txt");
            BufferedReader br = new BufferedReader(f); 
            String line;
            boolean isFound=false;
            while ((line = br.readLine())!=null) {
                String[] info=line.split("=");
                String word=info[0];
                String meaning=info[1];
                if(search.equals(word)) {
                    isFound=true;
                    System.out.println("Found: "+meaning);
                    break;
                } 
            } 
            if(!isFound) {
                System.out.println("Sorry the word "+search+" not in dictionary.");
            }
            br.close();
        } catch (Exception ex) {
            System.out.println("can't read file");
        }
        
    }

    public void fileReadWriteExample() {
        try {
//            File f = new File("hello.txt");
//            if (!f.exists()) {
//                f.createNewFile();
//            } 
            PrintWriter pw = new PrintWriter("hi.nadir");

            pw.println("This is line1");
            pw.println("line2");
            pw.flush();

            pw.close();
        } catch (Exception ex) {
            System.out.println("ERROR");
        }

        System.out.println("Now reading the file\n");
        try {
            FileReader f = new FileReader("mm.txt");
            BufferedReader br = new BufferedReader(f); 
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                
                
                System.out.println(line);
            } 
            br.close();
        } catch (Exception ex) {
            System.out.println("can't read file");
            ex.printStackTrace(); 
        }
    }

    public void example2() {
        try {
            File f = new File("D:\\Need for Speed Most Wanted");
            File[] files = f.listFiles();
            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                String name = file.getName();
//            System.out.println("fname="+file.getAbsolutePath()
//                    +" isDir="+file.isDirectory()+" isHidden="+file.isHidden()); 
                if (name.endsWith(".exe")) {
                    System.out.println(name);
                }
            }
        } catch (Exception ex) {
            System.out.println("Fatal Error: File Not Found");
        }
    }

    public void example1() {
        System.out.println("Welcome!");

        String[] s = {"song.mp3", "song2.mp4",
            "song32233.wav", "hello.mp3",
            "hello.exe", "book.pdf", "file.docx"};
        System.out.println("total=" + s.length);
        for (int i = 0; i < s.length; i++) {
            if (s[i].endsWith(".mp3") || s[i].endsWith(".wav") || s[i].endsWith(".mp4")) {
                System.out.println(s[i] + " is media file");
            } else if (s[i].endsWith(".pdf") || s[i].endsWith(".docx")) {
                System.out.println(s[i] + " is a doc file");
            } else if (s[i].endsWith(".exe")) {
                System.out.println(s[i] + " is a executable file");
            } else {
                System.out.println("Unknown file type");
            }
        }
    }

    public static void main(String[] args) {
        OOPLabB3 op = new OOPLabB3();
//        
//        Object obj=new Object();
//       
    }

}
