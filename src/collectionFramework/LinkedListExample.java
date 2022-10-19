package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public void simpleLinkedListExample() {
        LinkedList<String> list = new LinkedList<>();
        list.add("UK");
        list.add("INDIA");
        list.add("AUS");
        list.add("USA");

        // Traversing list through Iterator
        Iterator itr = list.iterator(); // getting the Iterator
        while (itr.hasNext()) {         // Check if the iterator has elements
            System.out.println(itr.next()); // Print the element and move to the next element
        }
    }

    public static void main(String[] args) {
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.simpleLinkedListExample();
    }
}
