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

        int cores = 10;
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(cores);

        for (int i = 0; i < cores; i++) {
            executor.execute(new PoolTask());
        }

        executor.shutdown();

        executor.awaitTermination(1, TimeUnit.HOURS);

        long endTime = System.currentTimeMillis();

        System.out.println("Execution Time: " + (endTime - startTime) + " ms");
    }
}
