package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public void declarationExample() {
        List<String> list1 = new ArrayList<>(); // Creating a list of type ArrayList
        list1.add("UK");
        list1.add("INDIA");
        list1.add("AUS");
        list1.add("USA");
        System.out.println("Printing List1.....................");
        new ListExample().readListData(list1);

        List<String> list2 = new LinkedList<>(); // Creating a list of type LinkedList
        list2.add("UK");
        list2.add("INDIA");
        list2.add("AUS");
        list2.add("USA");
        System.out.println("Printing List2.....................");
        new ListExample().readListData(list2);

        if (list1.equals(list2)) {
            System.out.println("Lists are equal");
        }
        else {
            System.out.println("Lists are not equal");
        }
        list1.add(2, "NY");
        System.out.println("List1 details: " + list1);
        // UK INDIA NY AUS USA  : AUS INDIA NY UK USA

        ArrayList<String> abc = new ArrayList<>();
        abc.add("UK");
        abc.add("INDIA");
        abc.add("AUS");
        abc.add("USA");

        readListData(abc); // Wrong Implementation
        if (abc.equals(list2)) {
            System.out.println("Lists are equal");
        }
        else {
            System.out.println("Lists are not equal");
        }
        Collections.sort(list1);
        System.out.println("List1 details: " + list1);
    }

    public void readListData(List<String> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        ListExample listExample = new ListExample();
        listExample.declarationExample();

    }
}
