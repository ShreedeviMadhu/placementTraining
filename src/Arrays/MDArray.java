package Arrays;

public class MDArray {
    // Array of arrays
    public static void main(String[] args) {
        // {{1, 2, 3, 4},{5, 6, 7, 8},{9, 8, 7, 6}};
        int[][] numbers = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 8, 7, 6}};

        // System.out.println(numbers[0][1]);
        for (int i=0; i<3;i++){ // rows
            for (int j=0; j<4;j++){ // columns
                System.out.print(" "+numbers[i][j]);
            }
            System.out.println();
        }
        // Jagged Array
        int[][] myNumbers = {{1, 2, 3, 4},
                             {5, 6, 7},
                             {9, 8, 7, 6, 5, 4}};
        for (int i=0; i<myNumbers.length; i++){ // rows
            for (int j=0; j<myNumbers[i].length;j++){ // columns
                System.out.print(" "+myNumbers[i][j]);
            }
            System.out.println();
        }
    }
}
