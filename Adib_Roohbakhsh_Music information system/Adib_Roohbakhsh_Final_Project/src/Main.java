import java.util.ArrayList;

public class Main {
    public static ArrayList<Genre> genres = new ArrayList<>();
    public static ArrayList<Singer> singers = new ArrayList<>();

    public static void main(String[] args) {
        //**************************Songs**************************
        ArrayList<Song> whenWeAllFallAsleepWhereDoWeGoSongs = new ArrayList<>();
        Song badGuy = new Song("Bad Guy", "Billie Eilish", "Pop", 2019);
        Song iLoveYou = new Song("I Love You", "Billie Eilish", "Pop", 2019);
        Song allGoodGirlsGoToHell = new Song("All Good Girls Go To Hell", "Billie Eilish", "Pop", 2019);
        whenWeAllFallAsleepWhereDoWeGoSongs.add(badGuy);
        whenWeAllFallAsleepWhereDoWeGoSongs.add(iLoveYou);
        whenWeAllFallAsleepWhereDoWeGoSongs.add(allGoodGirlsGoToHell);


        ArrayList<Song> rareSongs = new ArrayList<>();
        Song rares = new Song("Rare", "Selena Gomez", "Pop", 2020);
        Song danceAgain = new Song("Dance Again", "Selena Gomez", "Pop", 2020);
        Song lookAtHerNow = new Song("Look At Her Now", "Selena Gomez", "Pop", 2020);
        rareSongs.add(rares);
        rareSongs.add(danceAgain);
        rareSongs.add(lookAtHerNow);


        ArrayList<Song> theWallSongs = new ArrayList<>();
        Song heyYou = new Song("Hey You", "Pink Floyd", "Rock", 1979);
        Song mother = new Song("Mother", "Pink Floyd", "Rock", 1979);
        Song anotherBrickInTheWall = new Song("Another Brick In The Wall", "Pink Floyd", "Rock", 1979);
        theWallSongs.add(heyYou);
        theWallSongs.add(mother);
        theWallSongs.add(anotherBrickInTheWall);


        ArrayList<Song> madeInHeavenSongs = new ArrayList<>();
        Song letMeLive = new Song("Let Me Live", "Queen", "Rock", 1995);
        Song itsABeautifulDay = new Song("It's A Beautiful Day", "Queen", "Rock", 1995);
        Song tooMuchLoveWillKillYou = new Song("Too Much Love Will Kill You", "Queen", "Rock", 1995);
        madeInHeavenSongs.add(letMeLive);
        madeInHeavenSongs.add(itsABeautifulDay);
        madeInHeavenSongs.add(tooMuchLoveWillKillYou);


        ArrayList<Song> kamikazeSongs = new ArrayList<>();
        Song venom = new Song("Venom", "Eminem", "Rap", 2018);
        Song niceGuy = new Song("Nice Guy", "Eminem", "Rap", 2018);
        Song greatest = new Song("Greatest", "Eminem", "Rap", 2018);
        kamikazeSongs.add(venom);
        kamikazeSongs.add(niceGuy);
        kamikazeSongs.add(greatest);


        ArrayList<Song> allEyesOnMeSongs = new ArrayList<>();
        Song ambitionzAzARidah = new Song("Ambitionz Az A Ridah", "Tupak", "Rap", 1996);
        Song allEyezOnMe = new Song("All Eyez On Me", "Tupak", "Rap", 1996);
        Song hollaAtMe = new Song("Holla At Me", "Tupak", "Rap", 1996);
        allEyesOnMeSongs.add(ambitionzAzARidah);
        allEyesOnMeSongs.add(allEyezOnMe);
        allEyesOnMeSongs.add(hollaAtMe);


        //**************************Albums**************************
        ArrayList<Album> billieEilishAlbums = new ArrayList<>();
        Album whenWeAllFallAsleepWhereDoWeGo = new Album("When We All Fall Asleep Where Do We Go", "billieEilish", "Pop", 2019, whenWeAllFallAsleepWhereDoWeGoSongs);
        billieEilishAlbums.add(whenWeAllFallAsleepWhereDoWeGo);

        ArrayList<Album> selenaGomezAlbums = new ArrayList<>();
        Album rare = new Album("Rare", "Selena Gomez", "Pop", 2020, rareSongs);
        selenaGomezAlbums.add(rare);


        ArrayList<Album> pinkFloydAlbums = new ArrayList<>();
        Album theWall = new Album("The Wall", "pink Floyd", "Rock", 1979, theWallSongs);
        pinkFloydAlbums.add(theWall);

        ArrayList<Album> queenAlbums = new ArrayList<>();
        Album madeInHeaven = new Album("Made In Heaven", "Queen", "Rock", 1995, madeInHeavenSongs);
        queenAlbums.add(madeInHeaven);

        ArrayList<Album> eminemAlbums = new ArrayList<>();
        Album kamikaze = new Album("Kamikaze", "Eminem", "Rap", 2018, kamikazeSongs);
        eminemAlbums.add(kamikaze);

        ArrayList<Album> tupakAlbums = new ArrayList<>();
        Album allEyesOnMe = new Album("All Eyes On Me", "Tupak", "Rap", 1996, allEyesOnMeSongs);
        tupakAlbums.add(allEyesOnMe);

        //**************************Singers**************************
        ArrayList<Singer> popSingers = new ArrayList<>();
        Singer billieEilish = new Singer("billieEilish", "Billie Eilish Pirate Baird O'Connell is an American singer-songwriter. She first gained attention in 2015 when she uploaded the song Ocean Eyes to SoundCloud, which was subsequently released by the Interscope Records subsidiary Darkroom. Wikipedia\n" +
                "Born: December 18, 2001 (age 19 years), Los Angeles, California, United States\n" +
                "Parent(s): Maggie Baird (mother)\n" +
                "Labels: Darkroom; Interscope\n" +
                "Genres: Pop; electropop; dark pop\n" +
                "Relatives: Finneas O'Connell (brother)\n", billieEilishAlbums);
        popSingers.add(billieEilish);
        singers.add(billieEilish);
        Singer selenaGomez = new Singer("selenaGomez", "Selena Marie Gomez is an American singer, actress, and producer. Born and raised in Texas, Gomez began her career by appearing on the children's television series Barney & Friends. Wikipedia\n" +
                "Born: July 22, 1992 (age 28 years), Grand Prairie, Texas, United States\n" +
                "Labels: Walt Disney; Hollywood; Interscope\n" +
                "Education: Danny Jones Middle School\n" +
                "TV shows: Wizards of Waverly Place, 13 Reasons Why, MORE\n" +
                "Awards: Bravo Otto - Super Singer - Female etc\n", selenaGomezAlbums);
        popSingers.add(selenaGomez);
        singers.add(selenaGomez);

        ArrayList<Singer> rockSingers = new ArrayList<>();
        Singer pinkFloyd = new Singer("pinkFloyd", "Pink Floyd were an English rock band formed in London in 1965. Gaining an early following as one of the first British psychedelic groups, they were distinguished for their extended compositions, sonic experimentation, philosophical lyrics and elaborate live shows, and became a leading band of the progressive rock genre.\n" +
                "Origin :London, England\n" +
                "Genres:\n" +
                "Progressive rockart rockexperimental rockpsychedelic poppsychedelic rock\n" +
                "Years active:\n" +
                "1965–199520052012–2014\n" +
                "Labels:\n" +
                "EMI ColumbiaTowerHarvestCapitolColumbiaSony MusicEMIParlophone\n" +
                "Website: pinkfloyd.com\n" +
                "Past members:\n" +
                "Nick Mason\n" +
                "Roger Waters\n" +
                "Bob Klose\n" +
                "Richard Wright\n" +
                "Syd Barrett\n" +
                "David Gilmour\n", pinkFloydAlbums);
        rockSingers.add(pinkFloyd);
        singers.add(pinkFloyd);

        Singer queen = new Singer("queen", "Queen are a British rock band formed in London in 1970. ... Before forming Queen, May and Taylor had played together in the band Smile. Mercury was a fan of Smile and encouraged them to experiment with more elaborate stage and recording techniques. He joined in 1970 and suggested the name Queen.\n" +
                "Album: A Night at the Opera, Queen II, Jazz, A ...\n" +
                "Member: John Deacon, Brian May, Roger Tayl...\n" +
                "Film: Flash Gordon, Bohemian Rhapsody\n" +
                "Origin: London\n", queenAlbums);
        rockSingers.add(queen);
        singers.add(queen);


        ArrayList<Singer> rapSingers = new ArrayList<>();
        Singer eminem = new Singer("eminem", "Marshall Bruce Mathers III, known professionally as Eminem, is an American rapper, songwriter, and record producer. Credited with popularizing hip hop in Middle America, he is considered one of the greatest rappers of all time. Wikipedia\n" +
                "Born: October 17, 1972 (age 48 years), Saint Joseph, Missouri, United States\n" +
                "Other names: Slim Shady\n" +
                "Net worth: US$230 million (2019)\n" +
                "Spouse: Kimberly Anne Scott (m. 2006–2006), Kimberly Anne Scott (m. 1999–2001)\n" +
                "Children: Hailie Jade, Alaina Marie Mathers\n", eminemAlbums);
        rapSingers.add(eminem);
        singers.add(eminem);

        Singer tupak = new Singer("tupak", "Tupac Amaru Shakur, better known by his stage name 2Pac and by his alias Makaveli, was an American rapper and actor. He is considered by many to be one of the most influential rappers of all time. Wikipedia\n" +
                "Born: June 16, 1971, East Harlem, New York, United States\n" +
                "Died: September 13, 1996, University Medical Center, Las Vegas, Nevada, United States\n" +
                "Other names: 2Pac; Pac; Makaveli; MC New York\n" +
                "Spouse: Keisha Morris (m. 1995–1996)\n" +
                "Cause of death: Drive-by homicide (gunshot wounds)\n", tupakAlbums);
        rapSingers.add(tupak);
        singers.add(tupak);


        //**************************Genres**************************
        Genre Pop = new Genre(popSingers, "POP");
        genres.add(Pop);

        Genre Rock = new Genre(rockSingers, "ROCK");
        genres.add(Rock);

        Genre Rap = new Genre(rapSingers, "RAP");
        genres.add(Rap);


        while (true) {
            Menu.mainMenu();
        }
    }

    public static ArrayList<String> sortArrayListAlphabetically(ArrayList<Singer> unsorted) {
        ArrayList<String> sorted = new ArrayList<>();
        for (Singer singer : unsorted) {
            sorted.add(singer.getName());
        }
        for (int i = 0; i < unsorted.size(); i++) {
            for (int j = i + 1; j < unsorted.size(); j++) {
                if (sorted.get(i).compareTo(sorted.get(j)) > 0) {
                    String temp = sorted.get(i);
                    sorted.set(i, sorted.get(j));
                    sorted.set(j, temp);
                }
            }
        }

        return sorted;
    }

    public static void printArrayList(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println((i + 1) + "- " + strings.get(i));
        }
    }
}
