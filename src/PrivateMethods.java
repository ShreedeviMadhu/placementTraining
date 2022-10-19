public class PrivateMethods {
    private void printingSomething(){
        System.out.println("Java");
    }
}
class PM extends PrivateMethods{
    PrivateMethods pm = new PrivateMethods();

}
