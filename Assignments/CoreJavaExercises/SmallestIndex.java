package pkg;
public class SmallestIndex {

    public static int findSmallestIndex(int[] arr) {
        return findSmallestIndexHelper(arr, 0);
    }

    private static int findSmallestIndexHelper(int[] arr, int start) {
        if (start == arr.length - 1) {
            return start; // Base case: reached the end of the array
        } else {
            // Recursive case: compare current element with the smallest element in the rest of the array
            int restSmallestIndex = findSmallestIndexHelper(arr, start + 1);
            return (arr[start] < arr[restSmallestIndex]) ? start : restSmallestIndex;
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {5, 3, 8, 1, 7};
        int smallestIndex = findSmallestIndex(inputArray);
        System.out.println("The index of the smallest value in the array is: " + smallestIndex);
    }
}
