package varargs4;

public class Varargs4 {
    static void vatest(int...v){
        System.out.println("vatest(int...): "+"args:"+v.length+"contests: ");
        for(int x:v)
            System.out.print(x+" ");
        System.out.println();
    }
    static void vatest(boolean...v){
        System.out.println("vatest(boolean...): "+"args: "+v.length+"contests: ");
        for(boolean x:v)
            System.out.print(x+" ");
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        vatest(1,2,3);
        //vatest();        
        vatest(true,false,false); 
    }    
}
