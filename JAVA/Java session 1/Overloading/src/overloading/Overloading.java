package overloading;

public class Overloading {

    public static void main(String[] args) {
        Name n=new Name();
        n.puspo(34);
        n.puspo();
    }

}

class Name{
    //overloading starts
    public void puspo(int a){
        System.out.println("There are "+a+" flower");
    }
    public void puspo(){
        System.out.println("this is a flower");
    }
}
