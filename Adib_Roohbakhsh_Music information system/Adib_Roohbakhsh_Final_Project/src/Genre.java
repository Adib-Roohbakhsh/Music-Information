import java.util.ArrayList;

public class Genre {
    private ArrayList<Singer> singers;
    private String name;

    public Genre(ArrayList<Singer> singers, String name) {
        setSingers(singers);
        setName(name);
    }

    public void setSingers(ArrayList<Singer> singers) {
        this.singers = singers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Singer> getSingers() {
        return singers;
    }

    public String getName() {
        return name;
    }

    public void printGenre() {
        System.out.println(this.name + " singers :");
        for (int i = 0; i < singers.size(); i++) {
            System.out.println((i + 1) + "_" + singers.get(i).getName());
        }
    }
}

