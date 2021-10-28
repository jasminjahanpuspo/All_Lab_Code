
package hellooopb;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class HelloOOPB {

    
    public static void main(String[] args) throws Exception {
        
        Robot r=new Robot();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        
        BufferedImage bi=r.createScreenCapture(
                new Rectangle(d.width,d.height));
        
        ImageIO.write(bi, "jpg", new File("s.jpg"));
        
        
        
        
    }
    
}
