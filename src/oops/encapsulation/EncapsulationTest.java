package oops.encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Rudra");
        s1.setRollNo(256);
        s1.setAge(25);

        System.out.println("Name: " + s1.getName() + " Rollno: " + s1.getRollNo() + " Age: " + s1.getAge());
    }

}
