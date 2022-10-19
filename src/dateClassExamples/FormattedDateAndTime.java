package dateClassExamples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedDateAndTime {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println("Data before formatting: " + obj);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("E, MMMM dd yyyy");
        String requiredFormat = obj.format(format);
        System.out.println("Data after formatting: " + requiredFormat);

    }
}
