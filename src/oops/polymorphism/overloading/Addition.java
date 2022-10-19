package oops.polymorphism.overloading;

public class Addition {
    // Static keyword is used for better memory management
    /*
    Static methods can be accessed from inside a class without object
    Static method can be accessed outside a class by using the class name
    Static method belongs to the class and not to any particular object
     */
    // Method Overloading
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    static float add(float a, float b){
        return a+b;
    }
    /*
    public static void main(String[] args) {
        System.out.println("Add 2 nos: " + add(1,2));
        System.out.println("Add 3 nos: " + add(1,2,3));
        System.out.println("Add 4 nos: " + add(1,2,3,4));
    }

     */
}
class OverLoadingExample{
    public static void main(String[] args) {
        System.out.println(Addition.add(1,2));
        System.out.println(Addition.add(1,2,3));

    }

}
