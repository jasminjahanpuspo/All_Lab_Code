package varargs;

public class Varargs {
    static void vatest(int...v){
        System.out.println("args: "+v.length+"contests: ");
        for(int x:v)
            System.out.print(x+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        vatest(10);
        vatest(1,2,3);
        vatest();   
    }    
}

