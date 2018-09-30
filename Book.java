
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private String author;
    private String year;
    /**
     * Constructor for objects of class Book
     */
    public Book()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        author = "";
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
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String a) {
        author = a;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String y) {
        year = y;
    }
}
