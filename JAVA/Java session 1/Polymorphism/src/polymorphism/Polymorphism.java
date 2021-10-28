package polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        Home h=new Home();
        h.room(3);//polymorphism
        h.room();//polymorphism

    }

}
class Home{
    public void room(){
        System.out.println("This is my bed room");
    }
    public void room(int a){
        System.out.println("There are " +a+ " bed room");
    }
}
