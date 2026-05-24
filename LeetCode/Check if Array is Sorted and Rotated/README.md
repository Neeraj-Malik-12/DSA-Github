## 1752. Check if Array Is Sorted and Rotated

Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

---

Example 1:

Input: nums = [3,4,5,1,2]

Output: true

Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].

---
Example 2:

Input: nums = [2,1,3,4]

Output: false

Explanation: There is no sorted array once rotated that can make nums.

---

Constraints:

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

===================================

### Approach :

This question just plays with the mind , It was just a minute trick , a one line code the question will get solved on itis own.

This trick is "FALL"...

That fall means , the sorted array will always in an increasing slope, until it is rotated.

If it is rotated ( and sorted ) , then there will be a(and only) sudden FALL in the increasing slope trend.

If it was not sorted before rotation , then there will be more than one FALL.

Now here comes a twist , what if there is no rotation , then the count of FALL will be zero, Here the trick comes into play, we will compare the last element of array with first also, if the array is sorted and rotated , then there will be one FALL and if the array is sorted and not rotated then there will be one FALL..

In the end we will count the number of FALL and return true and false accordingly .

### Time Complexity :- O(n)
### Space Complexity :- O(1)

### Problem Link : https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
