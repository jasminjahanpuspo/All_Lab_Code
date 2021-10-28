package lab.pkg4.pkg4;

import java.util.Scanner;

public class Lab44 {
    public static void main(String[] args) {
         int[]d=new int[4];         
         d[0]=33;
         d[1]=11;
         
         String [] sa=new String [44];
         sa[0]="Good ";
         sa[1]="morning";
         
         Scanner sc=new Scanner(System.in);
         while(true){
             System.out.print("Please Enter:");
             String inp=sc.next();
             System.out.println("input: " + inp);
             
             if(inp.equals("exit")){
                 System.out.println("Bye");
                 break;
             }
         }        
    }    
}
