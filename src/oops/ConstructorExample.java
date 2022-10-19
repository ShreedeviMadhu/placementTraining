package oops;

public class ConstructorExample {
    int x;
    int y;
    int z;
    public ConstructorExample(){
        x = 2;
        y = 3;
    }
    public ConstructorExample(int a, int b){
        x = a;
        y = b;
    }
    public ConstructorExample(float a, float b, float c){
        x = (int) a;
        y = (int) b;
        z = (int) c;
    }
    public ConstructorExample(int a, int b, int c){
        z = c;
        x = a;
        y = b;
    }
}

class Demo{
    public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample();
        System.out.println(obj1.x);
        System.out.println(obj1.y);
        ConstructorExample obj2 = new ConstructorExample(10, 20);
        System.out.println(obj2.x);
        System.out.println(obj2.y);
        ConstructorExample obj3 = new ConstructorExample(4,5,6);
        System.out.println(obj3.x);
        System.out.println(obj3.y);
        System.out.println(obj3.z);
        ConstructorExample obj4 = new ConstructorExample(2.5f, 3.4f, 4.6f);
        System.out.println(obj4.x);
        System.out.println(obj4.y);
        System.out.println(obj4.z);

    }
}
