package threadConcepts;

public class MultiThreading {
    public static void main(String[] args) {
        //MultiThread t1 = new MultiThread();
        //MultiThread t2 = new MultiThread();

        //t1.start();
        //t2.start();
        for (int i = 0; i<=5; i++){
            MultiThread thread = new MultiThread(i);
            thread.start();
        }
        //throw new RuntimeException();

    }
}
