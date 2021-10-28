package toolbar;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Toolbar {

    JFrame j;

    public Toolbar() {
        j = new JFrame("ToolBar ");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(350,150);
        j.setVisible(true);

        JToolBar tool = new JToolBar();
        tool.setRollover(true);

        JButton button = new JButton("File");
        tool.add(button);
        tool.addSeparator();

        tool.add(new JButton("Edit"));
        tool.addSeparator();
        
        tool.add(new JButton ("Help"));
         tool.addSeparator();
         
         
         Container contentPane =j.getContentPane();
         contentPane.add(tool, BorderLayout.NORTH);
         
         
         JTextArea textArea =new JTextArea ();
         JScrollPane pane =new JScrollPane(textArea);
         contentPane.add(pane,BorderLayout.CENTER);
         j.validate();
         
    }

    public static void main(String[] args) {
        Toolbar t = new Toolbar();
    }

}
