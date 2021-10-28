package lab.pkg4.pkg3;

public class Lab43 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="World";
        System.out.println(s1+" "+s2);
        System.out.println("Length="+s1.length());
        System.out.println("Length="+s2.length());
       
        
        int a=34,b=33;
        System.out.println(a+" "+b);
        
         String ss=s1+" "+s2 + (a+b);
         System.out.println( ss );
         
        
         for(int i=0; i<s1.length(); i++)
         {
             char ch=s1.charAt(i);
             System.out.println(ch);
             int d=(int)ch;
             System.out.println("D="+d);
         }
         
         if(s1.startsWith("He")){
             System.out.println("YES");
         }
         
         if(s2.endsWith("W")){
             System.out.println("This ends with d.");
         }
         else
         {
             System.out.println("Nope.");
         }
         
          
         if(s1.equals(s2)){
             System.out.println("Same");
         }
         else
         {
             System.out.println("Not Same.");
         }
         
    }    
}
