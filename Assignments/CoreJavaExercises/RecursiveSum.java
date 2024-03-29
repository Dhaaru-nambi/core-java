package pkg;

import java.util.Arrays;

public class RecursiveSum {

	public static int recursiveSum(int[] arr, int index) {
		if (index == arr.length) {
			return 0;
		} else {
			return arr[index] + recursiveSum(arr, index + 1);
		}
	}

	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 5 };
		int result = recursiveSum(inputArray, 0);
		System.out.println("The sum of elements in the array " + " is " + result + ".");
	}
}
