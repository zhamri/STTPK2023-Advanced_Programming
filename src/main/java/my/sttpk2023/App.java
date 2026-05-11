package my.sttpk2023;

/**
 * Hello world!
 *
 */
public class App {
    static void display() {
        System.out.println("Malaysia");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        display();

        Runnable a = () -> System.out.println("This is Lambda");
        a.run();
    }
}
