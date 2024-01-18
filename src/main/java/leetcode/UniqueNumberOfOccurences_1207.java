package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
* https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=daily-question&envId=2024-01-17
* */
public class UniqueNumberOfOccurences_1207 {

    public static void main(String[] args) {
        int[] arr = {1};
        boolean ans = uniqueOccurrences(arr);
        System.out.println("Ans: " + ans);
    }

    private static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean ans = false;
        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        ans = map.values().stream().distinct().collect(Collectors.toList()).size() == map.values().size();

        return ans;
    }
}
