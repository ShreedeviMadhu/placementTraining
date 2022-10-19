public class SumOfNumbers {
    static int addition(int x, int y){    // Method Declaration
        int z = x + y;
        return z;
    }
    static int subtraction(int x, int y){  // Method Declaration
        int z = x - y;
        return z;
    }
    static void printName(String name){
        System.out.println("Hi! " + name);
    }

    public static void main(String[] args) {
        //int a = 1000;
        //int b = 2000;
        //int a1 = 2;
        //int a2 = 3;
        //System.out.println("The sum is: " + addition(a, b));     // Method Call
        //System.out.println("The sum is: " + addition(a1, a2));
        //System.out.println("The difference is: " + subtraction(20, 30));
        printName("Raju");
        printName("Saurav");
        printName("Sneha");
        printName("Rudra");
    }
}
