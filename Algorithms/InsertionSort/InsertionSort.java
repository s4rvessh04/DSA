import java.util.Arrays;

public class InsertionSort {
    static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 5, 4, 2, 3, 1 };
        int[] sortedArr = insertionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

}
