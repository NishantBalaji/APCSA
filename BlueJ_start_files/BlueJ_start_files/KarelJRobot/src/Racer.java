package KarelJRobot.src;

import kareltherobot.*;

class ExtendedRobot extends Robot {
	// constructor
	public ExtendedRobot(int street, int avenue, Direction direction,
			int howmany) {
		super(street, avenue, direction, howmany);
	}

	// insert methods here
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
}
