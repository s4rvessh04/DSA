/* Given two crystal balls we have to find the minimum point at which the balls will break.
 * INPUT:
 * Array<boolean> = [... false, false, false, false, true, true, true ...]
 * 
 * OUTPUT:
 * Interger n where n is the min breakpoint for crystall ball.
 * 
 * If not found return -1
 */

public class TwoCrystalBalls {
    /*
     * We could have used linear search but it's O(n),
     * We could also have used binary search,
     * but if the ball breaks at the middle portion of the array
     * then the other half of the problem will be linear anyways.
     * 
     * SO to solve this problem we will use step index of sqrt(n),
     * which is the most efficient approach to this problem.
     */

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
