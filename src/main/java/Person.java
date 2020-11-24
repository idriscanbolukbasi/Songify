import java.util.LinkedList;

public class Person {
    private String name;
    private LinkedList<Song> likedSongs = new LinkedList<>();
    Person next;

    public Person(String name) {
        this.name = name;
    }

    public void likeSong(String songName) {
        Song song = new Song(songName);
        if (Interface.songs.contains(new Song(songName))) song = Interface.songs.get(Interface.songs.indexOf(song));
        song.increaseCounter();
        likedSongs.add(song);
        next = null;
    }

    public void doesntLikeSong(String songName) {
        Song song = new Song(songName);
        likedSongs.remove(song);
        Interface.songs.get(Interface.songs.indexOf(song)).decreaseCounter();
    }

    public LinkedList<Song> getLikedSongs() {
        return likedSongs;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        boolean isEqual = false;
        if (object != null && object instanceof Person) isEqual = ((Person) object).name.equals(this.name);
        return isEqual;
    }
}
