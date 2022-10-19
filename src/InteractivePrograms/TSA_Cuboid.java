package InteractivePrograms;

import java.util.Scanner;

public class TSA_Cuboid {
    public static void main(String[] args) {
        // l,b,h to be taken from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int l = sc.nextInt();
        System.out.println("Enter the breadth");
        int b = sc.nextInt();
        System.out.println("Enter the height");
        int h = sc.nextInt();
        int tsa = 2*(l*b+b*h+l*h);

        System.out.println("The tsa of the cuboid is: " + tsa);
        // float aot = 0.5*(b*h);

    }
}
