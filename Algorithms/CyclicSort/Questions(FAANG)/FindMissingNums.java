// Google Question
// Leetcode Q448 (Easy)

/* SUMMARY:
 * Given an array of integers from 1 to N.
 * Find all the duplicate elements in the array and return it.
 *  
 * APPROACH:
 * 1. Sort the array using cyclic sort O(N) time complexity and O(1) space.
 * 2. Run a for loop and add the integers to an array which are out of their correct index.
 * 3. Return the array.
 * 
 * NOTE: The numbers start from 1 to N not 0 to N.
 */

import java.util.ArrayList;
import java.util.List;

public class FindMissingNums {
    static List<Integer> missingNums(int[] arr) {
        List<Integer> missingNums = new ArrayList<>();

        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i] - 1;

            if (arr[i] != arr[correctIdx]) {
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                missingNums.add(j + 1);
            }
        }

        return missingNums;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 6, 2, 1, 1, 1, 7, 8 };
        List<Integer> missingNums = missingNums(arr);

        System.out.println(missingNums.toString());
    }
}
