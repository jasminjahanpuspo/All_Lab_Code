package lab.pkg5.pkg2;

import java.util.Scanner;

public class Lab52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            
            int sum=a+b;
        System.out.println("sum="+sum);
            
        }catch(Exception e){
            System.out.println("error.");
        }      
    }    
}
