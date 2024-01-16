package leetcode;

public class MaximumAverageSrray1_643 {
    public static void main(String[] args) {
        int[] arr = {0,4,0,3,2};
        int k = 1;
        double ans = findMaxAverage(arr, k);
        System.out.println("And : " + ans);
    }

    private static double findMaxAverage(int[] arr, int k) {
        double avg = 0.0000;
        int sum = 0;
        int lp = 0, rp=k;
        while(lp < rp) {
            sum += arr[lp];
            lp++;
        }
        lp=0;
        avg = (double) sum/k;
        while(rp < arr.length) {
            int newSum = (sum - arr[lp])+arr[rp];
            double newAvg = (double) newSum/k;
            if(newAvg > avg) {
                avg = newAvg;
            }
            sum = newSum;
            lp++;
            rp++;
        }
        return avg;
    }
}
