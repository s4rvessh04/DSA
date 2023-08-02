def bubble_sort(arr):
    n = len(arr)

    for i in range(n):
        for j in range(0, n - 1 - i):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

    return arr


if __name__ == "__main__":
    arr = [1, 2, 4, 3, 7]
    print(bubble_sort(arr))