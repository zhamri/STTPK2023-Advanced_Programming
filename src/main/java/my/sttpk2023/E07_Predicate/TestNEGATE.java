package my.sttpk2023.E07_Predicate;

import java.util.function.Predicate;

class TestNEGATE {

    public static void main(String[] args) {

        Predicate<Integer> isEven =
                x -> x % 2 == 0;

        Predicate<Integer> isOdd =
                isEven.negate();

        System.out.println(isOdd.test(4));
        System.out.println(isOdd.test(7));
    }
}
