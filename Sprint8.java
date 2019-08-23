public class WaitNotifyLive {
    public static void main(String[] args) {
        WaitNotifyLive iPod = new WaitNotifyLive();
        Apple b = iPod.new Apple(); // declaring new object
        b.start();
        synchronized(b) { // used to synchronize an object
            try {
                System.out.println("We will now sychronize b ");
                b.wait();
            }
            catch(InterruptedException e) {
                e.printStackTrace(); // prints stacked trace 
            }
            System.out.println("The total for object b is: " + b.total);
        }
    }

    class Apple extends Thread {
        int total;
        @Override
        public void run() {
            synchronized(this) {
                for(int i=0; i<=45; i++) total += i;
                notify();
            }
        }
    }
}