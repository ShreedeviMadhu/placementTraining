package dateClassExamples;

import java.time.LocalDate;

public class DisplayCurrentDate {
    public static void main(String[] args) {
        LocalDate obj = LocalDate.now();
        System.out.println("Today's date is: " + obj);
    }
}
