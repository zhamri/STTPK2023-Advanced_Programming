package my.sttpk2023;

class RunnableTask implements Runnable {

    @Override
    public void run() {

        long sum = 0;

        for (long i = 0; i < 500000000L; i++) {
            sum += i;
        }

        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}

public class E5_RunnableExperiment {

    public static void main(String[] args)
            throws InterruptedException {

        long startTime = System.currentTimeMillis();

        Thread t1 = new Thread(new RunnableTask());
        Thread t2 = new Thread(new RunnableTask());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long endTime = System.currentTimeMillis();

        System.out.println("Execution Time: " + (endTime - startTime) + " ms");
    }
}

/*
Thread-0 finished.
Thread-1 finished.
Execution Time: 128 ms
 */
