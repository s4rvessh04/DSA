import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class TestCases {
    public ArrayList<HashMap<String ,Object>> getBinarySearchTests() {
        ArrayList<HashMap<String, Object>> binarySearchTests = new ArrayList<HashMap<String, Object>>();
        binarySearchTests.add(new HashMap<String ,Object>() {{
            put("Input", new ArrayList<Integer>(Arrays.asList(6,5,3,2,1)));
            put("Target", 3);
            put("Output", 2);
        }});
        binarySearchTests.add(new HashMap<String ,Object>() {{
            put("Input", new ArrayList<Integer>(Arrays.asList(10,3,3,2,2,1)));
            put("Target", 3);
            put("Output", 1);
        }});
        binarySearchTests.add(new HashMap<String ,Object>() {{
            put("Input", new ArrayList<Integer>(Arrays.asList(7,5,4,2,1)));
            put("Target", 3);
            put("Output", 3);
        }});
        return binarySearchTests;
    }
}

public class Main {
    public static void main(String[] args) {
        // Write testcases and execute code here.
        TestCases tc = new TestCases();
        tc.getBinarySearchTests().forEach((test) -> {
            int result = BinarySearch.run((ArrayList<Integer>)test.get("Input"), (int)test.get("Target"));
            System.out.println(result == (int)test.get("Output"));
            assert result == (int)test.get("Output") : "Test Failed";
        });
        System.out.println("Tests Passed!");
    }
}