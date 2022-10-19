package oops;

public class Employee {
    int empId;
    String name;
    int salary;

    public Employee(int empId, String name, int salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        System.out.println("I am inside constructor");
    }
    void display(){
        System.out.println(this.empId + " " + this.name + " " + this.salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "Raju", 40000);
        Employee emp2 = new Employee(101, "Dewang", 50000);
        Employee emp3 = new Employee(102, "Sneha", 60000);
        Employee emp4 = new Employee(104, "Raju", 40000);
        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
    }

}
