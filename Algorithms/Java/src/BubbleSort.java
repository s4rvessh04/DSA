public class BubbleSort {
    static int[] solution(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 1 - i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 7, 4 };

        for (int i : solution(arr)) {
            System.out.println(i);
        }
    }
}
