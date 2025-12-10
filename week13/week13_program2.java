package week13;

class SharedBuffer {
    private int data;
    private boolean hasData = false; // false = empty, true = full

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // wait until data is consumed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Producer produced: " + value);
        notifyAll(); // notify consumer
    }

    public synchronized int consume() {
        while (!hasData) {
            try {
                wait(); // wait until there is data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int value = data;
        hasData = false;
        System.out.println("Consumer consumed: " + value);
        notifyAll(); // notify producer
        return value;
    }
}

class Producer implements Runnable {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class week13_program2 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}

