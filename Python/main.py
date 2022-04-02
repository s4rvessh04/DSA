# Make imports
from binarySearch import binary_search
import time

# Make test cases
tests = [
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

# We can unpack a dictionary using the double start (**) before the dict variable.

if __name__ == "__main__":
    # Run the code here
    start = time.time() * 1000
    for test in tests:
        result = binary_search(**test["input"])
        output = test["output"]
        assert result == output, f"Failed for: {test, result, output}"
    end = time.time() * 1000
    print(f"All passed in {end - start}ms")