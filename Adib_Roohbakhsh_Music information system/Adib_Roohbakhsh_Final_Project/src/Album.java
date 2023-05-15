import java.util.ArrayList;

public class Album {

    private String title;
    private String artist;
    private String genre;
    private int year;
    private ArrayList<Song> songs;

    public Album(String title, String artist, String genre, int year, ArrayList<Song> songs) {
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setYear(year);
        setSongs(songs);
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

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }


    public String getTitle() {
        return title;
    }


    public ArrayList<Song> getSongs() {
        return songs;
    }


    public void printAlbumInformation() {
        System.out.println("* Album Information *");
        System.out.println("---------------------");
        System.out.println("  Title :" + title);
        System.out.println("  Artist :" + artist);
        System.out.println("  Genre :" + genre);
        System.out.println("  Year :" + year);
        System.out.println("  Songs :");
        printSongs();
        System.out.println("---------------------");

    }

    private void printSongs() {
        for (int i = 1; i <= songs.size(); i++) {
            System.out.println(i + "_" + songs.get(i - 1).getTitle());
        }
    }
}
