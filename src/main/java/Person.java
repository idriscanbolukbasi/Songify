public class Person {
    private String name;
    private SongList likedSongs = new SongList();
    Person next;

    public Person(String name) {
        this.name = name;
        next = null;
    }

    public void likeSong(String songName) {
        Song song = new Song(songName);
        if (likedSongs.contains(likedSongs, song)) {
            System.out.println(name + " already likes " + song);
            return;
        }
        if (Interface.songs.contains(Interface.songs, song)) {
            song = Interface.songs.get(Interface.songs, song);
            song.increaseCounter();
            likedSongs.add(likedSongs, song);
        } else {
            song.increaseCounter();
            likedSongs = likedSongs.add(likedSongs, song);
        }
    }

    public void doesntLikeSong(String songName) {
        Song song = new Song(songName);
        likedSongs = likedSongs.remove(likedSongs, song);
        Interface.songs.get(Interface.songs, song).decreaseCounter();
    }

    public SongList getLikedSongs() {
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
