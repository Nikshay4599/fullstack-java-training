
package week13;
public class week13_program1 {

    // Thread to print even numbers
    static class EvenPrinter implements Runnable {
        private int limit;

        public EvenPrinter(int limit) {
            this.limit = limit;
        }

        @Override
        public void run() {
            for (int i = 0; i <= limit; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even Thread: " + i);
                    try {
                        Thread.sleep(200); // just to slow down a bit
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // Thread to print odd numbers
    static class OddPrinter implements Runnable {
        private int limit;

        public OddPrinter(int limit) {
            this.limit = limit;
        }

        @Override
        public void run() {
            for (int i = 0; i <= limit; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd Thread: " + i);
                    try {
                        Thread.sleep(200); // just to slow down a bit
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int limit = 20;

        Thread evenThread = new Thread(new EvenPrinter(limit));
        Thread oddThread = new Thread(new OddPrinter(limit));

        evenThread.start();
        oddThread.start();
    }
}
