
/**
 * A (small) list of my favorite songs, movies, & books w/ some added info on each.
 *
 * @author Hannah Johnson
 * @version 1.0  9/14/18
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
        song1.setRating(9);  
        System.out.println("        Your rating: "+song1.getRating());
        
        System.out.println("");
        
        Song song2 = new Song();
        song2.setTitle("   God is a woman");
        System.out.println(song2.getTitle());
        song2.setArtist("   Artist: Ariana Grande");
        System.out.println(song2.getArtist());
        song2.setAlbum("    Album: Sweetener");
        System.out.println(song2.getAlbum());
        song2.setRating(9);
        System.out.println("        Your rating: "+song2.getRating());
        
        System.out.println("");
        
        Song song3 = new Song();
        song3.setTitle("   Sorry Not Sorry");
        System.out.println(song3.getTitle());
        song3.setArtist("   Artist: Demi Lovato");
        System.out.println(song3.getArtist());
        song3.setAlbum("    Album: Tell Me You Love Me");
        System.out.println(song3.getAlbum());
        song3.setRating(8);
        System.out.println("        Your rating: "+song3.getRating());
        
        System.out.println("");
        
        Song song4 = new Song();
        song4.setTitle("   One Bad Night");
        System.out.println(song4.getTitle());
        song4.setArtist("   Artist: Hayley Kiyoko");
        System.out.println(song4.getArtist());
        song4.setAlbum("    Album: Citrine");
        System.out.println(song4.getAlbum());
        song4.setRating(7);
        System.out.println("        Your rating: "+song4.getRating());
        
        
        System.out.println(" ");
        System.out.println(" ");
        
        
        System.out.println("Your Movies:");
        System.out.println(" ");
        Movie movie1 = new Movie();
        movie1.setTitle("   Contagion");
        System.out.println(movie1.getTitle());
        movie1.setYear("    Release year: 2011");
        System.out.println(movie1.getYear());
        movie1.setRating(10);
        System.out.println("        Your rating: "+movie1.getRating());
        
        System.out.println(" ");
        
        Movie movie2 = new Movie();
        movie2.setTitle("   Jurassic Park");
        System.out.println(movie2.getTitle());
        movie2.setYear("    Release year: 1993");
        System.out.println(movie2.getYear());
        movie2.setRating(10);
        System.out.println("        Your rating: "+movie2.getRating());
        
        
        System.out.println(" ");
        System.out.println(" ");
        
        
        System.out.println("Your Books:");
        System.out.println(" ");
        Book book1 = new Book();
        book1.setTitle("   The Andromeda Strain");
        System.out.println(book1.getTitle());
        book1.setAuthor("   Author: Michael Crichton");
        System.out.println(book1.getAuthor());
        book1.setYear("    Year published: 1969");
        System.out.println(book1.getYear());
        book1.setRating(10);
        System.out.println("        Your rating: "+book1.getRating());
        
        System.out.println("");
        
        Book book2 = new Book();
        book2.setTitle("   Out of Control");
        System.out.println(book2.getTitle());
        book2.setAuthor("   Author: Sarah Alderson");
        System.out.println(book2.getAuthor());
        book2.setYear("     Year published: 2014");
        System.out.println(book2.getYear());
        book2.setRating(10);
        System.out.println("        Your rating: "+book2.getRating());
        
    }
}
