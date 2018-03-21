package com.example.collectionsjava;

import java.util.*;

public class myClass {
    public static void main(String[] args) {
        String[] things = {"eggs", "lassers", "pie", "candies"};
        List<String> list1 = new ArrayList<String>();

        //add array items to list
        for (String x : things)
            list1.add(x);

        String[] morethings = {"lassers", "pie"};
        List<String> list2 = new ArrayList<String>();

        for (String y : morethings)
            list2.add(y);

        for(int i = 0; i<list1.size();i++) {
            System.out.printf("%s ", list1.get(i));
        }
        editList(list1, list2);
        System.out.println();


        for(int i = 0; i<list1.size();i++) {
            System.out.printf("%s ", list1.get(i));
        }
    }

    public static void editList(Collection<String> l1, Collection<String>l2) {
        //Iterator go to (loop thru) each list item by item
        Iterator<String> it = l1.iterator();
        //loop thru while it has something next to it
        while (it.hasNext()) {
            // if any of the item that we loop thru from list1 match with the item in list2
            if(l2.contains(it.next())) {
                //remove it
                it.remove();
            }
        }
    }
}
