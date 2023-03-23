//Student Name: Hoa Nguyen
//Student ID: 896317475

public class Book extends Publication {
    private String author;

    /*
     * Book(): initalizes the title, genre, and author of the Book
     * 
     * @param the title, genre, and author of the book
     */
    public Book(String author, String title, String genre) {
        super(title, genre);
        this.author = author;
    }

    /*
     * getInfo(): overrides the Publication getInfo() and converts the title, genre,
     * and author into a String format
     * 
     * @return the string form of the Book
     */
    @Override
    public String getInfo() {
        return String.format("%s, %s. Written by %s", title, genre, author);
    }
}
