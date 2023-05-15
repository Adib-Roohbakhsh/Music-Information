import java.util.ArrayList;

public class Singer {
    private String name;
    private String biography;
    private ArrayList<Album> albums;


    public Singer(String name, String biography, ArrayList<Album> albums) {
        setName(name);
        setBiography(biography);
        setAlbums(albums);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }


    public String getName() {
        return name;
    }

    public String getBiography() {
        return biography;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }


    public void printSinger() {
        System.out.println(getName() + "'s biography is :");
        System.out.println(getBiography());
        System.out.println(getName() + "'s albums :");
        for (int i = 0; i < albums.size(); i++) {
            System.out.println((i + 1) + "_" + albums.get(i).getTitle());

        }
    }

    public static boolean isSingerAvailable(String name) {
        boolean result = false;
        for (int i = 0; i < Main.singers.size(); i++) {
            if (name.equals(Main.singers.get(i).getName())) {
                result = true;
                break;
            }
        }
        return result;
    }

}
