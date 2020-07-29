
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
    public static void main ()
        { System.out.println("Welcome to your Media Library");
            Song song1 = new Song();
            song1.setTitle("Hej Hej Monika Pt 2");
            System.out.println("Title:" + song1.getTitle());
            song1.setRating(10);
            System.out.println("Rating:" + song1.getRating());
            Movie movie1 = new Movie();
            
            movie1.setTitle("Meme Review");
            System.out.println("Title:" + movie1.getTitle());
            movie1.setRating(11);
            System.out.println("Rating:" + movie1.getRating());
            Book book1 = new Book();
            
            book1.setTitle("You Laugh, You Lose");
            System.out.println("Title:" + book1.getTitle());
            book1.setRating(15);
            System.out.println("Rating:" + book1.getRating());
            
}
}