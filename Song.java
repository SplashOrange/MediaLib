
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    public static int rating;
    private String title;
    private String artist;
    private String album;
    public static double price;
    private boolean favorite;
    public static int numSongs;
    public static int objectNum;
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
        objectNum++; 
        }
    public Song(String title, double price) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        Song.numSongs += Song.numSongs;
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
    public static void setPrice(double p) {
        price = p;
    }
        public static double getPrice() {
         return price;
       }
    public void addToFavorites() {
        favorite = true;
    }
        public static int getNumSongs() {
            return numSongs;
        }
    public static int getObjectNum(){
        return objectNum;    
    }    
}