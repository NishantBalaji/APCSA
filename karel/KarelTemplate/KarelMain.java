package KarelTemplate;



import kareltherobot.*;

public class KarelMain implements Directions 
{

	public static void task() 
	{
		Robot karel = new Robot (5,4,East,0);
		karel.turnLeft();
		karel.move ();
		karel.move ();
		karel.move ();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move ();
		karel.move ();
		karel.move ();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move ();
		karel.move ();
		karel.move ();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move ();
		karel.move ();
		karel.move ();;
		karel.turnOff();


           karel.turnOff();
		
	} // task 

	// Main entry point
	public static void main(String[] args) 
     {
		World.setDelay(50);
		World.readWorld("world27.txt");
		World.setVisible();
		task();
	}
}

