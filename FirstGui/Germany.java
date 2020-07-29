import javax.swing.*; // Gui Package for Java 
import java.awt.*;
/**
 * Write a description of class GuiWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Germany 
{
   // Page 47 of fundamentals of JAVA 
    public static void main(String[] args) {
        JFrame  theGui = new JFrame(); 
        theGui.setTitle("First GUI PRogram"); 
        theGui.setSize(300,200); 
        theGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pane1 = new JPanel();
        pane1.setBackground(Color.black);
        
        JPanel pane2 = new JPanel();
        pane2.setBackground(Color.red);
        
        JPanel pane3 = new JPanel();
        pane3.setBackground(Color.yellow);
        
        Container pane = theGui.getContentPane();
        pane.setLayout(new GridLayout(3,1));
        pane.add(pane1);
        pane.add(pane2);
        pane.add(pane3);
        
        theGui.setVisible(true); 
    }
}