package controlStatements.jumpStatements;

public class ContinueExample {
    public static void main(String[] args) {
        for (int value = 0; value < 10; value++){ // Iterations
            if (value == 5){
                continue;
            }
            System.out.println(value);
        }
    }
}
