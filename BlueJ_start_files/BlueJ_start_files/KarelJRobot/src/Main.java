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
		// task
	}

	// Main entry point
	static public void main(String[] args) {
		World.setDelay(100);
		// World.readWorld("fivehurdle.txt");
		World.setVisible();
		task();
	}
}
