
package lab5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LAB5 {
    JFrame frame;
    public LAB5(){
        frame=new JFrame("OOP B SECTION SOFTWARE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);
        
        frame.setLayout(new FlowLayout());
        JPanel jp=new JPanel();
        jp.setPreferredSize(new Dimension(400,400));
        jp.setBackground(Color.CYAN);
        frame.add(jp);
        
        
        jp.setLayout(new BoxLayout(jp,BoxLayout.X_AXIS));
        
        JPanel jp2=new JPanel();
        jp2.setPreferredSize(new Dimension(150,400));
        jp2.setBackground(Color.GRAY);
        frame.add(jp2);
        
        JLabel j1=new JLabel ("Name : ");
        j1.setPreferredSize(new Dimension(60,60));
        JTextField jt=new JTextField();
        jt.setPreferredSize(new Dimension(100,60));
        jp.add(j1);
        jp.add(jt);
        
        frame.validate();
      
        
        
        
        
    }
    

    public static void main(String[] args) {
       LAB5 l=new LAB5 ();
    }
    
}
