package leetcode.prefixsum;

public class SumOfAllOddLengthusbarray_1588 {
	public static void main(String args[]) {
		int[] arr = {1,4,2,5,3};
		int ans = sumOddLengthSubarrays(arr);
		System.out.println("\nAns : " + ans);
	}

	public static int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;

		int[] extra = new int[arr.length];

		for(int i=0; i<arr.length; i++) {
			if(i == 0) extra[i] = arr[i];
			else extra[i] = arr[i] + extra[i-1];
		}

		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[i]: " + arr[i] + " extra[i]: "+ extra[i]);
			sum = sum + arr[i] + extra[i];
		}
		return sum;
	}
}
