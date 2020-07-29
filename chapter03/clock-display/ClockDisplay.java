/*ows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * the minutes roll over to zero.
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock sh
 * 
 * @author Michael Kölling and Davi
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when d J. Barnes
 * @version 2016.02.29
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String displayString;    // simulates the actual display
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute, int sec)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute, sec);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        seconds.increment();
        if(seconds.getValue() == 0) {  // it just rolled over!
            minutes.increment();
        }
        if(minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute, int second)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
    int twelveHours = hours.getValue();
    
    if(twelveHours == 12) {
        displayString = twelveHours + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue()+ "pm";
    }
    
    else if(twelveHours > 12) {
        twelveHours = twelveHours - 12;
        displayString = twelveHours + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue()+ "pm";
    }
    else {
        if(twelveHours == 0){
            twelveHours = 12;
        }
        displayString = twelveHours + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue()+ "am";
    }
    
}      
}
