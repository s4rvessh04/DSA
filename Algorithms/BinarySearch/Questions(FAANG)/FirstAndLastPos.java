// Meta Question
// Leetcode Q34 (Medium)

/*
 * SUMMARY:
 * Given an array of sorted integers find the first and last occurence of target.
 * Return [-1, -1] if not found.
 * Solve this problem in O(logn).
 * 
 * APPROACH:
 * Run two binary search loops and find the first and last position.
 */

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastPos {
    static int binarySearch(int[] arr, int start, int end, int target) {
        int index = -1;

        while (end >= start) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                index = mid;
                start++;
                end--;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
        }

        return index;
    }

    static List<Integer> firstAndLastIndex(int[] arr, int target) {
        List<Integer> ans = new ArrayList<>();

        int midIndex = (arr.length - 1) / 2;
        int firstIndex = binarySearch(arr, 0, midIndex, target);
        int lastIndex = binarySearch(arr, midIndex, arr.length - 1, target);

        ans.add(firstIndex);
        ans.add(lastIndex);

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 5, 6, 7, 7, 7, 7, 8, 9 };
        // int[] arr = new int[] { 5, 5, 5, 6, 6, 8, 9 };
        int target = 6;

        List<Integer> ans = firstAndLastIndex(arr, target);
        System.out.println(ans.toString());
    }

}
