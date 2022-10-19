package stringBufferAndBuilder;

public class StringBuilderExample {
    public void stringAppend(){
        StringBuilder sb = new StringBuilder("Placement"); // sb = Placement
        System.out.println("Old Text: " + sb); // Old Text: Placement
        sb.append(" Training"); // sb = Placement Training
        System.out.println("New Test: " + sb); // New Text: Placement Training
    }
    public void stringInsert(){
        StringBuilder sb = new StringBuilder("Ja");
        sb.insert(1, "av");  // Java
        System.out.println("After insertion: " + sb);
    }
    public void stringReverse(){
        StringBuilder sb = new StringBuilder("Core Java");
        sb.reverse();
        System.out.println("After reversing: " + sb);
    }

    public static void main(String[] args) {
        StringBuilderExample builderExample = new StringBuilderExample();
        builderExample.stringAppend();
        builderExample.stringInsert();
        builderExample.stringReverse();
    }
}
