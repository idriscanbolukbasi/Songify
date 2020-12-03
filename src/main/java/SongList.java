public class SongList {
    Song head;

    public SongList add(SongList list, Song song) {
        if (list.head == null) list.head = song;
        else {
            Song last = list.head;
            while (last.next != null) last = last.next;
            last.next = song;
        }
        return list;
    }

    public void printList(SongList list) {
        Song currentNode = list.head;

        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.next;
        }
    }

    public SongList remove(SongList list, Song song) {
        Song currentNode = list.head, prev = null;

        if (currentNode != null && currentNode.equals(song)) {
            list.head = currentNode.next;
            return list;
        }

        while (currentNode != null && !currentNode.equals(song)) {
            prev = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode != null) prev.next = currentNode.next;

        return list;
    }

    public boolean contains(SongList list, Song song) {
        Song currentNode = list.head;

        if (currentNode != null && currentNode.equals(song)) {
            return true;
        }

        while (currentNode != null && !currentNode.equals(song)) {
            currentNode = currentNode.next;
        }

        return currentNode != null;
    }

    public Song get(SongList list, Song song) {
        Song currentNode = list.head;

        if (currentNode != null && currentNode.equals(song)) {
            return currentNode;
        }

        while (currentNode != null && !currentNode.equals(song)) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    public Song get(SongList list, int index) {
        Song currentNode = list.head;

        if (index == 0 && currentNode != null) return currentNode;

        while (currentNode != null || index >= 0) {
            index--;
        }

        return currentNode;
    }

    public int size(SongList list) {
        int size = 0;

        Song currentNode = list.head;

        if (currentNode == null) return size;

        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }

    public SongList bubbleSort(SongList list) {
        Song currentNode = list.head, prev = null;
        for (int i = 0; i < list.size(list); i++) {
            while (currentNode != null) {
                prev = currentNode;
                if (currentNode.next == null) {
                    currentNode = currentNode.next;
                    continue;
                }
                if (currentNode.getCounter() < currentNode.next.getCounter()) {
                    Song rest = currentNode.next.next;
                    prev.next = currentNode.next;
                    currentNode.next.next = currentNode;
                    currentNode.next = rest;
                }
                currentNode = currentNode.next;
            }
        }
        return list;
    }



}