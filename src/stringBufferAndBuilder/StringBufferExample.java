package stringBufferAndBuilder;

public class StringBufferExample {
    public void stringAppend(){
        StringBuffer sb = new StringBuffer("Placement"); // sb = Placement
        System.out.println("Old Text: " + sb); // Old Text: Placement
        sb.append(" Training"); // sb = Placement Training
        System.out.println("New Test: " + sb); // New Text: Placement Training
    }
    public void stringInsert(){
        StringBuffer sb = new StringBuffer("Ja");
        sb.insert(1, "av");  // Java
        System.out.println("After insertion: " + sb);
    }
    public void stringReverse(){
        StringBuffer sb = new StringBuffer("Core Java");
        sb.reverse();
        System.out.println("After reversing: " + sb);
    }

    public static void main(String[] args) {
        StringBufferExample bufferExample = new StringBufferExample();
        bufferExample.stringAppend();
        bufferExample.stringInsert();
        bufferExample.stringReverse();
    }
}
