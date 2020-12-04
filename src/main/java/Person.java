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
            likedSongs = likedSongs.add(likedSongs, song);
            song = Interface.songs.get(Interface.songs, song);
            song.increaseCounter();
            System.out.println(name + " likes " + songName);
        } else {
            song.increaseCounter();
            Song likedSong = new Song(songName);
            likedSongs = likedSongs.add(likedSongs, likedSong);
            System.out.println(name + " likes " + songName);
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
