def cyclic_sort(arr):
    i = 0

    while i < len(arr):
        correct_idx = arr[i] - 1

        if arr[i] != arr[correct_idx]:
            arr[i], arr[correct_idx] = arr[correct_idx], arr[i]
        else:
            i += 1

    return arr


if __name__ == "__main__":
    arr = [3, 2, 1, 4, 5]
    print(cyclic_sort(arr))
