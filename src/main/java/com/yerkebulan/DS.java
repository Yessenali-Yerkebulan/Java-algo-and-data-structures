package com.yerkebulan;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class DS {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(2);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.insert(0, "X");
        dynamicArray.delete("A");
        dynamicArray.search("B");
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size);
        System.out.println("Capacity: "+dynamicArray.capacity);
        System.out.println(dynamicArray.isEmpty());
    }
}
