import java.util.ArrayList;

public class BinarySearch {
    static String check_occurrence(ArrayList<Integer> array, int target, int mid) {
        if (array.get(mid) == target) {
            if (mid - 1 >= 0 && array.get(mid - 1) == target) {
                return "Left";
            } else {
                return "Found";
            }
        } else if (array.get(mid) < target) return "Left";
        else return "Right";
    }

    public static int run(ArrayList<Integer>array, int target) {
        int l = 0;
        int r = array.size() - 1;

        while (r >= l) {
            int mid = (l + r) / 2;
            String result = check_occurrence(array, target, mid);
            if (result == "Found") return mid;
            else if (result == "Right") l = mid + 1;
            else if (result == "Left") r = mid - 1;
        }
        return -1;
    }
}