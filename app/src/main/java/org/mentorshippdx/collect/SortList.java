package org.mentorshippdx.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrate sorting a list made of {@link java.lang.String} -- a class that already implements {@link java.lang.Comparable}.
 */
public class SortList {

    public static void main(String[] args) {
        // Note this example uses *static* methods for a "procedural" example to show
        // the basic List/Collections interactions.

        List<String> nameList = buildNames();
        System.out.println("Unsorted names:");
        printList(nameList);

        System.out.println("\n=========\n");

        System.out.println("Sorted names:");
        Collections.sort(nameList);
        printList(nameList);
    }

    private static List<String> buildNames() {
        List<String> nameList = new ArrayList<>(); // check out java.util.Arrays#asList for a less verbose way

        nameList.add("Dan"); // #1
        nameList.add("Brad");
        nameList.add("Alice");
        nameList.add("Dan"); // #2
        nameList.add("Stephen");
        nameList.add("Loren");
        nameList.add("Lindsey");
        nameList.add("Matt");

        return nameList;
    }

    // Consider moving this to a common Utils class if this method ends up being reused
    private static void printList(List<String> list) {
        for (String elem : list) {
            System.out.println(elem);
        }
    }
}
