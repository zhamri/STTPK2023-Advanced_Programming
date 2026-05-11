package my.sttpk2023.E07_Predicate;

import java.util.function.Predicate;

class TestAND {

    public static void main(String[] args) {

        Predicate<Integer> greaterThan10 =
                x -> x > 10;

        Predicate<Integer> lessThan50 =
                x -> x < 50;

        Predicate<Integer> result =
                greaterThan10.and(lessThan50);

        System.out.println(result.test(30));
        System.out.println(result.test(5));
    }
}
