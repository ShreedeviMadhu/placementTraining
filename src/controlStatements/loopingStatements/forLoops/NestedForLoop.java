package controlStatements.loopingStatements.forLoops;

public class NestedForLoop {
    public static void main(String[] args) {
        System.out.println("i "+"j");
        for (int i=0; i<3; i++){  // 0, 1, 2

            for (int j=0; j<3; j++){

                System.out.println(i+" "+j); // 0,1,2,3,4, 1,2,3,4,5
            }
        }
    }
}
