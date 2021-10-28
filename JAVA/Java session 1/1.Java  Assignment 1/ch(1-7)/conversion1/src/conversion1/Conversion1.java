package conversion1;


public class Conversion1 {   
    public static void main(String[] args) {
        byte b;
        int i=257;
        double d=323.142;
        
        System.out.println("\nconversation of int to byte.");
        b=(byte)i;
        System.out.println("i and b "+i+" "+b);
        
        System.out.println("\nconversation of double to int.");
        i=(byte)d;
        System.out.println("d and i "+d+" "+i);
        
        System.out.println("\nconversation of double to byte.");
        b=(byte)i;
        System.out.println("d and b "+d+" "+b);
        
    }
    
}
