def is_ascending(arr):
    sorted_arr = sorted(arr)

    if sorted_arr == arr:
        return True
    return False



def binary_search(arr, target):
    ptr1 = 0
    ptr2 = len(arr) - 1

    while ptr2 >= ptr1:
        mid = (ptr2 + ptr1) // 2
        
        if arr[mid] == target:
            return mid
        
        if is_ascending(arr):
            if target > arr[mid]:
                ptr1 = mid + 1
            
            if target < arr[mid]:
                ptr2 = mid - 1

        else:
            if target < arr[mid]:
                ptr1 = mid + 1
            
            if target > arr[mid]:
                ptr2 = mid - 1



    return -1

if __name__ == "__main__":
    arr = [2,3,4,7,8,10]
    # arr = [10, 9, 8, 5, 3, 2, 1]

    print(binary_search(arr, 10))