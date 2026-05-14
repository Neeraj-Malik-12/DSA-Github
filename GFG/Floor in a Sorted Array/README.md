# Floor in a Sorted Array

## Problem Statement
Given a sorted array `arr[]` and an integer `x`, find the index of the largest element that is less than or equal to `x`.

If no such element exists, return `-1`.

## Approach
This problem is solved using Binary Search.

- If the middle element is greater than `x`, search on the left side.
- Otherwise, store the current index as a possible answer and move right to find a larger valid element.
- Continue until the search space becomes empty.

This also helps in finding the last occurrence when duplicate values are present.

## Complexity
- Time Complexity: `O(log n)`
- Space Complexity: `O(1)`

## Example
Input:
```text
arr = [1, 2, 8, 10, 10, 12, 19]
x = 11
```
Output
```text
4
```

### Problem Link : https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1