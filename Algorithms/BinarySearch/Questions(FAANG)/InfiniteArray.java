// Amazon Question
// GFG Question

/* 
 * SUMMARY:
 * Find the target in infinite array of n integers.
 * Solve in O(logN) time.
 * 
 * APPROACH:
 * Make exponential jumps and apply binary search.
 */

public class InfiniteArray {
    static int findIntegerIndex(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int boxSize = end - start + 1;
            int newStart = end + 1;

            end = end + (boxSize) * 2;
            start = newStart;
        }

        int ans = binarySearch(arr, target, start, end);
        return ans;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 8, 9, 10, 11 };
        int ans = findIntegerIndex(arr, 8);

        System.out.println(ans);
    }
}
