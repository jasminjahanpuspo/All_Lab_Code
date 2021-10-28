package stringdemo2;

public class Stringdemo2 {
    public static void main(String[] args) {
         String strob1="first string";
        String strob2="second string";
        String strob3=strob1;
        
        System.out.println("length of strob1: "+strob1.length());
        System.out.println("char at index :"+strob1.charAt(3));
        
        if(strob1.equals(strob2))
            System.out.println("ob1==ob2");
        else
            System.out.println("ob1!=ob2");
        
        if(strob1.equals(strob3))
            System.out.println("ob1==ob3");
        else
            System.out.println("ob1!=ob3");
        
    }
    
}
