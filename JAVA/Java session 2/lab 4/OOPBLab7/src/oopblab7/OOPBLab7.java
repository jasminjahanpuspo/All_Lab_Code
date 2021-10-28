
package oopblab7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class OOPBLab7 {
    
    JFrame frame;
    
    public OOPBLab7(){
        frame=new JFrame("Copy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,480);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        
        JPanel jp= new JPanel();
        jp.setPreferredSize(new Dimension(500,300));
        jp.setBackground(Color.red);
        
        JTextField jt1=new JTextField();
        jt1.setPreferredSize(new Dimension(150,250));
        jt1.setBackground(Color.green);
        
        JTextField jt2=new JTextField();
        jt2.setPreferredSize(new Dimension(150,250));
        jt2.setBackground(Color.green);
        
        JButton jb=new JButton("Copy");
        jb.setPreferredSize(new Dimension(80,40));
        jb.setBackground(Color.blue);
        
       // String st=jt1.getText();
       // System.out.println(st);
        
       
        
        jb.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
         jt2.setText(jt1.getText());
        }
     });
        
        
        
        
        jp.add(jt1);
        jp.add(jb);
        jp.add(jt2);
        
        frame.add(jp);
        frame.validate();
    }

    
    public static void main(String[] args) {
        OOPBLab7 opb=new OOPBLab7();
    }
    
}
