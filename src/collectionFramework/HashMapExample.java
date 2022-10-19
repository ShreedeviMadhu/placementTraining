package collectionFramework;

import java.util.HashMap;

// Key/value pair
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> marksOfStudents = new HashMap<>();
        marksOfStudents.put("Rudra", 85);
        marksOfStudents.put("Sneha", 86);
        marksOfStudents.put("Soumya", 87);

        for (String i : marksOfStudents.keySet()){
            System.out.println(i);
        }
        for (int i : marksOfStudents.values()){
            System.out.println(i);
        }
    }
}
