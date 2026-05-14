package my.sttpk2023;

import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;

class MultiTask2 extends Thread {

    private long start;
    private long end;

    public MultiTask2(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        long sum = 0;

        for (long i = start; i < end; i++) {
            sum += i;
        }

        System.out.println(Thread.currentThread().getName()
                + " completed.");
    }
}

public class E2x_MultiThreadExperiment {

    public static void main(String[] args)
            throws InterruptedException {

        // =====================================
        // CPU MONITORING
        // =====================================

        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

        // =====================================
        // MEMORY MONITORING
        // =====================================

        Runtime runtime = Runtime.getRuntime();

        // Clean unused memory
        runtime.gc();

        // Memory BEFORE execution
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        // =====================================
        // START TIMER
        // =====================================

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

        // Wait for all threads to complete
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i].join();
        }

        // =====================================
        // END TIMER
        // =====================================

        long endTime = System.currentTimeMillis();

        // =====================================
        // MEMORY AFTER EXECUTION
        // =====================================

        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        // =====================================
        // CALCULATE MEMORY USAGE
        // =====================================

        double memoryUsedMB = (memoryAfter - memoryBefore) / (1024.0 * 1024.0);

        // =====================================
        // GET CPU USAGE
        // =====================================

        Thread.sleep(1000);

        double cpuUsage = osBean.getProcessCpuLoad() * 100;

        // =====================================
        // DISPLAY RESULTS
        // =====================================

        System.out.println("\n===== MULTITHREAD RESULT =====");

        System.out.println("Execution Time: "
                + (endTime - startTime)
                + " ms");

        System.out.printf("Multithread CPU Usage: %.2f %% %n",
                cpuUsage);

        System.out.printf("Multithread Memory Usage: %.2f MB %n",
                memoryUsedMB);
    }
}

/*
Thread-1 completed.
Thread-3 completed.
Thread-2 completed.
Thread-0 completed.

===== MULTITHREAD RESULT =====
Execution Time: 75 ms
Multithread CPU Usage: 0.13 %
Multithread Memory Usage: 2.16 MB
 */