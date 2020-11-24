public class PersonList {
    Person head;

    public PersonList insert(PersonList list, String personName) {
        Person newPerson = new Person(personName);
        if (list.head == null) list.head = newPerson;
        else {
            Person last = list.head;
            while (last.next != null) last = last.next;
            last.next = newPerson;
        }
        return list;
    }

}
