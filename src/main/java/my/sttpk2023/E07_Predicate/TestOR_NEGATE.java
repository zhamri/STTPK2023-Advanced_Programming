package my.sttpk2023.E07_Predicate;

import java.util.function.Predicate;

class TestOR_NEGATE {

    public static void main(String[] args) {

        Predicate<String> startsWithA =
                name -> name.startsWith("A");

        Predicate<String> startsWithZ =
                name -> name.startsWith("Z");

        Predicate<String> result =
                startsWithA.or(startsWithZ);

        Predicate<String> notResult =
                result.negate();

        System.out.println(result.test("Ali"));
        System.out.println(result.test("Zhamri"));
        System.out.println(result.test("John"));

        System.out.println("----");

        System.out.println(notResult.test("Ali"));
        System.out.println(notResult.test("John"));
    }
}
