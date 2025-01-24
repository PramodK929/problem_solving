package leetcode.prefixsum;

public class MaximunScoreAfterSplittingAString_1422 {
    public static void main(String[] args) {
        String s = "10";
        int ans = maxScore(s);
        System.out.println("ans = " + ans);
    }

    private static int maxScore(String s) {
        int n = s.length();
        int[] zeros = new int[n];
        int[] ones = new int[n];
        int zCount=0, oCount=0, max=0;

        for(int i=0; i<n; i++) {
            if(s.charAt(i) == '0') {
                zCount++;
                zeros[i] = zCount;
                ones[i] = oCount;
            } else {
                oCount++;
                ones[i] = oCount;
                zeros[i] = zCount;
            }
        }

        for(int i=0; i<n; i++) {
            System.out.print(zeros[i] + " ");
        }
        System.out.println();
        for(int i=0; i<n; i++) {
            System.out.print(ones[i] + " ");
        }
        System.out.println();


        for(int i=0; i<n; i++) {
            int temp = zeros[i] + (oCount - ones[i]);
            if(temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
