//Student Name: Hoa Nguyen
//Student ID: 896317475

public class Publication implements Comparable<Publication> {
    protected String genre;
    protected String title;

    /*
     * Publication: initalizes the objects title and genre
     * 
     * @param the title and genre of the publication
     */
    public Publication(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    /*
     * getInfo(): formats the title and the genre into a string
     * 
     * @return a string of the title and genre
     */
    public String getInfo() {
        return String.format("%s, %s.", title, genre);
    }

    /*
     * compareTo(): compares the Publications by genre first then title
     * 
     * @param the other Publication to compare
     */
    @Override
    public int compareTo(Publication other) {

        if (genre.compareToIgnoreCase(other.genre) != 0) {
            return genre.compareToIgnoreCase(other.genre); // use compareToIgnoreCase for comparing strings
        }
        return title.compareToIgnoreCase(other.title);
    }
}
