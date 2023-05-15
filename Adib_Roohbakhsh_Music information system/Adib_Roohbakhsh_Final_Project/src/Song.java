public class Song {

    private String title;
    private String artist;
    private String genre;
    private int year;


    public Song(String title, String artist, String genre, int year) {
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setYear(year);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getTitle() {
        return title;
    }

    public void printSongInformation() {
        System.out.println("* Song Information *");
        System.out.println("--------------------");
        System.out.println("  Title :" + title);
        System.out.println("  Artist :" + artist);
        System.out.println("  Genre :" + genre);
        System.out.println("  Year :" + year);
        System.out.println("--------------------");
    }
}
