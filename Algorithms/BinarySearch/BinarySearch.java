import java.util.Arrays;

public class BinarySearch {
    static boolean isAscending(int[] arr) {
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopy);

        if (Arrays.equals(arr, arrCopy)) {
            return true;
        }
        return false;
    }

    static int binarySearch(int[] arr, int target) {
        int ptr1 = 0;
        int ptr2 = arr.length - 1;

        while (ptr2 >= ptr1) {
            int mid = (ptr2 + ptr1) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending(arr)) {
                if (target > arr[mid])
                    ptr1 = mid + 1;
                if (target < arr[mid])
                    ptr2 = mid - 1;
            } else {
                if (target < arr[mid])
                    ptr1 = mid + 1;
                if (target > arr[mid])
                    ptr2 = mid - 1;
            }
        }
        return -1;
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
        // int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] arr = new int[] { 9, 8, 5, 2, 1 };
        System.out.println(binarySearch(arr, -1));
    }
}