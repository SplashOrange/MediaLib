
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
   public static void main()
    {
        System.out.println("Welcome to your Media Library!");
        System.out.println(" ");
        System.out.println("Your Music:");
        Song song1 = new Song();
        song1.setTitle("    Sweetener");  
        System.out.println(song1.getTitle());
        song1.setRating(10);  
        System.out.println("    Your rating for this song:");
        System.out.println(     song1.getRating());
    }
}
