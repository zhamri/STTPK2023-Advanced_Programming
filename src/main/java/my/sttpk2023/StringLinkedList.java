package my.sttpk2023;

import java.util.Iterator;
import java.util.LinkedList;

public class StringLinkedList {

    public static void main(String[] args) {
        LinkedList<String> colorList = new LinkedList<String>();

        colorList.add("red");
        colorList.add(0, "green");
        colorList.add("blue");
        colorList.add(1, "yellow");
        colorList.remove(colorList.size() - 1);
        // colorList.remove(4-1) // colorList.remove(3) // remove blue
        // green->yellow->red – the latest linked list

        System.out.println("\nDisplay data using Iterator");
        Iterator listItr = colorList.iterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        } // while

        System.out.println("\nDisplay data using for loop");
        String myColor;
        for (int i = 0; i < colorList.size(); i++) {
            myColor = colorList.get(i);
            System.out.println(myColor);
        }

        System.out.println("\nDisplay data using for enhanced loop");
        for (String element : colorList)
            System.out.println(element + " ");


    } // method main
} // class StringLinkedList
