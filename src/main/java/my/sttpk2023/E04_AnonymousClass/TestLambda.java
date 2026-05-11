package my.sttpk2023.E04_AnonymousClass;

class TestLambda {
    public static void main(String[] args) {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("Anonymous: " + i);
//                }
//            }
//        });
//        t.start();

        Thread t = new Thread(
                () -> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Anonymous: " + i);
                    }
                }
        );
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Test: " + i);
        }
    }
}
