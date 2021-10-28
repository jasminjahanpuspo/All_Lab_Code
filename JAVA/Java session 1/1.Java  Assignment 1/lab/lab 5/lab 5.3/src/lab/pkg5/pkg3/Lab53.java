package lab.pkg5.pkg3;

import java.util.Scanner;

public class Lab53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        for(int i=1; i<=12; i++){
            System.out.print("Teacher: ");
            
            String s=sc.nextLine();
            if(s.equals("Hello")){
                System.out.println("Students:hi");
            }
            if(s.equals("Students:hi")){
                System.out.println("Teacher:hmmm");
            }
            
            if(s.equals("Good Morning")){
                System.out.println("Students:Good Morning");
            }
            if(s.equals("How r u?")){
                System.out.println("Students:Fine.And u?");
            }
            if(s.equals("Students:Fine.And u?")){
                System.out.println("Students:We r also Fine.");
            }
            if(s.equals("Tday our class topic is contructor")){
                System.out.println("Students:its very difficult");
            }
            if(s.equals("No.Its easy")){
                System.out.println("Students:Really");
            }
            if(s.equals("Lets start")){
                System.out.println("Students:Ok.");
            }            
            if(s.equals("Today i will give u assignment.")){
                System.out.println("Students:Ok Teacher.As your wish.");
            }            
            if(s.equals("Submit it as early as possible.")){
                System.out.println("Students:last date of submission?");
            }
            if(s.equals("Tomorrow")){
                System.out.println("Students:Ok");
            }
            if(s.equals("BYE.see you tomorrow")){
                System.out.println("Students:Ok.");
            }            
        }
    }    
}
