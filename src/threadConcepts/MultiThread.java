package threadConcepts;

public class MultiThread extends Thread {
    private  int threadNumber;
    public MultiThread(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for (int i=1; i<=5; i++){
            //System.out.println(i);
            System.out.println(i + " from thread " + threadNumber);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}
