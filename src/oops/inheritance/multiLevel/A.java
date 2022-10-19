package oops.inheritance.multiLevel;

public class A {
    void displayA(){
        System.out.println("Method of class A");
    }
}
class B extends A{
    void displayB(){
        System.out.println("Method of class B");
    }
}
class C extends B{
    void displayC(){
        System.out.println("Method of class C");
    }
    public static void main(String[] args) {
        A a = new A();
        a.displayA();
        System.out.println("-------------------------------------------------");
        B b = new B();
        b.displayA();
        b.displayB();
        System.out.println("-------------------------------------------------");
        C c = new C();
        c.displayA();
        c.displayB();
        c.displayC();
        System.out.println("-------------------------------------------------");
    }

}
