## Sort Colors

You are given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

---

Example 1:

Input: nums = [2,0,2,1,1,0]

Output: [0,0,1,1,2,2]

Explanation:

The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.

---


Constraints:

n == nums.length

1 <= n <= 300

nums[i] is either 0, 1, or 2.


======================================================

### Approach : 

We will use the HashMap to store the frequency of the elements ( 0s, 1s, 2s ).

Then we will traverse the array (nums) once and replace each element with 0s, 1s and 2s according to their frequencies respectively.

#### Time Complexity : O(n)

#### Space Complexity : O(n)

### Problem Link : https://leetcode.com/problems/sort-colors/description/
