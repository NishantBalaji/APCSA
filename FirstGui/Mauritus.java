import javax.swing.*; 
import java.awt.*; 
/**
 * Write a description of class GuiWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mauritus
{
   // Page 47 of fundamentals of JAVA 
    public static void main(String[] args) {
        
        JFrame  theGui = new JFrame(); 
        theGui.setTitle("Second GUI Program"); 
        theGui.setSize(300,200); 
        theGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pane1 = new JPanel(); 
        pane1.setBackground(Color.red); 
        
        JPanel pane2 = new JPanel(); 
        pane2.setBackground(Color.blue);
        
        JPanel pane3 = new JPanel(); 
        pane3.setBackground(Color.orange);
        
        JPanel pane4 = new JPanel(); 
        pane4.setBackground(Color.green);
         // defaults to White 
        // add to the panels and arrange them we create a pane object 
        // whihc will manage the frame. Up to five panel's per pane. 
        // Organized as North, east, south, west and central. 
        // using the layout manager. 
        Container pane = theGui.getContentPane(); 
        pane.setLayout(new GridLayout(4,1));
        pane.add(pane1); 
        pane.add(pane2); 
        pane.add(pane3); 
        pane.add(pane4); 
         
        theGui.setVisible(true); 
    }
}