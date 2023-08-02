// 
// Leetcode Q645 (Easy)

/* SUMMARY:
 * Given an unsorted array of integers from 1 to N.
 * Find the number which is duplicated and missing,
 * return the form of array like [duplicatedNum, missingNum].
 * 
 * APPROACH:
 * 1. Sort the array using cyclic sort O(N) time complexity and O(1) space.
 * 2. Check the number which is out of its correct index.
 * 3. The number at wrong index is the duplicated num.
 * 4. The index at which it is present is the missing num.
 * 
 * NOTE: The array consists of integers ranging from 1 to N,
 * therefore, missing number is i + 1 (i being the current iteration).
 */

import java.util.ArrayList;
import java.util.List;

public class SetMismatch {
    static List<Integer> mismatch(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        CyclicSort.cyclicSort(arr);

        int i = 0;
        // Assuming this arr is sorted in ascending order.
        while (i < arr.length) {
            int correctIdx = arr[i] - 1;

            if (arr[i] != i + 1) {
                if (arr[i] == arr[correctIdx]) {
                    ans.add(arr[i]);
                    ans.add(i + 1);
                    return ans;
                }
            } else {
                i++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // int[] arr = new int[] { 1, 2, 2, 4 };
        int[] arr = new int[] { 1, 4, 2, 4 };
        // int[] arr = new int[] { 1, 1 };

        List<Integer> ans = mismatch(arr);
        System.out.println(ans.toString());
    }
}
