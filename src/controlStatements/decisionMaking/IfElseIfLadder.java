package controlStatements.decisionMaking;

public class IfElseIfLadder {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        if (a>b){
            System.out.println(a + " is greater than " + b);
        }
        else if (b>a){
            System.out.println(b + " is greater than " + a);
        }
        else {
            System.out.println("a = " + a + " is equal to " + "b = " + b);
        }

    }
}
