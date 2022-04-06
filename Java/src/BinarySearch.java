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
            switch (result) {
                case "Found":
                    return mid;
                case "Right":
                    l = mid + 1;
                    break;
                case "Left":
                    r = mid - 1;
                    break;
            }
        }
        return -1;
    }
}

// Interesting question on binary search

// Check the first and the last occurrence of the element in the list

//  We will use binary search for solving this question.

class Solution {
    interface Condition {
        String condition(int mid);
    }

    static int binarySearch(int left, int right, Condition condition) {
        while (right >= left) {
            int mid = (left + right) / 2;
            String result = condition.condition(mid);
            switch (result) {
                case "found":
                    return mid;
                case "right":
                    left = mid + 1;
                    break;
                case "left":
                    right = mid - 1;
                    break;
            }
        }
        return -1;
    }

    static int checkFirst(ArrayList<Integer> array, int target) {
        Condition c = mid -> {
            if (array.get(mid) == target) {
                if (mid > 0 && array.get(mid - 1) == target) return "left";
                else return "found";
            } else if (array.get(mid) < target) return "right";
            else return "left";
        };
        return binarySearch(0, array.size() - 1, c);
    }

    static int checkLast(ArrayList<Integer> array, int target) {
        Condition c = mid -> {
            if (array.get(mid) == target) {
                if (mid > 0 && array.get(mid + 1) == target) return "right";
                else return "found";
            } else if (array.get(mid) < target) return "right";
            else return "left";
        };
        return binarySearch(0, array.size() - 1, c);
    }

    static ArrayList<Integer> checkFirstAndLast(ArrayList<Integer> array, int target) {
        ArrayList<Integer> returnArray = new ArrayList<>();
        returnArray.add(checkFirst(array, target));
        returnArray.add(checkLast(array, target));
        return returnArray;
    }
}