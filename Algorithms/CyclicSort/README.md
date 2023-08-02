# Cyclic Sort

Cyclic sort is an in-place, unstable sorting algorithm, a comparison sort that is theoretically optimal in terms of the total number of writes to the original array, unlike any other in-place sorting algorithm. It is based on the idea that the permutation to be sorted can be factored into cycles, which can individually be rotated to give a sorted result.

## Complexity

* **Time**: worst ![ltx1](https://latex.codecogs.com/svg.latex?O(n^2)), best ![ltx2](https://latex.codecogs.com/svg.latex?O(n^2)), average ![ltx3](https://latex.codecogs.com/svg.latex?O(n^2))
* **Space**: worst ![ltx4](https://latex.codecogs.com/svg.latex?O(1)) auxiliary

> When given a question related to range between 1 to N use this sorting method to solve the question.

Time complexity:

Worst case: O(N)

Best case: O(N)

## Logic

**The array needs all elements from 1 to N without skipping any numbers in between
in order to function w/o errors.**

* All the numbers are present in the array but are not sorted.
* We check if the num at index 0 is at its correct position or not.
* The correct position is `arr[idx] - 1`.
  * For example:

    given array: [2,3,5,1,4]

    index:[0,1,2,3,4]

    sorted array: [1,2,3,4,5]

    we check if arr[0] is at the correct position.
    Currently it is not, its index should be `1` in sorted array.
    so we swap this number with the correct index,
    and repeat till we get the correct number in the respective index.

    swap1 = [5,3,2,1,4]

    swap2 = [4,3,2,1,5]

    swap3 = [1,3,2,4,5]
* Now that `1` is at its correct index `0` we will look at the next number in array which is `3`.
  * swap4 = [1,2,3,4,5]
* Now the array is sorted correctly.
