package leetcode.prefixsum;

/*
* https://leetcode.com/problems/find-the-highest-altitude/description/
* */
public class FindTheHighestAltitude_1732 {
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        int ans = largestAltitude(arr);
        System.out.println("Ans: " + ans);
    }

    private static int largestAltitude(int[] arr) {
        int[] prefix = new int[arr.length+1];
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            prefix[i+1] = prefix[i] + arr[i];
            max = Math.max(prefix[i], prefix[i+1]) > max ? Math.max(prefix[i], prefix[i+1]): max;
        }
        return max;
    }
}
