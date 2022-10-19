import java.util.Scanner;

public class PrintingOddAndEvenInARange {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the range of the numbers: ");
        int r = sc.nextInt(); // 10
        for (int i=1; i<=r; i++){
            if(i%2==0)
            {
                System.out.println(i + " Even");
            }
            else
                {
                    System.out.println(i + " Odd");
                }
        }
    }
}
