import utils.Node;

public class Song extends Node<Song> implements Comparable<Song> {
    private String name; // since we're swapping data of 2 songs this variable is cannot be final

    public Song(String name) { // all we need is just a name of the song
        super(name); // we're calling (inheriting in a way) the default constructor of node class
        this.name = name; // and setting the name into this class also
    }

    public String getName() {
        return name;
    } // we're using this method in equals method

    public void setName(String name) {
        this.name = name;
    } // we're using this method in swapData method

    public void increaseCounter() { // to make sure that this song is present in Interface.songs
        setData(getData() + 1);
        if (getData() == 1) Interface.songs = Interface.songs.add(Interface.songs, this);
    }

    public void decreaseCounter() { // that means the songs is just unliked by anyone who liked before
        setData(getData() - 1);
        if (getData() == 0)
            Interface.songs = Interface.songs.remove(Interface.songs, this); // if the song is doesn't liked by anyone
    } // it should be removed from Interface.songs

    @Override
    public int compareTo(Song o) {
        return Integer.compare(o.getData(), getData());
    } // to use in sorting mechanism

    @Override
    public boolean equals(Object object) { // to use contains method in LinkedList
        boolean isEqual = false;
        if (object != null && object instanceof Song) isEqual = ((Song) object).getName().equals(this.name);
        return isEqual;
    }

    @Override
    public String toString() {
        return this.name;
    } // to easy print names of the songs

    @Override
    public void swapData(Node<Song> node) { // to easily swap the data of 2 nodes instead of swapping them
        String tempName = node.getName();
        int tempData = node.getData();
        node.setName(name);
        node.setData(getData());
        this.name = tempName;
        this.setData(tempData);
    }
}
