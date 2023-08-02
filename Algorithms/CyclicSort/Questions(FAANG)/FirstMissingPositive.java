// Amazon Question
// Leetcode Q41 (Hard)

/* SUMMARY:
 * Given an unsorted array of signed integers,
 * find the first positive missing number from the array.
 * 
 * APPROACH:
 * 1. Sort the array using cyclic sort O(N) time complexity and O(1) space.
 * 2. Since we want positive missing integer, we check if the current interger is <= 0.
 * 3. Also we don't want to check the numbers greater than the length of array as it will result in error,
 * index out of bound.
 * 4. After sorting this array run a for loop for checking the missing positive number.
 * 
 * NOTE: Check the edge cases properly before hand.
 * Like integer <= 0 and integer >= arr.length
 */

public class FirstMissingPositive {
    static int findMissingNum(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIdx = arr[i] - 1;

            if (arr[i] >= arr.length || arr[i] <= 0) {
                i++;
            } else if (arr[i] != arr[correctIdx]) {
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 4, -1, 1 };
        // int[] arr = new int[] { 1, 2, 0 };
        // int[] arr = new int[] { 7, 8, 9, 11, 12 };

        System.out.println(findMissingNum(arr));
    }
}
