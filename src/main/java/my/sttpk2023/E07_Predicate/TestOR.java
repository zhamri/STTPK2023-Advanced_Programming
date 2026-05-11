package my.sttpk2023.E07_Predicate;

import java.util.function.Predicate;

class TestOR {

    public static void main(String[] args) {

        Predicate<Integer> lessThan10 =
                x -> x < 10;

        Predicate<Integer> greaterThan100 =
                x -> x > 100;

        Predicate<Integer> result =
                lessThan10.or(greaterThan100);

        System.out.println(result.test(5));
        System.out.println(result.test(50));
        System.out.println(result.test(150));
    }
}
