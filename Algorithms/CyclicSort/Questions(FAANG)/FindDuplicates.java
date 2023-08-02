
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

public class FindDuplicates {
    static List<Integer> getDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
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
                duplicates.add(arr[j]);
            }
        }

        return duplicates;

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
        // int[] arr = new int[] { 1, 1, 2 };
        System.out.println(getDuplicates(arr).toString());

    }
}
