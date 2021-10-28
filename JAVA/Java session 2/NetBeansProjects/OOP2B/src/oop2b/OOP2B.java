
package oop2b;

public class OOP2B {
    public static void main(String[] args) {
//        System.out.println("hello world!");
//        Car cc=new Car();
////        cc.move();
//        cc.stop();
//        
//        Car c2=new Car();
//        
//        Car.getName();
        
        String name="something";
        System.out.println(name);
        
    }   
}

class Car {
    int speed=33;
    
    static void getName() {
        System.out.println("This is car class");
    }
    private void move() {
        System.out.println("moving forward");
    }
    protected void stop() {
        move();
        System.out.println("stopped");
    } 
    
    private void startFan() {
        System.out.println("fan started");
    }
     private void startFan(int n) {
        System.out.println("fan started");
    }
}




