package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // What we are searching : data
        // Where we are searching : source
        Pattern pattern = Pattern.compile("core java", Pattern.CASE_INSENSITIVE);  // data
        Matcher matcher = pattern.matcher("We are learning Core Java"); // input/source
        boolean matchFound = matcher.find(); // true / false
        System.out.println(matchFound);

        if (matchFound){
            System.out.println("Correct Match Found");
        }
        else {
            System.out.println("Match Not Found");
        }
    }
}
