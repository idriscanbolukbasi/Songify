import java.util.Scanner;

public class Interface {
    public static PersonList persons = new PersonList();
    public static SongList songs = new SongList();

    public static void main(String[] args) {
        System.out.println("*-*-*-*-*-*-*-*-* Songify *-*-*-*-*-*-*-*-* " +
                "\nWelcome to Songify, all of the commands are given below:" +
                "\nC <Name>: Creates a person with the name given in the line." +
                "\nS <Name> <Song>: Sets the <Name> likes the <Song>" +
                "\nE <Name> <Song>: Erases the assignment (<Name> doesn't like the song anymore)." +
                "\nL <Name>: Lists the songs of the person <Name> likes." +
                "\nN: List all name of registered people." +
                "\nM: List all the songs that liked by anyone." +
                "\nR: Recommends the most popular 3 different songs.");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (!CommandManager.handle(scanner.nextLine()))
                System.out.println("Please supply an argument.");
        }
    }
}
