package lab.pkg3.pkg3;

public class Lab33 {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.leg=4;
        c.color="White";
        c.bark();
        c.info();
        c.jump();
        
        Dog d=new Dog();
        d.leg=4;
        d.color="Black";
        d.bark();
        d.info();
        d.run();        
    }    
}
class animal{
    String color;
    int leg;
    public void bark(){
        System.out.println("Barking");
    }
    public void info(){
        System.out.println(leg);
        System.out.println(color);        
    }
}

class Cat extends animal{
    public void bark(){
        System.out.println("Meau");
    }
    public void jump(){
            System.out.println("I like jumping");
    }  
}

class Dog extends animal{
    public void bark(){
        System.out.println("Geau");
    }
    public void run(){
            System.out.println("I like running");
    }  
}

