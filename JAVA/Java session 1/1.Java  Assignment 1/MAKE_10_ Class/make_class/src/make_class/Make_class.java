package make_class;

public class Make_class {
    public static void main(String[] args) {
           Myself m=new Myself();
           m.myself();
           m.hobby(); 
           
           Garden g=new Garden();
           g.garden();
           
           Flower f=new Flower();
           f.flower();
           
           Servants se=new Servants();
           se.work();
           
           Insects i=new Insects();
           i.insects();
           
           Place p=new Place();
           p.place();
        
           Total t=new Total();
           t.sum(5,5);          
         
           Rose r=new Rose();
           r.name="ROSE";
           r.count=5;
           r.rose();
           r.info();
           
           
           Sapla s=new Sapla();
           s.name="Sapla";
           s.count=5;           
           s.sapla();
           s.info();          
         
           Welcome w=new Welcome();
           w.welcome();
           
    }    
}
class Welcome{
    public void welcome(){
        System.out.println("U R welcome to my garden.");
    }
}

class Flower{
    public void flower(){
        System.out.println("There are many kind of flower.");
           hand();
    } 
    private void hand(){
        System.out.println("Dont touch them.");
    }
    
}
class generalflower{
    String name;
    int count;
    public void info(){
        System.out.println("This is a flower.");
    }
    public void same(){
        System.out.println("All are flowers.");
        System.out.println(count);
    }
}

class Rose extends generalflower{
    public void rose(){
        System.out.println(name);
        System.out.println(count);
        System.out.println("Rose is the queen of flowers.");
    }    
}
abstract class generalflowers{
    String name;
    int count;    
    public void info(){
        System.out.println("This is an flower.");
    }
    abstract public void sapla();
}
class Sapla extends generalflowers{
    public void sapla(){
        System.out.println(name);
        System.out.println(count);
        System.out.println("Sapla is our national flower.");
    }
}
class Servants{
    int s=10;
    public void work(){
        System.out.println("There are "+s+" servants");
    }
}
class Place{
    public void place(){
        System.out.println("It is situated in front of my reading room.");
    }    
}
class Insects{
    protected void insects(){
        System.out.println("Some insects are useful for flowers.");
    }
}

class Total{
    int sum=0;
    void sum(int a,int b){
        sum=a+b;
        System.out.println("Total Flowers="+sum);
    }
}
class Garden{    
    public void garden(){
        System.out.println("I have a garden.");        
    }
}

class Myself{
    void myself(){
        System.out.println("Hello.I am puspo.");
        System.out.println("I love flower.");
    }
    void hobby(){
        System.out.println("I like gardening.");
    }
}