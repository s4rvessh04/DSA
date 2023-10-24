public class NextGreatestLetter {
    static char getNextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr[start % arr.length];
    }

    public static void main(String[] args) {
        char[] arr = new char[] { 'c', 'f', 'j' };
        char target = 'f';

        System.out.println(getNextGreatestLetter(arr, target));

    }

}