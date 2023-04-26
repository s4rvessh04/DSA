package main

import (
	"fmt"
	"math"
)

func twoCrystalBalls(arr []bool) int {
	var lenArr int = len(arr)
	var jump int = int(math.Sqrt(float64(lenArr)))
	var i int = jump

	for ; i < lenArr; i += jump {
		if arr[i] {
			break
		}
	}

	i -= jump

	for i, j := i, 0; j <= jump && i < lenArr; i, j = i+1, j+1 {
		if arr[i] {
			return i
		}
	}

	return -1

}

func main() {
	ans := twoCrystalBalls([]bool{false, false, false, false, true, true})
	fmt.Println(ans)
}
