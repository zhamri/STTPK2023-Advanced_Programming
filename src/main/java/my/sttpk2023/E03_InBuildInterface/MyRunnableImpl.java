package my.sttpk2023.E03_InBuildInterface;

class MyRunnableImpl implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyRunnableImple: " + i);
        }
    }
}
