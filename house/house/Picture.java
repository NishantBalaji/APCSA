/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private boolean drawn;
    private boolean sunset;
    private Person person;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        person = new Person ();
        drawn = false;
        sunset = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            person.moveHorizontal (200);
            person.changeColor ("Blue");
            person.makeVisible();
            
            drawn = true;
        }
    }
    public void sunset ()
    {
        if(!sunset) {
            sun.slowMoveVertical(250);
            
            person.slowMoveHorizontal(-220);
            
            sunset = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
