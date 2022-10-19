package oops.inheritance.singleLevel;

public class Animal { // Parent Class
    void eat(){
        System.out.println("I am eating something...!!!");
    }
    void run(){
        System.out.println("I am running...!!!");
    }
}

class Dog extends Animal{ // Child Class
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.run();
    }
}
