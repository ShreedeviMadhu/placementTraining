package stringBufferAndBuilder;

public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();   // 8:30
        StringBuffer stringBuffer = new StringBuffer("Placement");
        for (int i=0; i<200000; i++){
            stringBuffer.append(" Training");
        }
        System.out.println("Time taken by String Buffer: " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis(); // 9:32
        StringBuilder stringBuilder = new StringBuilder("Placement");
        for (int i=0; i<200000; i++){
            stringBuilder.append(" Training");
        }
        System.out.println("Time taken by String Builder: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}
