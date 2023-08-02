import java.util.Arrays;

public class CyclicSort {
    static int[] cyclicSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIdx = arr[i] - 1;

            if (arr[i] != arr[correctIdx]) {
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            } else {
                i++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 4, 2, 1, 5 };
        int[] sortedArr = cyclicSort(arr);

        System.out.println(Arrays.toString(sortedArr));
    }

}
