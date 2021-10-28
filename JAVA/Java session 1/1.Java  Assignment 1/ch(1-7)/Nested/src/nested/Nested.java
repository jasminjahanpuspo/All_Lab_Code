package nested;

public class Nested {
    public static void main(String[] args) {
        int i,j;
        for(i=10; i>1; i--)
        {
            for(j=0; j<i; j++)
            {
                System.out.print(".");                
            }
            System.out.println();
        }
    }    
}
