import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
        else{
            int printSize = files.size() - 1;
           System.out.println("Not a valid parameter. Valid randers are between 0 and " + printSize + ".");
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
        else{
            int printSize = files.size() - 1;
           System.out.println("Not a valid parameter. Valid randers are between 0 and " + printSize + ".");
        }
    }
    
    public void checkIndex(int check)
    {
        if(check >= 0  && check <= files.size()-1)
        {
            System.out.println("Accepted. This number is valid.");
            }
        else {
            int printSize = files.size() - 1;
           System.out.println("Not a valid parameter. Valid randers are between 0 and " + printSize + "."); 
    }
}
public boolean validIndex(int check)
    {
        if(check >= 0  && check <= files.size()-1)
        {
            return true;
            }
        else {
            return false;  
    }
}
}
