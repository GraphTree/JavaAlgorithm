package linkedList;

public class MainTest {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.createSingleLinkedList(1);
        sll.InsertLinkedList(2,2);
        sll.InsertLinkedList(3,3);
        sll.InsertLinkedList(4,2);
        sll.travserrseSingleLinkedList();
        sll.searchNode(4);
    }
}
