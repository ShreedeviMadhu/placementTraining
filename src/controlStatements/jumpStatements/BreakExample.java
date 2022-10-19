package controlStatements.jumpStatements;

public class BreakExample {
    public static void main(String[] args) {
        for (int value = 0; value < 10; value++){ // Iterations
            if (value == 5){
                break;
            }
            System.out.println(value);
        }
    }
}
