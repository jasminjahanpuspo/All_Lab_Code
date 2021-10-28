package mychat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyChat {

    public MyChat() {
        JFrame f = new JFrame("MyChat");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 400);
        f.setVisible(true);

        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(600, 400));
        jp.setBackground(Color.red);
        f.add(jp);

        JTextArea jt1 = new JTextArea();
        jt1.setPreferredSize(new Dimension(500, 250));
        jp.add(jt1);

        JTextField tf = new JTextField();
        tf.setPreferredSize(new Dimension(450, 50));
        jp.add(tf);

        JButton jb = new JButton("Send");
        jb.setBackground(Color.green);

        //jb.setPreferredSize(new Dimension(50, 30));
        jp.add(jb);
        
        button b=new button();
        jb.addActionListener(b);
      
      
        
        

        f.validate();
    }
    class button implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          String bn=e.getActionCommand();
          if(bn.equals("Send")){
              System.out.println("MSG send");
          }
        }
        
    }

    public static void main(String[] args) {
        new MyChat();
    }

}
