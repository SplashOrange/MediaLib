
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
    public double totalCost;
    public static int numSongs;
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
        Song.numSongs += Song.numSongs;
        totalCost = totalCost + price;
        }
    public Song(String title, double price) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        Song.numSongs += Song.numSongs;
        totalCost = totalCost + price;
    }
    // get & set strings (acsessors & mutators)
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
        public static int getNumSongs() {
            return numSongs;
        }
    public void setTotalCost(double c) {
        totalCost = c;
    }
        public double getTotalCost() {
            return totalCost;
        }
}