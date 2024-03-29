package pkg;

import java.util.Arrays;

public class SmallestValue{

    public static int findSmallest(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else {
            return Math.min(arr[0], findSmallest(Arrays.copyOfRange(arr, 1, arr.length)));
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {5, 2, 8, 1, 10, 3};
        int result = findSmallest(inputArray);
        System.out.println("The smallest value in the array " + " is " + result + ".");
    }
}
