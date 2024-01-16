package leetcode;

/*
* https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
*/

public class NumberOfSubArrayThreshold {
    public static void main(String[] args) {
        int[] arr = {11,13,17,23,29,31,7,5,2,3};//{2,2,2,2,5,5,5,8};
        int k = 3, threshold = 5;
        int ans = numOfSubarrays(arr, k, threshold);
        System.out.println("Ans : "+ ans);
    }

    private static int numOfSubarrays(int[] arr, int k, int threshold) {
        int lp=0;
        int sum = 0;
        int count = 0;
        while(lp < k) {
            sum+= arr[lp++];
        }
        if((sum/k) >= threshold) {
            count++;
        }
        System.out.println("count = "+ count + " sum = "+ sum);
        lp = 0; // [11,13,17,23,29,31,7,5,2,3]   k=3   t=5
        for(int rp=k; rp<arr.length; rp++) {
            sum += arr[rp];
            sum -= arr[lp];
            printData(arr, lp, rp);
            System.out.println("lp="+ lp + ", rp="+rp+", sum="+sum+", threshold="+threshold+ ", count="+count);
            if((sum/k) >= threshold) {
                count++;
            }
            lp++;
        }
        return count;
    }

    private static void printData(int[] arr, int lp, int rp) {
        for(int i=lp; i<=rp; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
