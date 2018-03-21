package com.example.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class myLinkedlist {
    public static void main(String[] args) {
        String[] things = {"eggs", "lassers", "pie", "candies", "papers"};
        List<String> list1 = new LinkedList<>();
        //add every item from things array into list1
        for (String x : things)
            list1.add(x);

        String[] things2 = {"eggs", "sausage", "pie", "bacon", "newspapers"};
        List<String> list2 = new LinkedList<>();
        for (String y : things2)
            list2.add(y);

        list1.addAll(list2);
        list2 = null;

        printMe(list1);
        removeItem(list1, 2, 5);
        printMe(list1);
        reverseMe(list1);
    }
    //printMe()
    private static void printMe(List<String> l) {
        //loop thru the list of array (l) in this case and temporary call each of element as string b
        for (String b : l)
            System.out.printf(" %s ", b);
        //make a blank line clean purpose
         System.out.println();
    }
    //removeItem()
    private static void removeItem(List<String> l, int from, int to) {
        l.subList(from, to).clear();
    }
    //reverseMe()
    private static void reverseMe(List<String> l) {
        ListIterator<String> rList = l.listIterator(l.size());
        while (rList.hasPrevious()) {
            System.out.printf("%s ", rList.previous());
        }
    }

}
