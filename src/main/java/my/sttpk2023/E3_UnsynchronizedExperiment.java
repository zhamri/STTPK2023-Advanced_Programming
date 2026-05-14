package my.sttpk2023;

class Counter {

    public int count = 0;

    public void increment() {
        count++;
    }
}

class CounterTask extends Thread {

    private Counter counter;

    public CounterTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100000; i++) {
            counter.increment();
        }
    }
}

public class E3_UnsynchronizedExperiment {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        CounterTask t1 = new CounterTask(counter);
        CounterTask t2 = new CounterTask(counter);

        long startTime = System.currentTimeMillis();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long endTime = System.currentTimeMillis();

        System.out.println("Final Counter Value: " + counter.count);

        System.out.println("Expected Value: 200000");

        System.out.println("Execution Time: " + (endTime - startTime) + " ms");
    }
}

/*
Final Counter Value: 125257
Expected Value: 200000
Execution Time: 3 ms
 */
