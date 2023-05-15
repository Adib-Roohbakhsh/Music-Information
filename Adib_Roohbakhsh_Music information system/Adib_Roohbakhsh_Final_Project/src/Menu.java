import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static Scanner SC = new Scanner(System.in);
    private static int genreMenuInput;
    private static int singerMenuInput;
    private static int albumMenuInput;
    private static int songMenuInput;
    private static int chooseGenreInput;

    private static int searchAlbumInput;
    private static int searchSongInput;

    private static String wantedSinger;

    public static void mainMenu() {
        System.out.println("       *********************************");
        System.out.println("       **   1. Select Singer          **");
        System.out.println("       **   2. add Singer             **");
        System.out.println("       **   3. Search Singer          **");
        System.out.println("       **   4. Search Song            **");
        System.out.println("       **   5. Show Available Singers **");
        System.out.println("       **   6. Exit                   **");
        System.out.println("       *********************************");
        System.out.println("Please enter the number of section you want :");
        int menuInput = SC.nextInt();
        switch (menuInput) {
            case 1:
                genreMenu();
                break;
            case 2:

                addMenu();
                break;
            case 3:
                searchSingerMenu();
                break;
            case 4:
                System.out.println("Please enter the name of song that you look for");
                SC.nextLine();
                String wantedSong = SC.nextLine();
                findAAndPrintSongInformation(wantedSong);
                break;
            case 5:
                Main.printArrayList(Main.sortArrayListAlphabetically(Main.singers));
                System.out.println("\n Please press any key to go back to main menu");
                SC.nextLine();
                String empty = SC.nextLine();
                mainMenu();
                break;
            case 6:
                System.exit(0);
                break;

            default:
                System.out.println("Wrong number!! Please choose another number again!");
                mainMenu();
                break;
        }
    }

    public static void genreMenu() {
        for (int i = 0; i < Main.genres.size(); i++) {
            Genre temp = Main.genres.get(i);
            System.out.println((i + 1) + "_ " + temp.getName());
        }
        System.out.println("0_ Back <-");
        System.out.println("Please enter the genre that you want :");
        genreMenuInput = SC.nextInt();
        if (genreMenuInput == 0) {
            mainMenu();
        } else {
            if (genreMenuInput > Main.genres.size()) {
                System.out.println("Sorry ! you choose wrong number please enter correct one.");
                genreMenu();
            } else {
                singersMenu();
            }
        }
    }

    public static void singersMenu() {
        Main.genres.get(genreMenuInput - 1).printGenre();
        System.out.println("0_ Back <-");
        System.out.println("Which singer do you want to know about ? choose it !");
        singerMenuInput = SC.nextInt();
        if (singerMenuInput == 0) {
            genreMenu();
        } else {
            if (singerMenuInput > Main.genres.get(genreMenuInput - 1).getSingers().size()) {
                System.out.println("Sorry ! you choose wrong number please enter correct one.");
                singersMenu();
            } else {
                albumMenu();
            }
        }
    }


    public static void albumMenu() {
        Main.genres.get(genreMenuInput - 1).getSingers().get(singerMenuInput - 1).printSinger();
        System.out.println("0_ Back <-");
        System.out.println("Which album do you want to know about ? choose it now!");
        albumMenuInput = SC.nextInt();
        if (albumMenuInput == 0) {
            singersMenu();
        } else {
            if (albumMenuInput > Main.genres.get(genreMenuInput - 1).getSingers().get(singerMenuInput - 1).getAlbums().size()) {
                System.out.println("Sorry ! you choose wrong number please enter correct one.");
                albumMenu();
            } else {
                songMenu();
            }
        }
    }


    public static void songMenu() {
        Main.genres.get(genreMenuInput - 1).getSingers().get(singerMenuInput - 1).getAlbums().get(albumMenuInput - 1).printAlbumInformation();
        System.out.println("0_ Back <-");
        System.out.println("Which song do you want  ? choose to know about it now!");
        songMenuInput = SC.nextInt();
        if (songMenuInput == 0) {
            albumMenu();
        } else {
            if (songMenuInput > Main.genres.get(genreMenuInput - 1).getSingers().get(singerMenuInput - 1).getAlbums().get(albumMenuInput - 1).getSongs().size()) {
                System.out.println("Sorry ! you choose wrong number please enter correct one.");
                songMenu();
            } else {
                lastMenu();
            }
        }
    }

    public static void lastMenu() {
        Main.genres.get(genreMenuInput - 1).getSingers().get(singerMenuInput - 1).getAlbums().get(albumMenuInput - 1).getSongs().get(songMenuInput - 1).printSongInformation();
        System.out.println("0_ Back <-");
        System.out.println("1_Main menu");
        System.out.println("I hope you enjoy it enter the number of section you want");
        int finalMenuInput = SC.nextInt();
        switch (finalMenuInput) {
            case 0:
                songMenu();
                break;
            case 1:
                mainMenu();
                break;
            default:
                System.out.println("Wrong input try again");
                lastMenu();
        }

    }

    public static void addMenu() {
        for (int i = 0; i < Main.genres.size(); i++) {
            Genre temp = Main.genres.get(i);
            System.out.println((i + 1) + "_ " + temp.getName());
        }
        System.out.println("0_ Back <-");
        System.out.println("In which genre do you want to add a singer ?");
        chooseGenreInput = SC.nextInt();
        if (chooseGenreInput == 0) {
            mainMenu();
        } else {
            if (chooseGenreInput > Main.genres.size()) {
                System.out.println("Sorry ! you choose wrong number please enter correct one.");
                addMenu();
            } else {
                createSinger();
            }
        }
    }

    public static void createSinger() {
        Singer tempSinger;
        String tempGenre = Main.genres.get(chooseGenreInput - 1).getName();
        System.out.println("Please enter the name of singer that you want to add:");
        SC.nextLine();
        String tempSingerName = SC.nextLine();
        if (Singer.isSingerAvailable(tempSingerName)) {
            System.out.println("Sorry we have this singer !!");
            addMenu();
        } else {
            System.out.println("Please enter " + tempSingerName + "'s biography:");
            String tempSingerBio = SC.nextLine();

            //Creating Albums
            System.out.println("How many album do you want to add for " + tempSingerName);
            int numOfAlbums = SC.nextInt();
            SC.nextLine();

            ArrayList<Album> tempSingerAlbums = new ArrayList<>();
            for (int i = 0; i < numOfAlbums; i++) {

                System.out.println("Please enter the title of album:");
                String tempAlbumTitle = SC.nextLine();
                System.out.println("Please enter the year that album release:");
                int tempYear = SC.nextInt();

                //Creating Songs
                System.out.println("How many song do you want to add in " + tempAlbumTitle);
                int numOfSongs = SC.nextInt();
                SC.nextLine();

                ArrayList<Song> tempSongs = new ArrayList<>();
                for (int j = 0; j < numOfSongs; j++) {
                    System.out.println("Please enter the title of the song that you want to add:");
                    String tempSongTitle = SC.nextLine();
                    Song tempSong = new Song(tempSongTitle, tempSingerName, tempGenre, tempYear);
                    tempSongs.add(tempSong);
                }
                Album tempAlbum = new Album(tempAlbumTitle, tempSingerName, tempGenre, tempYear, tempSongs);
                tempSingerAlbums.add(tempAlbum);
            }
            tempSinger = new Singer(tempSingerName, tempSingerBio, tempSingerAlbums);
            Main.genres.get(chooseGenreInput - 1).getSingers().add(tempSinger);
            Main.singers.add(tempSinger);
            Main.sortArrayListAlphabetically(Main.singers);
        }
        System.out.println("Thank you because of adding new singer and develop our information :) ");
    }


    public static void searchSingerMenu() {
        System.out.println("Please enter the name of the  singer that you want to look for :");
        SC.nextLine();
        wantedSinger = SC.nextLine();
        if (findSinger(wantedSinger) == null) {
            System.out.println("Sorry we don't have this singer");
            mainMenu();
        } else {
            searchSingerAlbumMenu();

        }
    }


    public static void searchSingerAlbumMenu() {

        findSinger(wantedSinger).printSinger();
        System.out.println("0_ Main menu <-");
        System.out.println("Which album do you want to know about ? choose it now!");
        searchAlbumInput = SC.nextInt();
        if (searchAlbumInput == 0) {
            mainMenu();
        } else {
            if (searchAlbumInput > findSinger(wantedSinger).getAlbums().size()) {
                System.out.println("Sorry ! you choose wrong number please enter correct one.");
                searchSingerAlbumMenu();
            } else {
                searchSingerSongMenu();
            }

        }


    }

    public static void searchSingerSongMenu() {
        findSinger(wantedSinger).getAlbums().get(searchAlbumInput - 1).printAlbumInformation();
        System.out.println("0_ back <-");
        System.out.println("Which song do you want  ? choose to know about it now!");
        searchSongInput = SC.nextInt();
        if (searchSongInput == 0) {
            searchSingerAlbumMenu();
        } else {
            if (searchSongInput > findSinger(wantedSinger).getAlbums().get(searchAlbumInput - 1).getSongs().size()) {
                System.out.println("Sorry ! you choose wrong number please enter correct one.");
                searchSingerSongMenu();
            } else {
                searchSingerLastMenu();
            }
        }

    }

    public static void searchSingerLastMenu() {
        findSinger(wantedSinger).getAlbums().get(searchAlbumInput - 1).getSongs().get(searchSongInput - 1).printSongInformation();
        System.out.println("0_ Back <-");
        System.out.println("1_Main menu");
        System.out.println("I hope you enjoy it enter the number of section you want");
        int finalMenuInput = SC.nextInt();
        switch (finalMenuInput) {
            case 0:
                searchSingerSongMenu();
                break;
            case 1:
                mainMenu();
                break;
            default:
                System.out.println("Wrong input try again");
                searchSingerLastMenu();
        }
    }

    public static Singer findSinger(String wantedName) {
        Singer result = null;
        for (int i = 0; i < Main.singers.size(); i++) {
            if (Main.singers.get(i).getName().equals(wantedName)) {
                result = Main.singers.get(i);
            }
        }
        return result;
    }

    public static void findAAndPrintSongInformation(String wantedName) {
        Genre resultGenre = null;
        Singer resultSinger = null;
        Album resultAlbum = null;
        Song resultSong = null;

        for (int i = 0; i < Main.genres.size(); i++) {
            for (int j = 0; j < Main.genres.get(i).getSingers().size(); j++) {
                for (int k = 0; k < Main.genres.get(i).getSingers().get(j).getAlbums().size(); k++) {
                    for (int l = 0; l < Main.genres.get(i).getSingers().get(j).getAlbums().get(k).getSongs().size(); l++) {
                        if (Main.genres.get(i).getSingers().get(j).getAlbums().get(k).getSongs().get(l).getTitle().equals(wantedName)) {
                            resultGenre = Main.genres.get(i);
                            resultSinger = Main.genres.get(i).getSingers().get(j);
                            resultAlbum = Main.genres.get(i).getSingers().get(j).getAlbums().get(k);
                            resultSong = Main.genres.get(i).getSingers().get(j).getAlbums().get(k).getSongs().get(l);
                        }
                    }
                }
            }

        }
        if (resultSong == null) {
            System.out.println("Sorry we don't have this song available.");
        } else {
            resultSong.printSongInformation();

            System.out.println("The " + resultSong.getTitle() + "'s Album is ");
            System.out.println(resultAlbum.getTitle());

            System.out.println("The " + resultSong.getTitle() + "'s Singer is ");
            System.out.println(resultSinger.getName());

            System.out.println("The " + resultSong.getTitle() + "'s Genre is: ");
            System.out.println(resultGenre.getName());

            System.out.println("\n Please press any key to go back to main menu");
            String empty = SC.nextLine();
        }
        mainMenu();
    }
}