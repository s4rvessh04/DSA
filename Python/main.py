# Make imports
from binarySearch import binary_search, Solution
import time

# Make test cases
tests_binary_search = [
    {
        "input": {
            "array": [4,3,2,1],
            "target": 3
        },
        "output": 1
    },
    {
        "input": {
            "array": [7,5,4,3,1],
            "target": 3
        },
        "output": 3
    },
    {
        "input": {
            "array": [6,6,5,4,3,3,3,2,1,1],
            "target": 3
        },
        "output": 4
    }, 
    {
        "input": {
            "array": [5,4,2,1],
            "target": 3
        },
        "output": -1
    }
]

test_check_pos = [
    {
        "input": {
            "array": [1,5,5,5,5,6,7],
            "target": 5
        },
        "output": (1, 4)
    }
]

# We can unpack a dictionary using the double start (**) before the dict variable.

if __name__ == "__main__":
    start = time.time() * 1000

    # Run the code here
    sol = Solution()

    tests = tests_binary_search
    # tests = test_check_pos

    for test in tests:
        # result = sol.check_first_and_last(**test["input"])
        result = binary_search(**test["input"])
        output = test["output"]
        assert result == output, f"Failed for: {test, result, output}"

    end = time.time() * 1000

    print(f"All passed in {end - start}ms")