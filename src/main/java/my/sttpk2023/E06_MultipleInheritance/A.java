package my.sttpk2023.E06_MultipleInheritance;

public interface A {
    default void m1() {
        System.out.println("This is default method");
    }
}
