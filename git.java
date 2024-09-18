package GitHub_one;

import java.util.*;


public class git {
    public static void main(String args[]) {
        Find_Songs f = new Find_Songs();
        f.Display_Playlist();
        f.findSong();
        Choose_PlayList c = new Choose_PlayList();
        c.Play_Playlist();
        c.Display_LikedSong();
        c.Play_Liked_Playlist();
    }
}

class Songs_INFO {
    Scanner sc = new Scanner(System.in);
    String RomSong[] = { "Char Kadam", "Bahara", "Tum hi ho", "TumMile", "Khuda Jaane", "Jab Mila Tu", "Tere Naina",
            "Tum Se Hi", "Tu HiHai", "Mast Magan" };
    String RomArtist[] = { "Shantanu M", "Shreya Ghoshal", "ArijitSingh", "Neeraj Shridhar", "KK,Shilpa Rao",
            "Vishal-Shekhar", "ShafqatAli", "Mohit Chauhan", "Arijit Singh", "Arijit Singh" };
    String RomDur[] = { "4:35", "3:04", "4:21", "5:43", "5:33", "4:11", "4:38", "5:21", "3:19", "4:40" };

    String SadSong[] = { "Agar Tum Saath Ho", "Phele Bhi Mein", "Rafta RaftaSanam", "Tune Jo Na Kaha",
            "Tujhe Bhula Diya", "Channa Mereya", "NaadanParinde", "Aaoge Jab Tum", "Bin Tere Koi Khalish",
            "Kabira(Reprise)" };
    String SadArtist[] = { "Alka Y,Arijit S", "Vishal Mishra", "AtifAslam", "Mohit Chauhan", "Mohit Chauhan",
            "Arijit Singh", "MohitChauhan", "Rashid Khan", "Vishal-Shekhar", "Arijit S" };
    String SadDur[] = { "5:41", "3:37", "5:41", "5:10", "4:39", "4:49", "6:24", "5:55", "5:30", "3:43" };

    String RetroSong[] = { "Pal Pal Dil Ke Paas", "Aaiyien Meherbaan", "YehShaam Mastani", "Ajib Daastan Hai Yeh",
            "Raat Bheegi Bheegi", "Abhi Na JaoChhodkar", "Chala Jata Hu", "Maine Tere Liye", "Lag Ja Gale Se",
            "Neele AmbarPar" };
    String RetroArtist[] = { "Kishore Kumar", "Asha Bhosle", "KishoreKumar", "Lata Mangeshkar", "Manna D,Lata M",
            "Asha Bhosle", "KishoreKumar", "Mukhesh M", "Lata Mangeshkar", "Kishore Kumar" };
    String RetroDur[] = { "5:29", "4:12", "4:36", "5:15", "4:29", "4:15", "4:29", "3:06", "4:17", "5:12" };

    String PartySong[] = { "Dj Wale Babu", "Dard-e-Disco", "Lungi Dance", "YimmyYimmy", "Ghagra", "Bring it on",
            "Mein Khiladi", "Kajra re", "KalaChashma", "Gone Girl" };
    String PartyArtist[] = { "Baadshah", "S. Singh", "Honey Singh", "JulienB", "Illa Arun", "Ajay-Atul", "Udit Narayan",
            "Shankar M", "Neha Kakkar", "PayalDev" };
    String PartyDur[] = { "2:49", "4:28", "2:33", "3:31", "3:00", "3:36", "3:06", "3:07", "3:09", "2:47" };

    String Remakes[] = { "Har kisiko", "Mein Nikla", "Manike", "BhoolBhuliya", "Dilbar", "Muquabla", "Aankh Marey",
            "Tamma Tamma", "Dil jhoom", "Hawa Hawa" };
    String RemakesArtist[] = { "Arjit Singh", "Udit Narayan", "Yohani Silva", "Pritam C", "N kakkar", "Parampara T",
            "Neha Kakkar", "Bappi Lahiri", "Ali Zafar", "Mika Singh" };
    String RemakesDur[] = { "2:53", "3:50", "3:17", "3:31", "3:24", "2:56", "3:32", "3:19", "3:07", "3:17" };

    String MarathiHits[] = { "Gulabi Sadi", "Paan Tu", "Jhumka", "Nauvari", "Dolby Walya", "Chandra", "Ved Tujha",
            "Mehbooba", "Nakhrewali", "Kajwa" };
    String MarathiHitsArtist[] = { "Sanju Rathod", "Ajay Gogavale", "Sanju Rathod", "Sanju Rathod", "N Morevekar",
            "Ajay-Atul", "Ajay Atul", "Preet Bandre", "Prashant Natki", "Vijay Bhate" };
    String MarathiHitsDur[] = { "3:43", "5:04", "3:48", "3:42", "5:36", "5:15", "3:24", "3:20", "4:44", "4:09" };

