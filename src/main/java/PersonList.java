/**
 * Deprecated version of LinkedList implementation new version is available on utils package
 * public class PersonList {
 * Person head;
 * <p>
 * public PersonList add(PersonList list, Person person) {
 * if (list.head == null) list.head = person;
 * else {
 * Person last = list.head;
 * while (last.next != null) last = last.next;
 * last.next = person;
 * }
 * return list;
 * }
 * <p>
 * public void printList(PersonList list) {
 * Person currentNode = list.head;
 * <p>
 * while (currentNode != null) {
 * System.out.println(currentNode);
 * currentNode = currentNode.next;
 * }
 * }
 * <p>
 * public PersonList remove(PersonList list, Person person) {
 * Person currentNode = list.head, prev = null;
 * <p>
 * if (currentNode != null && currentNode.equals(person)) {
 * list.head = currentNode.next;
 * return list;
 * }
 * <p>
 * while (currentNode != null && !currentNode.equals(person)) {
 * prev = currentNode;
 * currentNode = currentNode.next;
 * }
 * <p>
 * if (currentNode != null) prev.next = currentNode.next;
 * <p>
 * return list;
 * }
 * <p>
 * public boolean contains(PersonList list, Person person) {
 * Person currentNode = list.head;
 * <p>
 * if (currentNode != null && currentNode.equals(person)) {
 * return true;
 * }
 * <p>
 * while (currentNode != null && !currentNode.equals(person)) {
 * currentNode = currentNode.next;
 * }
 * <p>
 * return currentNode != null;
 * }
 * <p>
 * public Person get(PersonList list, Person person) {
 * Person currentNode = list.head;
 * <p>
 * if (currentNode != null && currentNode.equals(person)) {
 * return currentNode;
 * }
 * <p>
 * while (currentNode != null && !currentNode.equals(person)) {
 * currentNode = currentNode.next;
 * }
 * <p>
 * return currentNode;
 * }
 * <p>
 * public int size(PersonList list) {
 * int size = 0;
 * <p>
 * Person currentNode = list.head;
 * <p>
 * if (currentNode == null) return size;
 * <p>
 * while (currentNode != null) {
 * size++;
 * currentNode = currentNode.next;
 * }
 * return size;
 * }
 * <p>
 * }
 **/
