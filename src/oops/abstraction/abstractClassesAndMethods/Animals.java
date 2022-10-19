package oops.abstraction.abstractClassesAndMethods;

abstract class Animals{
    // Abstract Method
    public abstract void sound();

    // Normal Method
    void run(){
        System.out.println("The animal runs...!!!");
    }
}
class Turtle extends Animals{

    public void sound() {
        System.out.println("The Turtle runs very slowly...!");
    }
}
class Cheetah extends Animals{
    public void sound() {
        System.out.println("The Cheetah runs very fast...!");
    }
}

class Abstraction{
    public static void main(String[] args) {
        Turtle t1 = new Turtle();
        t1.sound();
        t1.run();
        Cheetah c1 = new Cheetah();
        c1.sound();
        c1.run();
    }
}
