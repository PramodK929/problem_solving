package leetcode;

public class MinSizeSubArraySum_209 {

    public static void main(String[] args) {
        int t = 7;
        int[] arr = {2,3,1,2,4,3};
        int ans = minSubArrayLen(t, arr);
        System.out.println("Ans: "+ ans);
    }

    private static int minSubArrayLen(int t, int[] arr) {
        int sum = 0;
        int min = 0;
        int i=0, j=1;
        while(j<arr.length) {
            if(arr[i] >= t || arr[j] >= t){
                return 1;
            }
            sum += arr[i] + arr[j];
            if(sum >= t && (j-1) < min) {
                min = j - i;
            }

            j++;
        }
        return min;
    }
}
