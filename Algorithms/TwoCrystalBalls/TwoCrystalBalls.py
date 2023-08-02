import math

def two_crystal_balls(arr):
    len_arr = len(arr)
    jump = int(math.sqrt(len_arr))
    
    i = jump
    j = 0

    while i < len_arr:
        if arr[i]:
            break

        i += jump

    i -= jump

    while j <= jump and i < len_arr:
        if arr[i]:
            return i
        
        j += 1
        i += 1

    return -1
    
if __name__ == "__main__":
    arr = [False, False, False, False, True, True, True, True]
    print(two_crystal_balls(arr))