public class NarrowingCasting {
    public static void main(String[] args) {
        double myDouble = 55.88;
        int myInteger = (int) myDouble;
        long myLong = (long) myDouble;
        byte myByte = (byte) myDouble;
        System.out.println(myInteger);  // 55
    }
}
