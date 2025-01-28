package leetcode.slidingwindow;

public class MinimumSizeSubArraySum_209 {
    public static void main(String[] args) {
        int target = 7;
        int[] nums =  {1,1,1,1,7};
        int ans = minSubArrayLen(target, nums);
        System.out.println("Ans : " + ans);
    }

    private static int minSubArrayLen(int target, int[] nums) {
        int i=0, j=i+1;
        int sum = nums[i] + (nums.length>1?nums[j]:0);
        int ans = Integer.MAX_VALUE;
        int temp = 0;
        for(int k=0; k<nums.length; k++) {
            temp += nums[k];
            if(nums[k] >= target) return 1;
        }

        if(temp < target) return 0;

        if(nums[i] >= target || nums[j] >= target) return 1;

        while(j<nums.length && i<j) {
                while(sum < target && j<nums.length) {
                    if((j-i)+1 < ans && sum>= target) ans = (j-i)+1;
                    j++;
                    if(j == nums.length) break;
                    sum += nums[j];
                }
                while(sum >= target && i<j) {
                    if((j-i)+1 < ans && sum>= target) ans = (j-i)+1;
                    sum -= nums[i];
                    i++;
                }
        }
        return ans;
    }
}
