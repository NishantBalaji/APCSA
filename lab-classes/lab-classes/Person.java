
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    public String name;
    public Person(String name)
    {
        this.name = name;
    }
    
    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }
}
