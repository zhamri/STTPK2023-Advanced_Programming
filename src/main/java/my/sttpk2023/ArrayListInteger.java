package my.sttpk2023;

import java.util.ArrayList;

public class ArrayListInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(new Integer(10)); // indek 0 - wrapper class of Integer
        numList.add(12);  // indek 1
        numList.add(14); // indek 2
        numList.add(16); // indek 3

        System.out.println("current size-1 = " + numList.size());
        for (int i = 0; i < numList.size(); i++)
            System.out.println(numList.get(i)); // [i] // get(0), get(1), get(2), get(3)

        numList.set(1, 11); // update 11 at indeks 1

        System.out.println("");
        System.out.println("current size-2 = " + numList.size());
        for (int i = 0; i < numList.size(); i++)
            System.out.println(numList.get(i)); // [i]

        numList.add(0, 5); // insert data 5 at indeks 0
        numList.add(18);
        numList.add(20);
        numList.add(22);
        System.out.println("");
        System.out.println("current size-3 = " + numList.size());
        for (int i = 0; i < numList.size(); i++)
            System.out.println(numList.get(i)); // [i]   numList[i]

        System.out.println("");
        System.out.println("delete data at index 1 that is delete data 10");
        numList.remove(1); // remove data at index 1

        System.out.println("current size-4 = " + numList.size());
        for (int i = 0; i < numList.size(); i++)
            System.out.println(numList.get(i)); // [i]

        System.out.println("Index  = " + numList.indexOf(11));
    }
}
