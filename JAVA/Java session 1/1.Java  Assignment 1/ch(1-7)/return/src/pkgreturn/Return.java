package pkgreturn;

public class Return {
    public static void main(String[] args) {
        boolean t=true;
        System.out.println("Before the retuen.");
        if(t)
        {
            return ;
        }
        System.out.println("This wont execute.");
    }    
}
