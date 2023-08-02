import java.util.Arrays;

public class SelectionSort {
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int endIdx = arr.length - 1 - i;
            int maxNumIdx = getMaxNumIdx(arr, 0, endIdx);

            // Swap the nums by their index
            int temp = arr[maxNumIdx];
            arr[maxNumIdx] = arr[endIdx];
            arr[endIdx] = temp;
        }

        return arr;

    }

    static int getMaxNumIdx(int[] arr, int startIdx, int endIdx) {
        int currMaxNumIdx = endIdx;

        for (int i = startIdx; i < endIdx; i++) {
            int currNum = arr[i];
            int currMaxNum = arr[currMaxNumIdx];

            if (currNum > currMaxNum) {
                currMaxNumIdx = i;
            }
        }

        return currMaxNumIdx;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 5, 6, 4, 3, 8, 1 };
        int[] sortedArr = selectionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
