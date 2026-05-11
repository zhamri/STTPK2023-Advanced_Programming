package my.sttpk2023.E07_Predicate;

import java.util.function.Predicate;

class TestString {

    public static void main(String[] args) {

        Predicate<String> startsWithA =
                name -> name.startsWith("A");

        System.out.println(startsWithA.test("Ali"));
        System.out.println(startsWithA.test("Zhamri"));
    }
}
