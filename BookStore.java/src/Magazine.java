//Student Name: Hoa Nguyen
//Student ID: 896317475

public class Magazine extends Publication {
    private String publisher;

    /*
     * Magazine(): initalizes the title, genre, and author of the Magazine
     * 
     * @param the title, genre, and publisher of the magazine
     */
    public Magazine(String publisher, String title, String genre) {
        super(title, genre);
        this.publisher = publisher;
    }

    /*
     * getInfo(): overrides the Publication getInfo() and converts the title, genre,
     * and publisher into a String format
     * 
     * @return the string form of the Magazine
     */
    @Override
    public String getInfo() {
        return String.format("%s, %s. Published by %s", title, genre, publisher);
    }
}
