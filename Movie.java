
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private String year;
    /**
     * Constructor for objects of class Movie
     */
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        year = "";
        }
    public String getTitle() {
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }
    public void setRating(int r) {
        rating = r;
    }   
    public int getRating() {
        return rating;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String y) {
        year = y;
    }
}