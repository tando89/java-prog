package com.example.queuejava;
import java.util.*;
public class myQueueJava {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<String>();

        q.offer("First");
        q.offer("Second");
        q.offer("Third");

        System.out.printf("%s ", q);
        System.out.println();
        //print the highest priority in the queue (first)
        System.out.printf("%s ", q.peek());
        System.out.println();
        //remove the highest priority in the queue (first)
        q.poll();
        System.out.printf("%s ", q);
    }
}
