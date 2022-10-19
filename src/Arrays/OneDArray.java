package Arrays;

public class OneDArray {
    public static void main(String[] args) {
        // Indexing starts from 0 to n-1
        String[] name = {"Rudra", "Sneha", "Sachin"};
        int[] numbers = {1,2,3,4,5};
        char[] letters = {'a', 'b', 'c', 'd', 'e','f','g'};
        System.out.println(name.length);
        System.out.println(numbers.length);

        for (int i =0; i<letters.length; i++){
            System.out.print(letters[i] + " ");
        }
        System.out.println();
        // System.out.println(name[4]);

        // for each loop or enhanced for loop
        // Syntax :
        /*
        for (datatype var : array_name) {
                // statements
        }
         */
        for (int x : numbers) {
            System.out.print(x + " ");
        }

        int values[] = new int[3];
        int mdArray[][] = new int[3][4];
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        values[3] = 40;

    }
}
