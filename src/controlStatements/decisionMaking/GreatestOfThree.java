package controlStatements.decisionMaking;

public class GreatestOfThree {
    public static void main(String[] args) {
        int a = 11;
        int b = 10;
        int c = 12;

        if (a > b && a > c){
            System.out.println(a + " is the greatest number.");
        }
        else if (b > a && b > c){
            System.out.println(b + " is the greatest number.");
        }
        else {
            System.out.println(c + " is the greatest number.");
        }

    }
}
