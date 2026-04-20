package my.sttpk2023;

import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Ali"); // ali is stored at index 0
        names.add(0, "Abu"); // abu at index =0, ali at index 1

        System.out.println("current size-1 = " + names.size());
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("Find Ali = " + names.indexOf("Ali"));

    }
}
