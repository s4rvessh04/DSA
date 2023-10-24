// Amazon, Google Question
// Leetcode Q33 (Medium)

/* 
 * SUMMARY:
 * Given an interger array which is sorted and rotated at some index i.
 * 
 * eg: arr = [0,1,2,4,5,6,7]
 *     rotatedArr = [4,5,6,7,0,1,2]
 *     rotatedIndex = 3
 * 
 * We are supposed to find the target in the array in O(logn) time.
 * 
 * APPROACH:
 * We use binary search till we find the pivot ie. the largest number in array.
 * Conditions for a pivot to exist are:
 * - rotatedArr[mid] > rotatedArr[mid + 1]
 * - rotatedArr[mid - 1] < rotatedArr[mid]
 * - rotatedArr[mid] <= rotatedArr[start] -> ignore all the elems from mid and shift end to mid - 1
 * - rotatedArr[mid] >= rotatedArr[start] -> ignore all the elems from mid and shift start to mid + 1
 * 
 * NOTE: WILL NOT WORK ON DUPLICATE ENTRIES IN THE ARRAY!
 */

public class SearchRotatedArray {
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int find(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int pivot = findPivot(arr);

        if (pivot == -1) {
            return BinarySearch.binarySearch(arr, target);
        }
        if (target == arr[pivot]) {
            return pivot;
        }
        if (target < arr[start]) {
            return BinarySearch.binarySearch(arr, target, pivot + 1, end);
        } else {
            return BinarySearch.binarySearch(arr, target, start, pivot - 1);
        }
    }

    public static void main(String[] args) {
        int[] rotatedArr = { 4, 5, 6, 7, 0, 1, 2 };
        // int[] rotatedArr = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int target = 6;

        System.out.println(find(rotatedArr, target));

    }

}
