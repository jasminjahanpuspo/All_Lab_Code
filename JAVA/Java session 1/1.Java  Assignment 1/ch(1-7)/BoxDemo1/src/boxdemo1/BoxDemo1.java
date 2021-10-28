package boxdemo1;

public class BoxDemo1 {
    public static void main(String[] args) {
        Box mybox=new Box();
        double vol;
        
        mybox.width=10;
        mybox.depth=15;
        mybox.height=20;
        
        vol=mybox.width*mybox.height*mybox.depth;
        
        System.out.println("volume is "+vol);
        
    }    
}
class Box{
    double width,depth,height;
}