    public void Display_Playlist() {
        System.out.println("\t\t||Playlist||\n");
        System.out.println("\t\t\t||Love Symphony||\n");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + RomSong[i] + "\t\t\t"

                    + RomArtist[i] + "\t\t" + RomDur[i]);

        }
        System.out.println("\n\t\t\t||Bollywood Blues||\n");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + SadSong[i] + "\t\t\t"

                    + SadArtist[i] + "\t\t" + SadDur[i]);

        }
        System.out.println("\n\t\t\t||Retro Songs||\n");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + RetroSong[i] + "\t\t\t"

                    + RetroArtist[i] + "\t\t" + RetroDur[i]);

        }
        System.out.println("\n\t\t\t||Groove Central||\n");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + PartySong[i] + "\t\t\t"

                    + PartyArtist[i] + "\t\t" + PartyDur[i]);

        }

        System.out.println("\n\t\t\t||Remakes||\n");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + Remakes[i] + "\t\t\t"

                    + RemakesArtist[i] + "\t\t" + RemakesDur[i]);

        }
        System.out.println("\n\t\t\t||Marathi Hits||\n");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + MarathiHits[i] + "\t\t\t"

                    + MarathiHitsArtist[i] + "\t\t" + MarathiHitsDur[i]);

        }
    }
}

class Find_Songs extends Songs_INFO {
    public void findSong() {
        System.out.println("\nHave a song in mind?\n Go for it :)\n Enter the name of song");

        String song = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            if (song.equals(RomSong[i])) {
                System.out.println("Now playing " + RomSong[i] + " by " +

                        RomArtist[i]);

                return;
            } else if (song.equals(SadSong[i])) {
                System.out.println("Now playing " + SadSong[i] + " by " +

                        SadArtist[i]);

                return;
            } else if (song.equals(RetroSong[i])) {
                System.out.println("Now playing " + RetroSong[i] + " by " +

                        RetroArtist[i]);
                return;
            } else if (song.equals(PartySong[i])) {
                System.out.println("Now playing " + PartySong[i] + " by " +

                        PartyArtist[i]);
                return;
            } else if (song.equals(Remakes[i])) {

                System.out.println("Now playing " + Remakes[i] + " by " +

                        RemakesArtist[i]);
                return;
            } else if (song.equals(MarathiHits[i])) {
                System.out.println("Now playing " + MarathiHits[i] + " by " +

                        MarathiHitsArtist[i]);
                return;
            }
        }
        System.out.println("Song not found");
    }
}

class Choose_PlayList extends Songs_INFO {
    public ArrayList<String> LikedSongs = new ArrayList<>();
    public ArrayList<String> LikedSongsArtist = new ArrayList<>();
    public ArrayList<String> LikedSongsDur = new ArrayList<>();

