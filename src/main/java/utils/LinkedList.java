package utils;

public class LinkedList<T extends Node<T>> { // Total time complexity = T = O(N^2)
    T head; // we have to keep head to not lose the linked list

    public LinkedList<T> add(LinkedList<T> list, T node) { // T = O(N), to add nodes to end of the list
        if (list.head == null) list.head = node;
        else {
            T last = list.head;
            while (last.next != null)
                last = last.next; // T = O(N), since we're working with linked list we have to traverse to tail of the linked list to add
            last.next = node; // a node to the linked list
        }
        return list;
    }

    public void printList(LinkedList<T> list) { // T = O(N), to print list
        T currentNode = list.head;

        while (currentNode != null) { // T = O(N)
            System.out.println(currentNode);
            currentNode = currentNode.next;
        }
    }

    public LinkedList<T> remove(LinkedList<T> list, T node) { // T = O(N), we're using this method in E command
        T currentNode = list.head, prev = null; // the basic idea that lies on this method is not too hard to understand

        if (currentNode != null && currentNode.equals(node)) { // in the first place we're checking if the head of the list is that node we're looking for
            list.head = currentNode.next; // if it is we should remove it as giving the head of the linked list to next node from it
            return list;
        }

        while (currentNode != null && !currentNode.equals(node)) { // T = O(N)
            prev = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode != null) prev.next = currentNode.next;

        return list;
    }

    public boolean contains(LinkedList<T> list, T node) { // T = O(N), to check is the given node contained in the list
        T currentNode = list.head;

        if (currentNode != null && currentNode.equals(node)) {
            return true;
        }

        while (currentNode != null && !currentNode.equals(node)) { // T = O(N)
            currentNode = currentNode.next;
        }

        return currentNode != null;
    }

    public T get(LinkedList<T> list, T node) { // T = O(N), to get given node from the list
        T currentNode = list.head;

        if (currentNode != null && currentNode.equals(node)) {
            return currentNode;
        }

        while (currentNode != null && !currentNode.equals(node)) { // T = O(N)
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    public T get(LinkedList<T> list, int index) { // T = O(N), to get element of the linked list
        T currentNode = list.head;

        if (index == 0 && currentNode != null) return currentNode;

        for (int i = 0; i < index; i++) { // T = O(N)
            if (currentNode.next == null) return null;
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    public int size(LinkedList<T> list) { // T = O(N), to get size of the linked list
        int size = 0;

        T currentNode = list.head;

        if (currentNode == null) return size;

        while (currentNode != null) { // T = O(N)
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }

    public LinkedList<T> sort(LinkedList<T> list) { // bubble sort sorting requires T = O(N^2), in place, stable
        int size = list.size(list);
        if (size > 1) {
            for (int i = 0; i < size; i++) {
                T currentNode = list.head;
                T next = head.next;
                for (int j = 0; j < size - 1; j++) {
                    if (currentNode.getData() < next.getData()) {
                        currentNode.swapData(next); // it's too hard to change 2 node in a normal linked list we should consider using double linked list or
                    } // just simply change their data
                    currentNode = next;
                    next = next.next;
                }
            }
        }
        return list;
    }
}
