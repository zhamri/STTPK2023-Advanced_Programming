package my.sttpk2023;

class MultiTask extends Thread {

    private long start;
    private long end;

    public MultiTask(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        long sum = 0;

        for (long i = start; i < end; i++) {
            sum += i;
        }

        System.out.println(Thread.currentThread().getName() + " completed.");
    }
}

public class E2_MultiThreadExperiment {

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        int numberOfThreads = 4;

        MultiTask[] threads = new MultiTask[numberOfThreads];

        long range = 1_000_000_000L / numberOfThreads;

        for (int i = 0; i < numberOfThreads; i++) {

            long start = i * range;
            long end = (i + 1) * range;

            threads[i] = new MultiTask(start, end);

            threads[i].start();
        }

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i].join();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Execution Time: " + (endTime - startTime) + " ms");
    }
}

/*
Thread-1 completed.
Thread-2 completed.
Thread-0 completed.
Thread-3 completed.
Execution Time: 73 ms
 */
