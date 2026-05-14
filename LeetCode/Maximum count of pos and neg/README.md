# 2529. Maximum Count of Positive Integer and Negative Integer

## Problem Statement
Given a sorted integer array `nums`, return the maximum count between positive and negative integers.

- Positive integers are greater than `0`
- Negative integers are less than `0`
- `0` is neither positive nor negative

## Approach
This solution uses Binary Search twice:

1. Find the index of the last negative number
2. Find the index of the first positive number

Using these indices:
- Negative count = `lastNegativeIndex + 1`
- Positive count = `nums.length - firstPositiveIndex`

Finally, return the maximum of both counts.

## Complexity
- Time Complexity: `O(log n)`
- Space Complexity: `O(1)`

## Example

Input:
```text
nums = [-3,-2,-1,0,0,1,2]
```
Output:
```text
3
```

Because negatives are 3 and positives are 2


### Problem Link: https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/