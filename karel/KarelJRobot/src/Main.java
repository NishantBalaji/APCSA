package KarelJRobot.src;

/** 
 * main.java
 *
 * Title:			Chapter 2
 * Description:	    Karel races hurdle race 1 mile
 * @author			Hein Htat
 * @version			10-17-05
 */

import kareltherobot.*;

public class Main implements Directions {

	public static void task() {
		Robot karel = new Robot (5,4,East, 0);
		karel.move ();
		karel.move ();
		karel.move ();
		karel.turnLeft();
		karel.move ();
		karel.move ();
		karel.move ();
		karel.turnLeft();
		karel.move ();
		karel.move ();
		karel.move ();
		karel.turnLeft();
		karel.move ();
		karel.move ();
		karel.move ();
		karel.turnLeft();
		karel.turnOff();
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(50);
		World.readWorld("world27.txt");
		World.setVisible();
		task();
	}
}
