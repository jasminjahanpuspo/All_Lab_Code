package boxdemo7;

public class BoxDemo7 {
    public static void main(String[] args) {
       Box mybox1=new Box(10,20,15);
       Box mybox2=new Box(3,6,9);
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
    Box(double w,double h,double d){
        width=w;
        depth=d;
        height=h;
    }
}
