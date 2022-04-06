import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class TestCases {
    public ArrayList<HashMap<String ,Object>> getBinarySearchTests() {
        ArrayList<HashMap<String, Object>> binarySearchTests = new ArrayList<>();

        binarySearchTests.add(new HashMap<>() {{
            put("Input", new ArrayList<>(Arrays.asList(6, 5, 3, 2, 1)));
            put("Target", 3);
            put("Output", 2);
        }});
        binarySearchTests.add(new HashMap<>() {{
            put("Input", new ArrayList<>(Arrays.asList(10, 3, 3, 2, 2, 1)));
            put("Target", 3);
            put("Output", 1);
        }});
        binarySearchTests.add(new HashMap<>() {{
            put("Input", new ArrayList<>(Arrays.asList(7, 5, 4, 2, 1)));
            put("Target", 3);
            put("Output", 3);
        }});
        return binarySearchTests;
    }
    public ArrayList<HashMap<String, Object>> getBinarySearchQuestionTests() {
        ArrayList<HashMap<String, Object>> binarySearchQuestionTests = new ArrayList<>();

        binarySearchQuestionTests.add(new HashMap<>() {{
            put("Input", new ArrayList<>(Arrays.asList(1, 1, 1, 1, 2, 2, 3, 4, 5, 6)));
            put("Target", 1);
            put("Output", new ArrayList<>(Arrays.asList(0, 3)));
        }});
        binarySearchQuestionTests.add(new HashMap<>() {{
            put("Input", new ArrayList<>(Arrays.asList(1, 2, 3, 3, 3, 4, 5, 6)));
            put("Target", 3);
            put("Output", new ArrayList<>(Arrays.asList(2, 4)));
        }});
        binarySearchQuestionTests.add(new HashMap<>() {{
            put("Input", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
            put("Target", 3);
            put("Output", new ArrayList<>(Arrays.asList(2, 2)));
        }});
        binarySearchQuestionTests.add(new HashMap<>() {{
            put("Input", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
            put("Target", 6);
            put("Output", new ArrayList<>(Arrays.asList(-1, -2)));
        }});

        return binarySearchQuestionTests;
    }
}

public class Main {
    public static void main(String[] args) {
        // Write testcases and execute code here.

        TestCases tc = new TestCases();
//        ArrayList<HashMap<String, Object>> cases = tc.getBinarySearchTests();
//        ArrayList<HashMap<String, Object>> cases = tc.getBinarySearchQuestionTests();
//        cases.forEach((test) -> {
//            int result = BinarySearch.run((ArrayList<Integer>)test.get("Input"), (int)test.get("Target"));
//            System.out.println(result == (int)test.get("Output"));
//            assert result == (int)test.get("Output") : "Test Failed";
//            ArrayList<Integer> result = Solution.checkFirstAndLast((ArrayList<Integer>) test.get("Input"), (int) test.get("Target"));
//            System.out.println(test.get("Output").equals(result) == true);
//            if (test.get("Output").equals(result) != true) {
//                throw new RuntimeException("Test Failed");
//            }
//            System.out.println(test.get("Output"));
//            System.out.println(result);
//        });
//        System.out.println("Tests Passed!");
    }
}