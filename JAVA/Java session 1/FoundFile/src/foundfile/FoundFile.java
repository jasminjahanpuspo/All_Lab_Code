package foundfile;

public class FoundFile {
    public FoundFile(){
        String []s={"song.mp3,song.mp4,ami.pdf"};
        for(int i=0; i<s.length;i++){
            if(s[i].endsWith(".mp3")|| s[i].endsWith(".mp4")){
                System.out.println(s[i]+ "is media file");
                System.out.println("\n\n");
            }
            if(s[i].endsWith(".wav")||s[i].endsWith(".doc")){
                System.out.println(s[i]+ " is text file");
            }
        }
    }

    public static void main(String[] args) {
        new FoundFile();
    }

}
