package leetcode.prefixsum;

public class SumOfAllOddLengthSubarrays_1588 {

    public static void main(String[] args) {
        int[] arr  = {1,4,2,5};
        int ans = sumOddLengthSubarrays(arr);
        System.out.println("Ans : "+ ans);
    }

    private static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        for(int i=1; i<n; i++) {
            arr[i] = arr[i] + arr[i-1];
        }

//        int sum = arr[n-1];
//        int j = 3;
//        while (j <= n) {
//
//            for(int i=0; i+j<=n; i++) {
//                sum += arr[i+j-1] - (i==0?0:arr[i-1]);
//            }
//            j+=2;
//        }
//        return sum;
        int sum = arr[n-1];
        for(int j=2; j<=n; j += 2) {
            int p = 0;
            for(int i=j; i<n; i++) {
                if(p==0) {
                    sum += arr[i];
                } else {
                    sum += arr[i] - arr[p-1];
                }
                p++;
            }
        }
        return sum;
    }

}
