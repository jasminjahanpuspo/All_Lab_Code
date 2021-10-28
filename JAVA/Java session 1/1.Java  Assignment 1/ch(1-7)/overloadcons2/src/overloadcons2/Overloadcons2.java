package overloadcons2;

public class Overloadcons2 {
    public static void main(String[] args) {
        Box mybox1=new Box(10,20,15);
       Box mybox2=new Box();
       Box mycube=new Box(7);
       
       Box myclone=new Box(mybox1);
       
       double vol;  
       
       vol=mybox1.volume();
        System.out.println("volume is "+vol);
        
        vol=mybox2.volume();
        System.out.println("volume is "+vol);
        
        vol=mycube.volume();
        System.out.println("volume is "+vol);
        
        vol=myclone.volume();
        System.out.println("volume is "+vol);
    }
    
}
class Box{
    double width,depth,height;  
    Box (Box ob){
        width=ob.width;
        depth=ob.depth;
        height=ob.height;
    }
    Box(double w,double h,double d){
        width=w;
        depth=d;
        height=h;
    }
    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }
    Box(double len)
    {
        width=height=depth=len;        
    }
    double volume(){        
        return width*depth*height;
    }
}

