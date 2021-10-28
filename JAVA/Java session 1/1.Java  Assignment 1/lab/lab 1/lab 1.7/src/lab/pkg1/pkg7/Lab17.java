package lab.pkg1.pkg7;

public class Lab17 {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();        
        c.goforward();
        c.goforward(4);
        c.ignite();
        c.stop();
    }    
}
class Car{
    int wheel=4,speed=100,color=255;
    void start(){
        System.out.println("car start");
    }
    void stop(){
        System.out.println("car stop");
    }
    void ignite(){
        System.out.println("engine ignite");
    }
    void goforward(){
        System.out.println("Car moved ahead");
    }
    void goforward(int a){
        System.out.println("Car moved ahead "+a+" seconds");
    }
}
