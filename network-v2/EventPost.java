
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
    }
    
    public String getType(){
        return eventType;
    }
}
