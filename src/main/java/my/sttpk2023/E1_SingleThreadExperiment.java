package my.sttpk2023;

public class E1_SingleThreadExperiment {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        long sum = 0;

        for (long i = 0; i < 1_000_000_000L; i++) {
            sum += i;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Sum: " + sum);
        System.out.println("Execution Time: " + (endTime - startTime) + " ms");
    }
}

/*
Sum: 499999999500000000
Execution Time: 254 ms
 */
