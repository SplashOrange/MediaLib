
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private String artist;
    private String album;
    private double price;
    private boolean favorite;
    private double totalCost;
    private int numSongs;
    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        artist = "";
        album = "";
        price = 0.0;
        favorite = true;
        totalCost = 0.0;
        numSongs = 0;
        }
    public Song(String title, double price) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        numSongs = numSongs + 1;
    }
    public void setTitle(String t) {
        title = t;
    }
       public String getTitle() {
        return title;
       }
    public void setRating(int r) {
        rating = r;
    }   
       public int getRating() {
        return rating;
       }
    public void setArtist(String a) {
        artist = a;
    }
       public String getArtist() {
        return artist;
       }
    public void setAlbum(String al) {
        album = al;
    }
        public String getAlbum() {
         return album;
        }
    public void setPrice(double p) {
        price = p;
    }
        public double getPrice() {
         return price;
       }
    public void addToFavorites() {
     favorite = true;
    }
        
}