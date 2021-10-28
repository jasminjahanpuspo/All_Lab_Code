package lab.pkg2.pkg3;

public class Lab23 {
    public static void main(String[] args) {
        Car c=new Car();
        //c.move();
        c.stop();
        Car cc=new Car();
        Car.getname();
    }    
}
class Car{
    int speed=35;
    private void move(){
        System.out.println("Moving Forward.");
    }
    protected void stop(){
        move();
        System.out.println("Car stop.");
    }
    private void startfan(){
        System.out.println("Fan Start.");
    }
    private void startfan(int a){
        System.out.println("Fan Start "+a+" seconds ago.");        
    }
    static void getname(){
            System.out.println("This is car class.");
    }    
}
