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
        int[] left = new int[n+1];
        int sum = 0;
        int total = n*(n+1)/2;
        for(int i=1; i<=n; i++) {
            left[i] = sum + i;
            sum = left[i];
            if(left[i] == total - left[i-1])
                return i;
        }
        return -1;
    }

}
