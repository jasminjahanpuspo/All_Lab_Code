package boxdemo5;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1=new Box();
       Box mybox2=new Box();
       double vol;
       
       mybox1.setdim(10,20,15);
       mybox2.setdim(3,6,9);
       
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
    void setdim(double w,double h,double d){
        width=w;
        depth=d;
        height=h;
    }
}
