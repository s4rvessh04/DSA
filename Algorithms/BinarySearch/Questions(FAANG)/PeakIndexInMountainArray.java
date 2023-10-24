// Leetcode Q852 (Easy)

/* 
 * SUMMARY:
 * Mountain or Bitonic arrays are arrays in which the elements are sorted in ascending order and then in descending order.
 * eg: [1,2,3,4,5,3,2]
 * There always is a peak element somewhere in array.
 * All the elements lesser to peak element is at index lesser than the current peak index
 * and elements are also present in the index higher than peak index.
 * 
 * In this question we have to find the peak index and return the index of that number.
 * 
 * APPROACH:
 * 
 * We can use binary search here and check 2 conditions:
 * if arr[mid] > arr[mid+1] => we are in the descending part of the array,
 * if arr[mid] < arr[mid+1] => we are in the ascending part of the array.
 * 
 * when in descending part we dont know if the mid element is the largest in the array,
 * so we change the end pointer to the current mid pointer.
 * 
 * when in ascending part we know that the element lies in the right part of the array,
 * so we change the start poniter to the mid + 1 position.
 * 
 * NOTE:
 * The loop condition or break condition will be start < end,
 * and when the start and the end pointers are over each other we have found the peak element.
 */

public class PeakIndexInMountainArray {
    static int solution(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 4, 3, 2 };
        System.out.println(solution(arr));
    }
}
