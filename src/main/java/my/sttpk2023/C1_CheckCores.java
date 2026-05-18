package my.sttpk2023;

public class C1_CheckCores {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println(cores);
    }
}

/*
14
 */