    public void Play_Playlist() {
        int number = 0;
        System.out.println("\nWant to Play the Playlist?\nChoose Playlist");
        do {
            System.out.println(
                    "Enter\n 1 for Love Symphony\n 2 for Bollywood Blues\n 3 for Chai and Classics\n 4 for Groove Central\n 5 for Remakes\n 6 for Marathi Hits");

            System.out.println("Enter suitable operator");
            number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println("\t\tPlaying Love Symphony");

                    for (int i = 0; i < 10; i++) {
                        System.out.println("Playing " + RomSong[i] + " ||" + RomArtist[i] + " || " + RomDur[i]);

                        System.out.println(
                                "Enter\n 1 for repeat\n 2 for skip\n 3 to add to liked songs\n 4 to Change the playlist");

                        int operator = sc.nextInt();
                        switch (operator) {

                            case 1:
                                System.out.println("Again Playing " +

                                        RomSong[i] + " || " + RomArtist[i] + " || " + RomDur[i]);

                                i--;
                                break;
                            case 2:
                                System.out.println("Song skipped");
                                break;
                            case 3:
                                LikedSongs.add(RomSong[i]);

                                LikedSongsArtist.add(RomArtist[i]);
                                LikedSongsDur.add(RomDur[i]);
                                System.out.println("Successfully added to liked songs :)");

                                break;
                            case 4:
                                i = 10;
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("\t\tPlaying Bollywood Blues");

                    for (int i = 0; i < 10; i++) {
                        System.out.println("Playing " + SadSong[i] + " || " + SadArtist[i] + " || " + SadDur[i]);

                        System.out.println(
                                "Enter\n 1 for repeat\n 2 for skip\n 3 to add to liked songs\n4 to Change the playlist");
                        int operator = sc.nextInt();
                        switch (operator) {
                            case 1:
                                System.out.println("Again Playing " +

                                        SadSong[i] + " || " + SadArtist[i] + " || " + SadDur[i]);

                                i--;
                                break;
                            case 2:
                                System.out.println("Song skipped");
                                break;
                            case 3:
                                LikedSongs.add(SadSong[i]);

                                LikedSongsArtist.add(SadArtist[i]);
                                LikedSongsDur.add(SadDur[i]);
                                System.out.println("Successfully added to liked songs :)");

                                break;
                            case 4:
                                i = 10;
                        }
                        System.out.println();

                    }
                    break;
                case 3:
                    System.out.println("\t\tPlaying Chai and Classics");

                    for (int i = 0; i < 10; i++) {
                        System.out.println("Playing " + RetroSong[i] + " ||" + RetroArtist[i] + " || " + RetroDur[i]);

                        System.out.println(
                                "Enter\n 1 for repeat\n 2 for skip\n 3 to add to liked songs\n4 to Change the playlist");
                        int operator = sc.nextInt();
                        switch (operator) {
                            case 1:
                                System.out.println("Again Playing " +

                                        RetroSong[i] + " || " + RetroArtist[i] + " || " + RetroDur[i]);

                                i--;
                                break;
                            case 2:
                                System.out.println("Song skipped");
                                break;
                            case 3:
                                LikedSongs.add(RetroSong[i]);

                                LikedSongsArtist.add(RetroArtist[i]);
                                LikedSongsDur.add(RetroDur[i]);
                                System.out.println("Successfully added to liked songs :)");

                                break;
                            case 4:
                                i = 10;
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("\t\tPlaying Groove Central");

                    for (int i = 0; i < 10; i++) {
                        System.out.println("Playing " + PartySong[i] + " || " + PartyArtist[i] + " || " + PartyDur[i]);

                        System.out.println(
                                "Enter\n 1 for repeat\n 2 for skip\n 3 to add to liked songs \n4 to Change the playlist");

                        int operator = sc.nextInt();
                        switch (operator) {
                            case 1:
                                System.out.println("Again Playing " +

                                        PartySong[i] + " || " + PartyArtist[i] + " || " + PartyDur[i]);

                                i--;
                                break;
                            case 2:
                                System.out.println("Song skipped");

                                break;
                            case 3:
                                LikedSongs.add(PartySong[i]);

                                LikedSongsArtist.add(PartyArtist[i]);
                                LikedSongsDur.add(PartyDur[i]);
                                System.out.println("Successfully added to liked songs :)");

                                break;
                            case 4:
                                i = 10;
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("\t\tPlaying Remakes");

                    for (int i = 0; i < 10; i++) {
                        System.out
                                .println("Playing " + Remakes[i] + " || " + RemakesArtist[i] + " || " + RemakesDur[i]);

                        System.out.println(
                                "Enter\n 1 for repeat\n 2 for skip\n 3 to add to liked songs\n4 to Change the playlist");
                        int operator = sc.nextInt();
                        switch (operator) {
                            case 1:
                                System.out.println("Again Playing " +

                                        Remakes[i] + " || " + RemakesArtist[i] + " || " + RemakesDur[i]);

                                i--;
                                break;
                            case 2:
                                System.out.println("Song skipped");
                                break;
                            case 3:
                                LikedSongs.add(Remakes[i]);

                                LikedSongsArtist.add(RemakesArtist[i]);

                                LikedSongsDur.add(RemakesDur[i]);
                                System.out.println("Successfully added to liked songs :)");

                                break;
                            case 4:
                                i = 10;
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    System.out.println("\t\tPlaying Marathi Hits");

                    for (int i = 0; i < 10; i++) {

                        System.out.println("Playing " + MarathiHits[i] + "|| " + MarathiHitsArtist[i] + " || "
                                + MarathiHitsDur[i]);

                        System.out.println(
                                "Enter\n 1 for repeat\n 2 for skip\n 3 to add to liked songs\n4 to Change the playlist");
                        int operator = sc.nextInt();
                        switch (operator) {
                            case 1:
                                System.out.println("Again Playing " +
                                        MarathiHits[i] + " || " + MarathiHitsArtist[i] + " || " + MarathiHitsDur[i]);

                                i--;
                                break;
                            case 2:
                                System.out.println("Song skipped");
                                break;
                            case 3:
                                LikedSongs.add(MarathiHits[i]);

                                LikedSongsArtist.add(MarathiHitsArtist[i]);

                                LikedSongsDur.add(MarathiHitsDur[i]);
                                System.out.println("Successfully added to liked songs :)");

                                break;
                            case 4:
                                i = 10;
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (number != 7);
    }

    public void Display_LikedSong() {
        System.out.println("\n Liked songs are");
        System.out.println(LikedSongs);
    }

    public void Play_Liked_Playlist() {
        System.out.println("\nPlaying liked songs");
        for (int i = 0; i < LikedSongs.size(); i++) {
            System.out.println(LikedSongs.get(i) + " || " +
                    LikedSongsArtist.get(i) + " || " + LikedSongsDur.get(i));

        }

    }
}