public class TwoCrystalBalls {
    static int solution(boolean[] arr) {
        int lenArr = arr.length;
        int step = (int) Math.floor(Math.sqrt(lenArr));
        int i = step;

        for (; i < lenArr; i += step) {
            if (arr[i])
                break;
        }

        i -= step;

        for (int j = 0; j <= step && i < lenArr; ++j, ++i) {
            if (arr[i])
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        boolean[] arr = { false, false, false, false, false, true, true, true };
        System.out.println(solution(arr));
    }
}
