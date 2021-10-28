package boxdemo6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1=new Box();
       Box mybox2=new Box();
       double vol;     
       
       
       vol=mybox1.volume();
        System.out.println("volume is "+vol);
        
        vol=mybox2.volume();
        System.out.println("volume is "+vol);
    }
    
}
class Box{
    double width,depth,height;
    double volume(){        
        return width*depth*height;
    }
    Box(){
        System.out.println("Constructing Box");
        width=10;
        depth=10;
        height=10;
    }
}
