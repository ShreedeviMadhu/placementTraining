public class MethodsInJava {

    static double simpleInterest(int p, int t, int r){
        double si = (p*t*r)/100;
        return si;
    }

    static int product(int x, int y){
        return x*y;
    }

    public static void main(String[] args) {
        double result = simpleInterest(2000, 5, 10);
        System.out.println("The SI is : " + result);
        System.out.println(product(2,3));
    }

}
