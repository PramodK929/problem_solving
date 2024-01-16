package leetcode;

/*
 * problem description link:
 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
 */

public class SubstringWithThree {
    public static void main(String[] args) {
        String s = "aababcabc";
        int ans = countGoodSubstrings(s);
        System.out.println("ans : "+ ans);
    }

    private static int countGoodSubstrings(String s) {
        int i = 2;
        int count = 0;
        while(i < s.length()) {
            if(uniqueChars(s, i)) {
                count++;
            }
            i++;
        }
        return count;
    }

    private static boolean uniqueChars(String s, int i) {
        if((s.charAt(i) != s.charAt(i-1)) && (s.charAt(i) != s.charAt(i-2)) && (s.charAt(i-1) != s.charAt(i-2))) {
            return true;
        }
        return false;
    }
}
