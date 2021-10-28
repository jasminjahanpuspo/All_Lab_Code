package passarray;

public class PassArray {
    static void vatest(int v[]){
        System.out.println("args: "+v.length+"contests: ");
        for(int x:v)
            System.out.print(x+" ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int  n1[]={10};
        int  n2[]={1,2,3};
        int  n3[]={};
        
        vatest(n1);
        vatest(n2);
        vatest(n3);        
    }    
}


