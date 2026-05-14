package my.sttpk2023;

/*
This program shows: JVM memory allocation, not the full physical RAM installed in the computer
 */

public class C3_JvmChecker {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        // RAM values in bytes
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long maxMemory = runtime.maxMemory();

        long usedMemory = totalMemory - freeMemory;

        // Convert bytes to MB
        double totalMB = totalMemory / (1024.0 * 1024.0);
        double freeMB = freeMemory / (1024.0 * 1024.0);
        double usedMB = usedMemory / (1024.0 * 1024.0);
        double maxMB = maxMemory / (1024.0 * 1024.0);

        System.out.println("===== RAM INFORMATION =====");

        System.out.printf("Total Memory : %.2f MB%n", totalMB);
        System.out.printf("Free Memory  : %.2f MB%n", freeMB);
        System.out.printf("Used Memory  : %.2f MB%n", usedMB);
        System.out.printf("Max Memory   : %.2f MB%n", maxMB);
    }
}
