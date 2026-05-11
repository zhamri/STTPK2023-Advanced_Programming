package my.sttpk2023.E05_DefaultMethod;

public interface A {
    default void m1() {
        System.out.println("This is default method from A interface");
    }

//    void m1();
}
