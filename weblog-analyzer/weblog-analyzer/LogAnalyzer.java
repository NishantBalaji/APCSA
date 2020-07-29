/**
 * Read web server data and analyse hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version    2016.02.29
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer(String filename)
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader(filename);
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }
    public  int numberOfAccesses()
    {
     int total = 0 ;
      for ( int hour = 0 ; hour < hourCounts.length; hour++) 
      {
          total += hourCounts[ hour]; 
        }
      return total;
    }
    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }
    }
    public int busiestHour()
    {
        int max = 0;
        for(int i = 0; i < hourCounts.length; i++)
        {
            if(hourCounts[i] > hourCounts[max]) 
            {
                max = i;
            } 
        }
        return max;
    }
    public int quietestHour()
    {
        int min = 0;
        for(int i = 0; i < hourCounts.length; i++)
        { 
            if(hourCounts[i] < hourCounts[min])
            {
                min = i;
            }
        }
        return min; 
    }
    public int busiestTwoHour()
    {
        int maxTwoHour = 0; 
        for(int i = 0; i < hourCounts.length - 1; i++)
        {
            if(hourCounts[i] + hourCounts[i+1] > hourCounts[maxTwoHour] + hourCounts[maxTwoHour+1])
            {
                maxTwoHour = i;
            }
        }
        return maxTwoHour;
    }
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
}


