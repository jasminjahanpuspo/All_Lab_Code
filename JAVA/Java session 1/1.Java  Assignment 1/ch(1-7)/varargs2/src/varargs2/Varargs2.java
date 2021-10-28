package varargs2;

public class Varargs2 {
    static void vatest(String args ,int...v){
        System.out.println("args: "+v.length+"contests: ");
        for(int x:v)
            System.out.print(x+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        vatest("one arg",10);
        vatest("three arg",1,2,3);
        vatest("no args"); 
    }
    
}
