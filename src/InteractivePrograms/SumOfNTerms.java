package InteractivePrograms;

import java.util.Scanner;

public class SumOfNTerms {
    public static void main(String[] args) {
        int n = 10;
        int sum = (n*(n+1))/2;
        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int x = sc.nextInt();
        int mySum = 0;

        for (int i = 0; i<=x; i++){
            mySum = mySum + i;
        }
        System.out.println(mySum);

    }
}
