package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    /**
     * old way of defining ArrayList
     */

    public void nonGenericArrayListExample() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("Test");
        list.add(3.14);
        System.out.println(list);
    }
    /**
     * Proper way of declaring an ArrayList
     * Telling the type of the list and storing only particular type of data
     */

    public void genericArrayListExample() {
       ArrayList<String> list = new ArrayList<>(); // List is a ArrayList of String
       list.add("UK");
       list.add("INDIA");
       list.add("AUS");
       list.add("USA");
       // list.add(1); will throw compile time error as the list doesn't accept integers.
        System.out.println(list);
    }
    public void listIteratorExample() {
        ArrayList<String> list = new ArrayList<>();
        list.add("UK");
        list.add("INDIA");
        list.add("AUS");
        list.add("USA");

        // Traversing the list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    /**
     * List with for-each loop
     */
    public void listForEachExample() {
        ArrayList<String> list = new ArrayList<>();
        list.add("UK");
        list.add("INDIA");
        list.add("AUS");
        list.add("USA");
        for (String country : list){
            System.out.println(country);
        }
    }

    public static void main(String[] args) {
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.nonGenericArrayListExample();
        arrayListExample.genericArrayListExample();
        arrayListExample.listIteratorExample();
        arrayListExample.listForEachExample();
    }

}
