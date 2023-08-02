// Amazon Question
// Leetcode Q268 (Easy)

/* SUMMARY:
 * Given an unsorted array of unsigned integers from 0 to N,
 * find the first missing number from the array.
 * 
 * APPROACH:
 * 1. Sort the array using cyclic sort.
 * 2. Run a for loop to find the number which is out of its index.
 * 3. Return that index.
 * 
 * NOTE: Check the edge cases properly before hand.
 * cyclic sort depends on swaping integers so if a number is greater than the length of array,
 * we should skip that integer.
 */

public class FindMissingNum {
    static int missingNum(int[] arr, int n) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == n) {
                i++;
            } else if (arr[i] != i) {
                int idx1 = i;
                int idx2 = arr[i];

                int temp = arr[idx1];
                arr[idx1] = arr[idx2];
                arr[idx2] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 1, 5, 4 };
        int n = 5;

        int missingNum = missingNum(arr, n);
        System.out.println(missingNum);
    }
}