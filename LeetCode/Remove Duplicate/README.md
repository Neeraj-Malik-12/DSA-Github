## 26. Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.


Consider the number of unique elements in nums to be k. After removing duplicates, return the number of unique elements k.


The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

---

Example 1:

Input: nums = [1,1,2]

Output: 2, 

Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively. nums = [1,2,_]


It does not matter what you leave beyond the returned k (hence they are underscores).

---

Constraints:

- 1 <= nums.length <= 3 * 104
- -100 <= nums[i] <= 100
- nums is sorted in non-decreasing order.

=============================

### Approach : 

We will optimize the code to a complexity of O(n) , by using two pointers " i " and " j " , both at the starts, if the arr[ j ] == arr[ j+1 ] , then the j pointer will increase by one and check again , otherwise both the pointer will increase and change the value of arr[ i ] by arr[ j ] .

Then we will return the number ( i+1 ) as i starts from 0.

This will prove us the total number of unique elements.

### Time Complexity : O(n)


### Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/