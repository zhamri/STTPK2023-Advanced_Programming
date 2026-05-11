package my.sttpk2023.E03_InBuildInterface;

class Test {
    public static void main(String[] args) {
         Runnable r = new MyRunnableImpl();
         Thread t = new Thread(r);
         t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Test: " + i);
        }
    }
}
