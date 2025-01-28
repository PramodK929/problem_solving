package leetcode.prefixsum;

public class AntOnTheBoundary_3028 {
    public static void main(String[] args) {
        int[] nums = {3,2,-3,-4};
        int ans = returnToBoundaryCount(nums);
        System.out.println("Ans: "+ ans);
    }

    private static int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int sum = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(sum == 0 || nums[i] + sum == 0) count++;
            else sum += nums[i];
        }
        return count;
    }
}
