package my.sttpk2023.E07_Predicate;

import java.util.function.Predicate;

class TestInteger {

    public static void main(String[] args) {

        Predicate<Integer> isEven =
                num -> num % 2 == 0;

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(7));
    }
}
