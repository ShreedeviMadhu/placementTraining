package oops.abstraction.abstractClassesAndMethods;

abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle{
    void start() {
        System.out.println("A car starts with the keys...!");
    }
}
class Scooter extends Vehicle{
    void start(){
        System.out.println("A scooter starts with the kick...!");
    }
}
class Testing{
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Scooter s = new Scooter();
        s.start();
    }
}
