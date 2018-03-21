package com.example.hashset;
import java.util.*;
public class myHastSet {
    public static void main(String[] args) {
        String[] things = {"eggs", "sausage", "pie", "bacon", "newspapers", "eggs"};
        List<String> list = Arrays.asList(things);

        System.out.printf("%s ", list);
        System.out.println();

        Set<String> newSet = new HashSet<String>(list);
        System.out.printf("%s ", newSet);
        System.out.println();
    }
}
