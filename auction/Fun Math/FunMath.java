import java.util.*;
public class FunMath
{
    public double funAverage(ArrayList<Integer> nums) // returns the average of the arraylist nums
  {
    int avg = nums.get(0);
      for(int i = 1; i < nums.size(); i++)
      {
        avg = avg + nums.get(i);
      }
    return((double)avg/nums.size());
  }

  public int funSum( ArrayList<Integer> nums ) // returns the sum of the arraylist
  {
    int sum = nums.get(0);
      for(int i = 1; i<nums.size(); i++)
      {
        sum = sum + nums.get(i);
      }
      return sum; 
  }
  public double funExp(int base , int exponent) // returns the based raised by the exponent.
  {
    if(exponent == 0)
    {
        return 1;
    }
    else
    {
        int base1 = 1;
        for(int i=0; i < exponent; i++)
        {
          base1 = base1 * base;
        }
        return base1;
    }
     }
  public static void main(String[] args)
  {
        FunMath item = new FunMath();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(10);
        nums.add(7);
        nums.add(8);
        nums.add(2);
        System.out.println(item.funAverage(nums));
        System.out.println(item.funSum(nums));
        System.out.println(item.funExp(2, 0));
        System.out.print(item.funExp(3, 2));
  }
}