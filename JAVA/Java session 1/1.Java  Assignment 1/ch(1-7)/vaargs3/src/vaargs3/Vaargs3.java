package vaargs3;

public class Vaargs3 {
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
    
    static void vatest(String args ,int...v){
        System.out.println("vatest(string ,int...): "+args+v.length+"contests: ");
        for(int x:v)
            System.out.print(x+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        vatest(1,2,3);
        vatest("testing",10,20);        
        vatest("true,false,false"); 
    }    
}

