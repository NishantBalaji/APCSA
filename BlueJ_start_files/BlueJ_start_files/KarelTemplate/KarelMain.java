package KarelTemplate;



import kareltherobot.*;

public class KarelMain implements Directions 
{

	public static void task() 
	{
		Robot karel = new Robot (1,1,East,1);


           karel.turnOff();
		
	} // task 

	// Main entry point
	public static void main(String[] args) 
     {
		World.setDelay(50);
		World.readWorld("oneBeeper.txt");
		World.setVisible();
		task();
	}
}

