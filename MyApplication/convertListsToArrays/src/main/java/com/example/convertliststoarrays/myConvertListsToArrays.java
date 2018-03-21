package com.example.convertliststoarrays;
import java.util.*;
public class myConvertListsToArrays {
    public static void main(String[] args) {
        String[] things = {"eggs", "lassers", "pie", "candies", "papers"};
        //convert things array to list. Why? to use the method that list offer us
        LinkedList<String> listOfThings = new LinkedList<String>(Arrays.asList(things));
         listOfThings.add("bike");
         //add item at the first position
         listOfThings.addFirst("firstItem");


         //covert back to the array
        things = listOfThings.toArray(new String[listOfThings.size()]);

        for (String x : things)
            System.out.printf("%s ", x);

    }
}
