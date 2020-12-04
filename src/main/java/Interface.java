import utils.LinkedList;

import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Interface {
    public static LinkedList<Person> persons = new LinkedList<>();
    public static LinkedList<Song> songs = new LinkedList<>();

    public static void main(String[] args) throws UnsupportedEncodingException {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8")); // to avoid platform (OS) dependent outputs like Uğur -> U??ur
        } catch (UnsupportedEncodingException e) {
            System.out.println("Oops, looks like your OS does not support UTF-8"); // if OS does not support UTF-8
        }
        System.out.println("*-*-*-*-*-*-*-*-* Songify *-*-*-*-*-*-*-*-* " + // our simple menu
                "\nWelcome to Songify, all of the commands are given below:" +
                "\nC <Name>: Creates a person with the name given in the line." +
                "\nS <Name> <Song>: Sets the <Name> likes the <Song>" +
                "\nE <Name> <Song>: Erases the assignment (<Name> doesn't like the song anymore)." +
                "\nL <Name>: Lists the songs of the person <Name> likes." +
                "\nN: List all name of registered people." +
                "\nM: List all the songs that liked by anyone." +
                "\nR: Recommends the most popular 3 different songs.");
        System.out.print("> ");  // that '>' symbol indicates the program awaiting a response from user
        Scanner scanner = null;
        scanner = new Scanner(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        while (true) { // while loop is required to always get inputs from user
            if (!CommandManager.handle(new String(scanner.next().getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8)))  // we'll use CommandManager class which helps out to simply and organize our code
                System.out.println("Please supply an argument."); // if given input is not suitable we must get a new input
            System.out.print("> "); // that '>' symbol indicates the program awaiting a response from user
        }
    }
}
