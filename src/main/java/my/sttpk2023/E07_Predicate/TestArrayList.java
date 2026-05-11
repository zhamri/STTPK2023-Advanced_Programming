package my.sttpk2023.E07_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class TestArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(45);
        marks.add(80);
        marks.add(60);
        marks.add(30);

        Predicate<Integer> isPass =
                mark -> mark >= 50;

        for (Integer m : marks) {

            if (isPass.test(m)) {
                System.out.println(m + " PASS");
            }

        }
    }
}
