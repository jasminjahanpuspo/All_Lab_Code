
package pkgtry.pkgcatch;


public class TryCatch {

    
    public static void main(String[] args) {
       int a=10,b=0;
       try{
           int d=a/b;
           System.out.println(d);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    
}
