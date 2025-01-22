package leetcode.prefixsum;

import java.util.*;

public class FindThePivotInteger_2485 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = pivotInteger(n);
        System.out.println("Ans: " + res);
    }

    private static int pivotInteger(int n) {
        int[] left = new int[n];
        int sum = 0;
        for(int i=1; i<=n; i++) {
            left[i-1] = sum + i;
            sum = left[i-1];
        }
        int[] right = new int[n];
        sum = 0;
        for(int i=n; i>0; i--) {
            right[i-1] = sum + i;
            sum = right[i-1];
        }

        for(int i=0;i<left.length; i++) {
            if(left[i] == right[i]) {
                return i+1;
            }
        }
        return -1;
    }

}
