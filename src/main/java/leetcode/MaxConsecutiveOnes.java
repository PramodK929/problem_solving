package leetcode;

/*
*  https://leetcode.com/problems/max-consecutive-ones/description/
*/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println("Ans : "+ ans);
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int lt = 0;
        while(nums[lt] != 1)
            lt++;
        int rp = lt + 1;
        while(rp < nums.length && rp < nums.length) {
            int temp = 0;
            while(rp < nums.length && nums[rp++] == 1){
                temp++;
            }
            if(temp >= count) count = temp;
            rp++;
        }
        return ++count;
    }
}
