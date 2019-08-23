public class Sprint5 { // Create threads that run one at a time.
    public static void main (String[] args) {
        System.out.println("Creating Runnable...");
        Runnable runnable = new NumCount();
        Thread threadCount = new Thread(runnable);
        Thread threadExtra = new Thread(runnable);
        Thread threadThree = new Thread(runnable);
        threadCount.start();
        threadExtra.start();
        threadThree.start();
    }
} // Finished in ?:??

public class NumCount implements Runnable {

    @Override // Run must be overridden.
    public void run() {
        synchronized (this) {
            try {
                System.out.println("Thread " + Thread.currentThread().getId() + " has started.");
                Thread.sleep(1000); // wait one full second before printing
                for (int num = 1; num <= 10; num++) {
                    Thread.sleep(1000);
                    System.out.println("Thread " + Thread.currentThread().getId() + ": " + num);
                }
            }
            catch (Exception e) { System.out.println(e); }
        }
    }
}