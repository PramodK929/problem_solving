package leetcode;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        int ans = lengthOfLongestSubstring(s);
        System.out.println("ans = "+ ans);
    }

    private static int lengthOfLongestSubstring(String s) {
        int len = 0;
        Map<Character, Integer> map = new HashMap<>();
        int lp=0;
        int max = 0;
        map.put(s.charAt(lp), 1);
        for(int rp=1; rp<s.length(); ) {
            char rv = s.charAt(rp);
            char lv = s.charAt(lp);
            if(!map.containsKey(rv)){
                map.put(rv, 1);
            }
            if(rv == lv && (rp-lp >= max)) {
                max = rp-lp;
                lp = rp;
                map = new HashMap<>();
            }
            rp++;
        }
        return max;
    }
}

