## Two Sum in Sorted Array

You are given a 1-based indexed integer array arr[] that is sorted in non-decreasing order, along with an integer target. Your task is to find two elements in the array such that their sum is equal to target. If such a pair exists, return the indices of the two elements in increasing order. If no such pair exists, return [-1, -1].

Note: If your answer is correct then the driver code will print "true" otherwise "false".

Examples:

Input: arr[] = [2, 7, 11, 15], target = 9

Output: [1, 2]

Explanation: Since arr[0] + arr[1] = 2 + 7 = 9 equals the target, return their 1-based indices : [1, 2]

------------------------------------
Input: arr[] = [1, 3, 4, 6, 8, 11], target = 10

Output: [3, 4]

Explanation: Since arr[2] + arr[3] = 4 + 6 = 10 equals the target, return their 1-based indices : [3, 4]

-------------------------------

### Constraints:
- 1 ≤ arr.size() ≤ 105
- 1 ≤ arr[i], target ≤ 106

### Problem Link :
https://www.geeksforgeeks.org/problems/two-sum-in-sorted-array/1

=====================================

## Approach:

As the array is sorted we just need two pointers one on left most element and another one on the right most element.

By using a while(i<j) , we will traverse the array until we found the required indices, then we will add 1 in them and add them to an ArrayList.

At last, we will return that ArrayList if we found the required sum else we return an ArrayList of both elements as -1. 
