// Leetcode Q1095 (Hard)

/* 
 * SUMMARY:
 * 
 * APPROACH:
 */

public class FindInMountainArray {
    static int find(int[] arr, int target) {
        int peakElementIndex = PeakIndexInMountainArray.solution(arr);

        int indexSmallest = BinarySearch.binarySearch(arr, target, 0, peakElementIndex);
        if (indexSmallest != -1) {
            return indexSmallest;
        }

        int indexLargest = BinarySearch.binarySearch(arr, target, peakElementIndex + 1, arr.length - 1);
        if (indexLargest != -1) {
            return indexLargest;
        }

        return indexSmallest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 3, 1 };
        System.out.println(find(arr, 3));
    }

}
