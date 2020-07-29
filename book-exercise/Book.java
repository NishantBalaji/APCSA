/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private int borrowed;
    private String refNumber;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String refNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }
public void setRefNumber(String ref)
    {
    ref = refNumber;
    if (refNumber.equals(""))
        {
           refNumber = "ZZZ";
        }
        else 
        {
           refNumber = refNumber;
        }
        if (refNumber.length()<=3)
        {
            System.out.println("Error: set the Reference Number to a value larger than 3 digits");
            refNumber = "ZZZ";
        }
        else 
        {
            refNumber = refNumber;
        }
    }
  public void printDetails()
  {
    System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number:" + refNumber);
    }
  public String getAuthor()
    { 
      return author;
    }
  public String getTitle()
   {
       return title;
    }
    public int getPages()
    { 
      return pages;
    }
    public void  printAuthor()
    {
        System.out.println("Author: " + author);
    }
    public void  printTitle()
    {
        System.out.println("Title: " + title);
    } 
    public void borrow()
    {
    borrowed = borrowed + 1; 
    }  
    public int getborrowed()
    {
        return(borrowed);
    }
}
