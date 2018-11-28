
/**
 * A (small) list of my favorite songs, movies, & books w/ some added info on each.
 *
 * @author Hannah Johnson
 * @version 1.0  9/14/18
 */
public class MediaLib
{ 
    public static int count;
    public int newInst;
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
        song1.setPrice(1.29);
        System.out.println("        Price: $"+song1.getPrice());
        
        
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
        song2.setPrice(1.29);
        System.out.println("        Price: $"+song2.getPrice());
        
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
        song3.setPrice(1.29);
        System.out.println("        Price: $"+song3.getPrice());
        
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
        song4.setPrice(1.29);
        System.out.println("        Price: $"+song4.getPrice());
        
        System.out.println("");
        
        Song song5 = new Song();
        song5.setTitle("    Baby Don't Talk");
        System.out.println(song5.getTitle());
        song5.setArtist("   Artist: LÉON");
        System.out.println(song5.getArtist());
        song5.setAlbum("    Album: Baby Don't Talk - Single");
        System.out.println(song5.getAlbum());
        song5.setRating(6);
        System.out.println("        Your rating: "+song5.getRating());
        song5.setPrice(1.29);
        System.out.println("        Price: $"+song5.getPrice());
        
        System.out.println("");
        
        Song song6 = new Song();
        song6.setTitle("    Just My Type");
        System.out.println(song6.getTitle());
        song6.setArtist("   Artist: The Vamps");
        System.out.println(song6.getArtist());
        song6.setAlbum("    Album: Night & Day (Day Edition)");
        System.out.println(song6.getAlbum());
        song6.setRating(7);
        System.out.println("        Your rating: "+song6.getRating());
        song6.setPrice(1.29);
        System.out.println("        Price: $"+song6.getPrice());
        
        System.out.println("");
        
        Song song7 = new Song();
        song7.setTitle("    Darling");
        System.out.println(song7.getTitle());
        song7.setArtist("   Artist: KNIA");
        System.out.println(song7.getArtist());
        song7.setAlbum("    Album: untitled");
        System.out.println(song7.getAlbum());
        song7.setRating(10);
        System.out.println("        Your rating: "+song7.getRating());
        song7.setPrice(0.99);
        System.out.println("        Price: $"+song7.getPrice());
        
        System.out.println(" ");

        
        for (int numSongs = 1; numSongs < 8; numSongs++) {
       
            count = numSongs;

        }
        System.out.println(" ");
        
        System.out.println("Total number of songs in your library: " + count);
        
        
        
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
        movie1.setPrice(1.29);
        System.out.println("        Price: $"+movie1.getPrice());
        
        System.out.println(" ");
        
        Movie movie2 = new Movie();
        movie2.setTitle("   Jurassic Park");
        System.out.println(movie2.getTitle());
        movie2.setYear("    Release year: 1993");
        System.out.println(movie2.getYear());
        movie2.setRating(10);
        System.out.println("        Your rating: "+movie2.getRating());
        movie2.setPrice(1.29);
        System.out.println("        Price: $"+movie2.getPrice());
        
        
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
        book1.setPrice(1.29);
        System.out.println("        Price: $"+book1.getPrice());
        
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
        book2.setPrice(1.29);
        System.out.println("        Price: $"+book2.getPrice());
        
        System.out.println("");
        

    }
}
