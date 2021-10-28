package boxdemo2;

public class BoxDemo2 {
    public static void main(String[] args) {
       Box mybox1=new Box();
       Box mybox2=new Box();
       double vol;
        
        mybox1.width=10;
        mybox1.depth=15;
        mybox1.height=20;
       
        mybox2.width=3;
        mybox2.depth=6;
        mybox2.height=9;
        
        vol=mybox1.width*mybox1.depth*mybox1.height;
        System.out.println("volume is "+vol);
        
        vol=mybox2.width*mybox2.depth*mybox2.height;
        System.out.println("volume is "+vol);
    }
    
}
class Box{
    double width,depth,height;
}
