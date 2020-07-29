import javax.swing.*; 
import java.awt.*; 
/**
 * Write a description of class GuiWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Benin
{
   // Page 47 of fundamentals of JAVA 
    public static void main(String[] args) {
        JFrame  theGui = new JFrame(); 
        theGui.setTitle("Second GUI Program"); 
        theGui.setSize(300,200); 
        theGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pane1 = new JPanel(); 
        pane1.setBackground(Color.green);
        
        JPanel pane2 = new JPanel();
        pane2.setBackground(Color.yellow);
        
        JPanel pane3 = new JPanel();
        pane3.setBackground(Color.green);
        
        JPanel pane4 = new JPanel();
        pane4.setBackground(Color.red);
        
        
        
        
        
        
        Container pane = theGui.getContentPane(); 
        pane.setLayout(new GridLayout(2,2));
        pane.add(pane1); 
        pane.add(pane2);
        pane.add(pane3);
        pane.add(pane4);
        theGui.setVisible(true); 
    }
}