package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
      LinkedList myLinkedList = new LinkedList(2);
      myLinkedList.append(1);
      myLinkedList.append(7);
      myLinkedList.printList();
      myLinkedList.insert(1,20);
      myLinkedList.printList();

    }
}