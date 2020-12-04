import utils.Node;

public class Song extends Node<Song> implements Comparable<Song> {
    private String name;

    public Song(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return getData();
    }

    public void increaseCounter() {
        setData(getData() + 1);
        if (getData() == 1) Interface.songs = Interface.songs.add(Interface.songs, this);
    }

    public void decreaseCounter() {
        setData(getData() - 1);
        if (getData() == 0) Interface.songs = Interface.songs.remove(Interface.songs, this);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Song o) {
        return Integer.compare(o.getData(), getData());
    }

    @Override
    public boolean equals(Object object) {
        boolean isEqual = false;
        if (object != null && object instanceof Song) isEqual = ((Song) object).getName().equals(this.name);
        return isEqual;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void swapData(Node<Song> node) {
        String tempName = node.getName();
        int tempData = node.getData();
        node.setName(name);
        node.setData(getData());
        this.name = tempName;
        this.setData(tempData);
    }
}
