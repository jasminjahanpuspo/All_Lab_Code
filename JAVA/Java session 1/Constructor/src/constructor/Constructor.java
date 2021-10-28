package constructor;

public class Constructor {
    public static void main(String[] args) {
        Bsection bs=new Bsection(34);
    }
    
}
class Bsection{
    public  Bsection(){
        System.out.println("hello");
    }
    public  Bsection(int a){
        System.out.println("hello "+a+" Bsection");
    }
}