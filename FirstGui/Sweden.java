import javax.swing.*; 
import java.awt.*; 
/**
 * Write a description of class GuiWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sweden
{
   // Page 47 of fundamentals of JAVA 
    public static void main(String[] args) {
        JFrame  theGui = new JFrame(); 
        theGui.setTitle("Fourth GUI Program"); 
        theGui.setSize(300,200); 
        theGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel5 = new JPanel(); 
        panel5.setBackground(Color.blue); 
        JPanel panel6 = new JPanel(); 
        panel6.setBackground(Color.yellow); 
        JPanel panel7 = new JPanel(); 
        panel7.setBackground(Color.blue);
        JPanel panel8 = new JPanel(); 
        panel8.setBackground(Color.blue);
        JPanel panel9 = new JPanel(); 
        panel9.setBackground(Color.yellow);
        
        JPanel pane20 = new JPanel(); 
        pane20.setBackground(Color.yellow);
        JPanel pane21 = new JPanel(); 
        pane21.setBackground(Color.yellow);
        JPanel pane22 = new JPanel(); 
        pane22.setBackground(Color.yellow);
        JPanel pane23 = new JPanel(); 
        pane23.setBackground(Color.blue);
        
        JPanel pane24 = new JPanel(); 
        pane24.setBackground(Color.yellow);
        JPanel pane25 = new JPanel(); 
        pane25.setBackground(Color.blue);
        JPanel pane26 = new JPanel(); 
        pane26.setBackground(Color.blue);
       
        
        Container pane = theGui.getContentPane(); 
        pane.setLayout(new GridLayout(3,4)); 
        pane.add(panel5);
        pane.add(panel6);
        pane.add(panel7);
        pane.add(panel8);
        pane.add(panel9);
        pane.add(pane20);
        pane.add(pane21);
        pane.add(pane22);
        pane.add(pane23);
        pane.add(pane24);
        pane.add(pane25);
        pane.add(pane26);
       
        theGui.setVisible(true); 
    }
}