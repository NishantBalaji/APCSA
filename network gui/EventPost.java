
/**
 * Write a description of class EventPost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EventPost extends Post
{   
    private String eventType;
    
    public EventPost(String author, String eventType)
    {
        super(author, eventType);
        this.eventType = eventType;
    }
    
    public String getType(){
        return eventType;
    }
    
    public String output(){
        output = "Event Type: " + eventType + "\n";
        output = output + super.output();
        return output;
    } 
}
