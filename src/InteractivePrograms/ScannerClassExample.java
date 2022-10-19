package InteractivePrograms;

import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount: ");
        int p = sc.nextInt();
        System.out.println("Enter the time in years: ");
        int t = sc.nextInt();
        System.out.println("Enter the rate of interest in %: ");
        int r = sc.nextInt();

        float si = (p*t*r)/100;
        System.out.println("The Simple Interest is: " + si);
    }
}
