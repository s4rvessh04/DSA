package main

import "fmt"

func bubbleSort(arr []int) []int {
	var n int = len(arr)

	for i := 0; i < n; i++ {
		for j := 0; j < n-1-i; j++ {
			if arr[j] > arr[j+1] {
				arr[j], arr[j+1] = arr[j+1], arr[j]
			}
		}
	}
	return arr
}

func runBubbleSort() {
	arr := []int{1, 4, 2, 7, 3}
	fmt.Println(bubbleSort(arr))
}
