def insertion_sort(arr):
    for i in range(len(arr) - 1):
        for j in range(i + 1, 0, -1):
            if arr[j] < arr[j - 1]:
                arr[j], arr[j - 1] = arr[j - 1], arr[j]
            else:
                break

    return arr


if __name__ == "__main__":
    arr = [3, 4, 6, 2, 1]
    print(insertion_sort(arr))
