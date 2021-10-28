package boxdemo3;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1=new Box();
       Box mybox2=new Box();
       
       mybox1.width=10;
        mybox1.depth=15;
        mybox1.height=20;
       
        mybox2.width=3;
        mybox2.depth=6;
        mybox2.height=9;
        
        mybox1.volume();
        mybox2.volume();
        
    }
    
}
class Box{
    double width,depth,height;
    void volume(){
        System.out.print("volume is ");
        System.out.println(width*depth*height);
    }
}
