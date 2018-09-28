
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
        System.out.println(" ");
        
        
        System.out.println("Your Music:");
        System.out.println(" ");
        Song song1 = new Song();
        song1.setTitle("   R.E.M.");  
        System.out.println(song1.getTitle());
        song1.setArtist("   Artist: Ariana Grande");
        System.out.println(song1.getArtist());
        song1.setAlbum("    Album: Sweetener");
        System.out.println(song1.getAlbum());
        song1.setRating(10);  
        System.out.println("        Your rating: "+song1.getRating());
        
        System.out.println("");
        
        Song song2 = new Song();
        song2.setTitle("   Sorry Not Sorry");
        System.out.println(song2.getTitle());
        song2.setArtist("   Artist: Demi Lovato");
        System.out.println(song2.getArtist());
        song2.setAlbum("    Album: Tell Me You Love Me");
        System.out.println(song2.getAlbum());
        song2.setRating(8);
        System.out.println("        Your rating: "+song2.getRating());
        
        
        System.out.println(" ");
        System.out.println(" ");
        
        
        System.out.println("Your Movies:");
        System.out.println(" ");
        Movie movie1 = new Movie();
        movie1.setTitle("   Contagion");
        System.out.println(movie1.getTitle());
        movie1.setRating(10);
        System.out.println("        Your rating: "+(movie1.getRating()));
        
        System.out.println(" ");
        
        Movie movie2 = new Movie();
        
        System.out.println(" ");
        System.out.println(" ");
        
        
        System.out.println("Your Books:");
        System.out.println(" ");
        Book book1 = new Book();
        book1.setTitle("    The Andromeda Strain");
        System.out.println(book1.getTitle());
        book1.setRating(10);
        System.out.println("        Your rating: "+(book1.getRating()));
        
    }
}
