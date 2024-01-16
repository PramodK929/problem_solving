package util;

import java.util.*;

public class Generation {
    public static int[] generateIntegerArray(int size, int min, int max) {
        int[] arr = new int[size];
        int range = (max - min) + 1;
        for(int i=0; i<size; i++) {
            arr[i] = (int)(Math.random() * range) + min;
        }
        return arr;
    }

    public static int[] generateUniqueIntegerArray(int size, int min, int max) {
        int[] arr = new int[size];
        Set<Integer> map = new HashSet<>();
        int range = (max - min) + 1;
        for(int i=0; i<size; i++) {
            int num = (int)(Math.random() * range) + min;
            if(!map.contains(num)) {
                arr[i] = num;
            } else {
                map.add(num);
            }
        }
        return arr;
    }
}
