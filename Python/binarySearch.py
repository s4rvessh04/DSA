def binary_search(array, target):
    """
    In order to implement binary search algorithm
    we need the array to be sorted.

    Method used: Two pointers
    - Time Complexity: O(log n)
    - Space Complexity: O(1)
    """
    l, r = 0, len(array) - 1

    while r >= l:
        mid = (l + r) // 2
        result = check_first_occurance(array, target, mid)

        if result == 'found':
            return mid
        elif result == 'right':
            l = mid + 1
        elif result == 'left':
            r = mid - 1
    return -1

def check_first_occurance(array, target, mid):
    if array[mid] == target:
        if mid - 1 >= 0 and array[mid - 1] == target:
            return 'left'
        else:
            return 'found'
    elif array[mid] < target:
        return 'left'
    else:
        return 'right'
