package my.sttpk2023;

class SyncCounter {

    public int count = 0;

    public synchronized void increment() {
        count++;
    }
}

class SyncTask extends Thread {

    private SyncCounter counter;

    public SyncTask(SyncCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100000; i++) {
            counter.increment();
        }
    }
}

public class E4_SynchronizedExperiment {

    public static void main(String[] args)
            throws InterruptedException {

        SyncCounter counter = new SyncCounter();

        SyncTask t1 = new SyncTask(counter);
        SyncTask t2 = new SyncTask(counter);

        long startTime = System.currentTimeMillis();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long endTime = System.currentTimeMillis();

        System.out.println("Final Counter Value: "
                + counter.count);

        System.out.println("Expected Value: 200000");

        System.out.println("Execution Time: "
                + (endTime - startTime) + " ms");
    }
}

/*
Final Counter Value: 200000
Expected Value: 200000
Execution Time: 12 ms
 */
