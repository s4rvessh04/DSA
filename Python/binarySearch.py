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


# Interesting question on binary search

# Check the first and the last occurance of the element in the list

# We will use binary search for solving this question.

class Solution:
    def binary_search(self, left, right, condition):
        while right >= left:
            mid = (left + right) // 2
            result = condition(mid)

            if result == 'found': return mid
            elif result == 'right': left = mid + 1
            elif result == 'left': right = mid - 1
        return -1


    def check_last(self, array, target):
        def condition(mid):
            if array[mid] == target:
                if mid < len(array) - 1 and array[mid + 1] == target:
                    return 'right'
                else:
                    return 'found'
            elif array[mid] < target:
                return 'right'
            else: return 'left'

        return self.binary_search(0, len(array) - 1, condition)


    def check_first(self, array, target):
        def condition(mid):
            if array[mid] == target:
                if mid > 0 and array[mid - 1] == target:
                    return 'left'
                else: return 'found'
            elif array[mid] < target:
                return 'right'
            else: return 'left'

        return self.binary_search(0, len(array) - 1, condition)


    def check_first_and_last(self, array, target):
        return self.check_first(array, target), self.check_last(array, target)
