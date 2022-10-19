public class StringsInJava {
    public static void main(String[] args) {
        String name = "Java Programming";
        String last = "Language";
        String spaceVar = "             Software Testing                ";
        System.out.println("We are learning " + name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println("Original String: " + name);
        System.out.println(name + " " + last); // Concatenation (Adding Strings)
        System.out.println(name.indexOf('r', 7));
        System.out.println(spaceVar);
        System.out.println(spaceVar.trim());
        System.out.println(name.charAt(9));
    }
}
