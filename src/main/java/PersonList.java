/** Deprecated version of LinkedList implementation new version is available on utils package
public class PersonList {
    Person head;

    public PersonList add(PersonList list, Person person) {
        if (list.head == null) list.head = person;
        else {
            Person last = list.head;
            while (last.next != null) last = last.next;
            last.next = person;
        }
        return list;
    }

    public void printList(PersonList list) {
        Person currentNode = list.head;

        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.next;
        }
    }

    public PersonList remove(PersonList list, Person person) {
        Person currentNode = list.head, prev = null;

        if (currentNode != null && currentNode.equals(person)) {
            list.head = currentNode.next;
            return list;
        }

        while (currentNode != null && !currentNode.equals(person)) {
            prev = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode != null) prev.next = currentNode.next;

        return list;
    }

    public boolean contains(PersonList list, Person person) {
        Person currentNode = list.head;

        if (currentNode != null && currentNode.equals(person)) {
            return true;
        }

        while (currentNode != null && !currentNode.equals(person)) {
            currentNode = currentNode.next;
        }

        return currentNode != null;
    }

    public Person get(PersonList list, Person person) {
        Person currentNode = list.head;

        if (currentNode != null && currentNode.equals(person)) {
            return currentNode;
        }

        while (currentNode != null && !currentNode.equals(person)) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    public int size(PersonList list) {
        int size = 0;

        Person currentNode = list.head;

        if (currentNode == null) return size;

        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }

}
 **/
