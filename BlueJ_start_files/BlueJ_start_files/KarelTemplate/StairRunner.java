package KarelTemplate;



import kareltherobot.*;

public class StairRunner implements Directions 
{

	public static void task() 
	{
	   StairSweeper karel = new StairSweeper (1,1,East,1);

         karel.turnOff();
		
	} // task 

	// Main entry point
	public static void main(String[] args) 
     {
		World.setDelay(50);
		World.readWorld("stairs.txt");
		World.setVisible();
		task();
	}
}

