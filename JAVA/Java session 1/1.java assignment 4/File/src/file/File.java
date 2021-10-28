package file;

public class File {

    public File() {
        String[] s = {"song.mp3", "song.mp4", "p.exe", "n.doc"};
        for (int i = 0; i < s.length; i++) {
            if (s[i].endsWith(".mp3") || s[i].endsWith(".mp4")) {
                System.out.println(s[i] + "is media file");
            } else if (s[i].endsWith(".exe")) {
                System.out.println(s[i] + "exe file");
            } else if (s[i].endsWith(".doc")) {
                System.out.println(s[i] + "docu ");
            }
        }
    }

    public static void main(String[] args) {
        new File();
    }

}
