package my.sttpk2023;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class PoolTask implements Runnable {

    @Override
    public void run() {

        long sum = 0;

        for (long i = 0; i < 300000000L; i++) {
            sum += i;
        }

        System.out.println(Thread.currentThread().getName() + " completed.");
    }
}

public class E6_ExecutorServiceExperiment {

    public static void main(String[] args) throws InterruptedException {

        int cores = 14;
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(cores);

        for (int i = 0; i < 30; i++) {
            executor.execute(new PoolTask());
        }

        executor.shutdown();

        executor.awaitTermination(1, TimeUnit.HOURS);

        long endTime = System.currentTimeMillis();

        System.out.println("Execution Time: " + (endTime - startTime) + " ms");
    }
}

/*
pool-1-thread-4 completed.
pool-1-thread-12 completed.
pool-1-thread-6 completed.
pool-1-thread-7 completed.
pool-1-thread-10 completed.
pool-1-thread-13 completed.
pool-1-thread-8 completed.
pool-1-thread-5 completed.
pool-1-thread-11 completed.
pool-1-thread-9 completed.
pool-1-thread-14 completed.
pool-1-thread-3 completed.
pool-1-thread-1 completed.
pool-1-thread-2 completed.
Execution Time: 125 ms
 */