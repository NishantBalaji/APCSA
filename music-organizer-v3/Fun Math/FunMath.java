import java.util.*;
public class FunMath
{
    //FunMath Class

    //The class has no field variables.

    //Methods

    public double funAverage(ArrayList<Integer> nums) // returns the average of the arraylist nums
    {
        int avg = nums.get(0);
        for(int i = 0; i < nums.size(); i++)
        {
            avg = avg + nums.get(i);
        }
        return((double)avg/nums.size());
    }

    public int funSum( ArrayList<Integer> nums ) // returns the sum of the arraylist
    {
    int sum = nums.get(0);
      for(int i = 0; i<nums.size(); i++)
      {
        sum = sum + nums.get(i);
      }
      return sum; 
  }
  public double funExp(int base , int exponent) // returns the based raised by the exponent.
  {
    int base1 = base;
    for(int i=0; i < exponent; i++)
    {
      base1 = base1 * base;
    }
    return base1;
  }
}