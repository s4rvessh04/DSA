public class CeilingOfNum {
    static int ceilingNum(int[] arr, int target) {
        int hi = arr.length - 1;
        int lo = 0;

        while (hi >= lo) {
            int mid = (hi + lo) / 2;

            if (target >= arr[arr.length - 1]) {
                return -1;
            }
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            }
        }

        return lo;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;

        System.out.println(ceilingNum(arr, target));
    }
}
