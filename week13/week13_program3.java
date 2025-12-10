package week13;

class Counter {
    private int count = 0;

    // synchronized to avoid race condition
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterTask implements Runnable {
    private Counter counter;

    public CounterTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        // increment 1000 times
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class week13_program3 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(new CounterTask(counter));
        Thread t2 = new Thread(new CounterTask(counter));

        t1.start();
        t2.start();

        try {
            t1.join(); // wait for t1 to finish
            t2.join(); // wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count (expected 2000): " + counter.getCount());
    }
}

