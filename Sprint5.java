public class Sprint5 {
    public static void main (String[] args) {
        NumCount threadCount = new NumCount();
        NumCount threadTwo = new NumCount();
        threadCount.start();
        threadTwo.start();
    }
} // Finished in 3:01

public class NumCount extends Thread { // Your task is to print both threads in an orderly fashion.

    @Override // Run must be overridden.
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " has started.");
        for (int num = 0; num < 101; num++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + num);
            try { Thread.sleep(500); } // wait 0.5 second before printing
            catch (InterruptedException ie) {} // null catch method; try method always requires catch following it
        }
        super.run(); // Super calls main class to run thread.
    }
}
