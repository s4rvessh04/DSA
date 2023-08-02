// Microsoft Question
// Leetcode Q287 (Medium)

/* SUMMARY:
 * Given an array of integers from 1 to N.
 * Find the duplicate integer in the array and return it.
 *  
 * APPROACH:
 * 1. Check if the position of current integer is correct.
 * 2. If not then check if the number exists at its correct position.
 * 3. If true then return the number else increment the iteration.
 * 
 * NOTE: The numbers start from 1 to N not 0 to N.
 */

public class FindDuplicate {
    static int getDuplicate(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIdx = arr[i] - 1;

            if (arr[i] != i + 1) {
                if (arr[i] != arr[correctIdx]) {
                    int temp = arr[i];
                    arr[i] = arr[correctIdx];
                    arr[correctIdx] = temp;
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 1, 1, 5 };
        System.out.println(getDuplicate(arr));

    }
}
