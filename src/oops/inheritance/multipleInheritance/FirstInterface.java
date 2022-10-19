package oops.inheritance.multipleInheritance;

interface FirstInterface {
    public void method1();
}
interface SecondInterface {
    public void method2();
}
interface ThirdInterface {
    public void method3();
}
// WebDriver
class MIDemo implements FirstInterface, SecondInterface, ThirdInterface{
    public void method1(){
        System.out.println("ChromeBrowser");
    }
    public void method2(){
        System.out.println("FireFoxBrowser");
    }
    public void method3(){
        System.out.println("BraveBrowser");
    }
}
class MIExample{
    public static void main(String[] args) {
        MIDemo mid = new MIDemo();
        mid.method1();
        mid.method2();
        mid.method3();
    }
}

