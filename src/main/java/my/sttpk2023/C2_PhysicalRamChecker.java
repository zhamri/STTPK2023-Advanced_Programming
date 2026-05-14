package my.sttpk2023;

import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;

public class C2_PhysicalRamChecker {

    public static void main(String[] args) {

        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

        long totalRAM = osBean.getTotalMemorySize();

        double totalGB = totalRAM / (1024.0 * 1024.0 * 1024.0);

        System.out.println("Total Physical RAM: "
                + String.format("%.2f", totalGB)
                + " GB");
    }
}

/*
Total Physical RAM: 24.00 GB
 */