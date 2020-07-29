import javax.swing.*; 
import java.awt.*; 
/**
 * Write a description of class GuiWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class France
{
   // Page 47 of fundamentals of JAVA 
    public static void main(String[] args) {
        JFrame  theGui = new JFrame(); 
        theGui.setTitle("Fourth GUI Program"); 
        theGui.setSize(300,200); 
        theGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel1 = new JPanel(); 
        panel1.setBackground(Color.blue); 
        
         JPanel panel2 = new JPanel(); 
        panel2.setBackground(Color.white);
        
        JPanel panel3 = new JPanel(); 
        panel3.setBackground(Color.red);
        //JPanel panel4 = new JPanel(); 
        //panel4.setBackground(Color.white);
        
        Container pane = theGui.getContentPane(); 
        pane.setLayout(new GridLayout(1,3)); 
        pane.add(panel1); 
        pane.add(panel2); 
        pane.add(panel3); 
        //pane.add(panel4); 
       
        theGui.setVisible(true); 
    }
}