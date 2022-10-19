package controlStatements.loopingStatements.whileLoops;

public class DoWhileExample {

    public static void main(String[] args) {
        int data = 10;

        do {
            System.out.println(data);
            data++;
        }
        while (data < 20);
    }

}
