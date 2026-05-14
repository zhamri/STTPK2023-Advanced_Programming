package my.sttpk2023;

import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;

public class E1x_SingleThreadMonitoring {

    public static void main(String[] args) {

        // Get OS Bean
        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

        // Memory before execution
        Runtime runtime = Runtime.getRuntime();

        runtime.gc();

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        // Start time
        long startTime = System.currentTimeMillis();

        // =========================
        // SINGLE THREAD TASK
        // =========================

        long sum = 0;

        for (long i = 0; i < 1_000_000_000L; i++) {
            sum += i;
        }

        // =========================

        // End time
        long endTime = System.currentTimeMillis();

        // Memory after execution
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        // CPU usage
        double cpuLoad = osBean.getProcessCpuLoad() * 100;

        // Memory usage in MB
        double memoryUsedMB = (memoryAfter - memoryBefore) / (1024.0 * 1024.0);

        System.out.println("===== SINGLE THREAD RESULT =====");

        System.out.println("Execution Time: "
                + (endTime - startTime)
                + " ms");

        System.out.printf("CPU Usage: %.2f %% %n", cpuLoad);

        System.out.printf("Memory Usage: %.2f MB %n", memoryUsedMB);

        System.out.println("Sum: " + sum);
    }
}

/*
Execution Time: 249 ms
CPU Usage: 14.59 %
Memory Usage: 3.69 MB
Sum: 499999999500000000
 */
