package boxdemo4;

public class BoxDemo4 {
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
}