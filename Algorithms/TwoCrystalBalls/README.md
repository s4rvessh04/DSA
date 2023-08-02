# Two Crystal Balls

Given two crystal balls we have to find the minimum point at which the balls will break.

**INPUT:**

```java
Array<boolean> = [... false, false, false, false, true, true, true ...]
```

**OUTPUT:**

```txt
Interger n where n is the min breakpoint for crystall ball.

If not found return -1
```

## SOLUTION

We could have used linear search but it's O(n),
We could also have used binary search,
but if the ball breaks at the middle portion of the array
then the other half of the problem will be linear anyways.

SO to solve this problem we will use step index of sqrt(n),
which is the most efficient approach to this problem.

We jump by sqrt(N) (where N is the length of Array provided)
and find the first breaking crystal ball.

Upon finding the crystal ball we jump backward the current step amount,
run a second loop from this point to step amount
and find the second breaking crystall ball.
