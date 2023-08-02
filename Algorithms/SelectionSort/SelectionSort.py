def selection_sort(arr):
    for i in range(len(arr)):
        end_idx = len(arr) - 1 - i
        max_num_idx = get_max_num_idx(arr, 0, end_idx)

        arr[max_num_idx], arr[end_idx] = arr[end_idx], arr[max_num_idx]

    return arr


def get_max_num_idx(arr, start_idx, end_idx):
    curr_max_idx = end_idx

    for i in range(start_idx, end_idx):
        if arr[i] > arr[curr_max_idx]:
            curr_max_idx = i

    return curr_max_idx


if __name__ == "__main__":
    arr = [5, 4, 6, 7, 1, 2]
    print(selection_sort(arr))
