public class Sprint7 { // Your task is to 
    public static void main (String[] args) {
        Sync obj = new Sync();
        ThreadSyncd t1 = new ThreadSyncd(obj);
        ThreadSyncd t2 = new ThreadSyncd(obj);
        t1.start();
        t2.start();
    }
} // Finished in ?:??

public class ThreadSyncd extends Thread {
    Sync dual;
    public ThreadSyncd(Sync dual) { this.dual = dual; }
    public synchronized void run() { dual.printStatus(0); }
}

class Sync {
    synchronized void printStatus(int n) {
        for (int num = 0; num <= 10; num++) {
            if (num == 0) System.out.println("Thread " + Thread.currentThread().getId() + " has started.");
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + num);
            try { Thread.sleep(500); } // wait 0.5 second before printing
            catch (Exception e) { System.out.print(e); }
        }
    }
}
