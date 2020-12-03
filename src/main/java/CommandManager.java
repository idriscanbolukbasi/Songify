public class CommandManager {

    public static void CCommand(String name) {
        Person tempPerson = new Person(name);
        if (Interface.persons.contains(Interface.persons, tempPerson)) {
            System.out.println("Error: A name only can exists for a person. Either delete the existing person or create a person with different name.");
            return;
        }
        Interface.persons = Interface.persons.add(Interface.persons, tempPerson);
        System.out.println(name + " has been added.");
    }

    public static void SCommand(String name, String songName) {
        Person tempPerson = new Person(name);
        if (!Interface.persons.contains(Interface.persons, tempPerson)) {
            System.out.println("There's not such a person named " + name);
            return;
        }
        tempPerson = Interface.persons.get(Interface.persons, tempPerson);
        tempPerson.likeSong(songName);
        System.out.println(name + " likes " + songName);
    }

    public static void ECommand(String name, String songName) {
        Person tempPerson = new Person(name);
        if (!Interface.persons.contains(Interface.persons, tempPerson)) {
            System.out.println("There's not such a person named " + name);
            return;
        }
        tempPerson = Interface.persons.get(Interface.persons, tempPerson);
        SongList likedSongs = tempPerson.getLikedSongs();
        if (likedSongs.size(likedSongs) == 0) {
            System.out.println(name + " doesn't like any songs.");
            return;
        }
        if (!likedSongs.contains(likedSongs, new Song(songName))) {
            System.out.println(name + " has already doesn't like " + songName);
            return;
        }
        tempPerson.doesntLikeSong(songName);
        System.out.println(name + " now doesn't like " + songName);
    }

    public static void LCommand(String name) {
        Person tempPerson = new Person(name);
        if (!Interface.persons.contains(Interface.persons, tempPerson)) {
            System.out.println("There's not such a person named " + name);
            return;
        }
        tempPerson = Interface.persons.get(Interface.persons, tempPerson);
        SongList likedSongs = tempPerson.getLikedSongs();
        if (likedSongs.size(likedSongs) == 0) {
            System.out.println(name + " doesn't like any songs.");
            return;
        }
        System.out.println(Interface.songs.head.next == null ? "Song liked by " + name : "Songs liked by " + name);
        Interface.songs.printList(likedSongs);
    }

    public static void NCommand() {
        if (Interface.persons.size(Interface.persons) == 0) {
            System.out.println("There are not any persons have been added before.");
            return;
        }
        Interface.persons.printList(Interface.persons);
    }

    public static void MCommand() {
        if (Interface.songs.size(Interface.songs) == 0) {
            System.out.println("There are not any songs have been liked before.");
            return;
        }
        System.out.println(Interface.songs.head.next == null ? "Song has been added: " : "Songs have been added: ");
        Interface.songs.printList(Interface.songs);
    }

    public static void RCommand() {
        if (Interface.songs.size(Interface.songs) < 3) {
            System.out.println("There are not 3 different songs have been added before.");
            return;
        }
        Interface.songs = Interface.songs.bubbleSort(Interface.songs);
        System.out.println("Most popular 3 songs are: " +
                "\n1) " + Interface.songs.get(Interface.songs, 0) +
                "\n2) " + Interface.songs.get(Interface.songs, 1) +
                "\n3) " + Interface.songs.get(Interface.songs, 2));
    }

    public static boolean handle(String arguments) {
        String[] args = arguments.split(" ");
        if (args.length == 0 || arguments.length() == 0) {
            System.out.println("No commands are given.");
            return false;
        }
        switch (args[0]) {
            case "C":
                if (args.length != 2) {
                    System.out.println("Wrong usage for C <Name>.");
                    return false;
                }
                CCommand(args[1]);
                return true;
            case "S":
                if (args.length <= 2) {
                    System.out.println("Wrong usage for S <Name> <Song>.");
                    return false;
                }
                SCommand(args[1], arguments.replace(args[0] + " " + args[1] + " ", ""));
                return true;
            case "E":
                if (args.length <= 2) {
                    System.out.println("Wrong usage for E <Name> <Song>.");
                    return false;
                }
                ECommand(args[1], arguments.replace(args[0] + " " + args[1] + " ", ""));
                return true;
            case "L":
                if (args.length != 2) {
                    System.out.println("Wrong usage for L <Name>.");
                    return false;
                }
                LCommand(args[1]);
                return true;
            case "N":
                if (args.length != 1) {
                    System.out.println("Wrong usage for N.");
                    return false;
                }
                NCommand();
                return true;
            case "M":
                if (args.length != 1) {
                    System.out.println("Wrong usage for M.");
                    return false;
                }
                MCommand();
                return true;
            case "R":
                if (args.length != 1) {
                    System.out.println("Wrong usage for R.");
                    return false;
                }
                RCommand();
                return true;
            default:
                System.out.println("Given argument is not suitable.");
                return false;
        }
    }


}
