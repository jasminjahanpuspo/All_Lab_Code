package lab.pkg5.pkg1;

public class Lab51 {
    public static void main(String[] args) {
       University u=new University(4);
        Teacher t=new Teacher();
    }    
}

class Teacher{
    public Teacher(){
        System.out.println("Our teacher is very  nice");
        System.out.println("He is very kind");
    }
     public Teacher(int n){
        System.out.println("our teacher teaches us Java");
        System.out.println("This is very difficult language.");      
    }       
}

class University{
    public University(){
        System.out.println("I am a student.");
        System.out.println("My name is puspo");
    }
     public University(int n){
        System.out.println("NEUB");
        System.out.println("There are "+n+"teachers");        
    }
       
}


