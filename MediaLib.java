
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
    public static double totalCost = 0.0;
    public static double totalRatings = 0;
    public static double avgCost = 0.0;
    public static double avgRating = 0;
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
        totalCost = totalCost + song1.price;
        totalRatings = totalRatings + song1.rating;
        
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
        totalCost = totalCost + song2.price;
        totalRatings = totalRatings + song2.rating;
        
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
        totalCost = totalCost + song3.price;
        totalRatings = totalRatings + song3.rating;
        
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
        totalCost = totalCost + song4.price;
        totalRatings = totalRatings + song4.rating;
        
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
        totalCost = totalCost + song5.price;
        totalRatings = totalRatings + song5.rating;
        
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
        totalCost = totalCost + song6.price;
        totalRatings = totalRatings + song6.rating;
        
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
        totalCost = totalCost + song7.price;
        totalRatings = totalRatings + song7.rating;
        
        System.out.println(" ");
        
        Song song8 = new Song();
        song8.setTitle("    thank u, next");
        System.out.println(song8.getTitle());
        song8.setArtist("   Artist: Ariana Grande");
        System.out.println(song8.getArtist());
        song8.setAlbum("    Album: thank u, next - Single");
        System.out.println(song8.getAlbum());
        song8.setRating(9);
        System.out.println("        Your rating: "+song8.getRating());
        song8.setPrice(1.29);
        System.out.println("        Price: $"+song8.getPrice());
        totalCost = totalCost + song8.price;
        totalRatings = totalRatings + song8.rating;
        
        System.out.println(" ");
        
        Song song9 = new Song();
        song9.setTitle("    Electric Love");
        System.out.println(song9.getTitle());
        song9.setArtist("   Artist: Børns");
        System.out.println(song9.getArtist());
        song9.setAlbum("    Album: Dopamine");
        System.out.println(song9.getAlbum());
        song9.setRating(8);
        System.out.println("        Your rating: "+song9.getRating());
        song9.setPrice(1.29);
        System.out.println("        Price: $"+song9.getPrice());
        totalCost = totalCost + song9.price;
        totalRatings = totalRatings + song9.rating;
        
        System.out.println(" ");
        
        Song song10 = new Song();
        song10.setTitle("   come out and play");
        System.out.println(song10.getTitle());
        song10.setArtist("  Artist: Billie Eilish");
        System.out.println(song10.getArtist());
        song10.setAlbum("   Album: come out and play - Single");
        System.out.println(song10.getAlbum());
        song10.setRating(6);
        System.out.println("        Your rating: " + song10.getRating());
        song10.setPrice(1.29);
        System.out.println("        Price: $" + song10.getPrice());
        totalCost = totalCost + song10.price;
        totalRatings = totalRatings + song10.rating;
        
        
        System.out.println(" ");

        int instanceCount = Song.getObjectNum();
        
        for (int numSongs = 1; numSongs < instanceCount+1; numSongs++) {
       
            count = numSongs;

        }
        System.out.println(" ");
        
        System.out.println("Total number of songs in your library: " + count);
        
        System.out.println(" ");
        
        avgCost = totalCost / count;

        System.out.println("You've bought $" + String.format("%.2f", totalCost) + " worth of music");
        System.out.println("The average cost of a song in your library is $" + String.format("%.2f", avgCost));
        
        System.out.println(" ");
        
        int maxRatings = count * 10;
        avgRating = totalRatings / count;
        
        System.out.println("Your total rating of all songs is " + (int)totalRatings + " out of " + maxRatings); 
        System.out.println("The average rating of a song in your library is " + avgRating + " out of 10");
        
        
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
        movie1.setDuration(106);
        System.out.println("    Duration: " + movie1.duration + " minutes");
        
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
        movie2.setDuration(127);
        System.out.println("    Duration: " + movie2.duration + " minutes");
        
        
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