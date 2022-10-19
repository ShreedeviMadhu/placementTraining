package wrapperClasses;

public class WrapperClassesInJava {
    public static void main(String[] args) {
        Integer integer = 678;
        Double newDouble = 3.14;
        Character character = 'A';
        int a = 10;
        System.out.println(integer.intValue());
        System.out.println(newDouble.doubleValue());
        System.out.println(character.charValue());
        String newString = integer.toString(); // "678"
        System.out.println(newString.length());

    }
}
