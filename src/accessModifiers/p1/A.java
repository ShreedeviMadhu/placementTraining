package accessModifiers.p1;

class ABC {
    private int value = 20;
    private void message(){
        System.out.println("Private Method");
    }

}

public class A {
    public static void main(String[] args) {

        ABC obj = new ABC();

        // System.out.println(obj.value);
        //obj.message();
    }
}


