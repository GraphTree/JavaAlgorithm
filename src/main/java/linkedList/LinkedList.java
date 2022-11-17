package linkedList;

import com.sun.jdi.connect.spi.TransportService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void create(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNode(int nodeValue) {
        if (head == null) {
            create(nodeValue);
        }
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traverse() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.println(tempNode.value);
            if (i != size - 1) {
                System.out.println(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }


    public void removeDup(LinkedList ll) {
        HashSet<Object> numbers = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            int curval = current.value;
            if (numbers.contains(current.value)) {
                prev.next = current.next;
                ll.size--;
            } else {
                numbers.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }

    public Integer nthToLast(LinkedList linkedList, int nth) {
        Node tempNode = head;
        int reverseI = 0;
        for (int i = 0; i < linkedList.size; i++) {
            reverseI--;
            tempNode = tempNode.next;
            if (-1 * reverseI == nth) {
                return tempNode.value;
            }

        }
        return -1;
    }

    LinkedList partition(LinkedList ll, int x) {
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (currentNode.value < x) {
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;
    }

    public LinkedList add(LinkedList one, LinkedList two) {
        LinkedList linkedList = new LinkedList();
        Node currentOne = one.head;
        Node currentTwo = two.head;
        int saved = 0;

        while (currentOne != null || currentTwo != null) {
            int result = saved;
            if (currentOne != null) {
                result +=currentOne.value;
                currentOne = currentOne.next;
            }
            if (currentTwo != null) {
                result +=currentTwo.value;
                currentTwo = currentTwo.next;
            }
            linkedList.insertNode(result % 10);
            saved = result / 10;

        }
        return linkedList;

    }
}
