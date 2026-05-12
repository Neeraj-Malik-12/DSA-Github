### 704. Binary Search
     
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

-----------------

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4

Explanation: 9 exists in nums and its index is 4

-------------------

Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1

Explanation: 2 does not exist in nums so return -1

-----------------

Constraints:

- 1 <= nums.length <= 104
- -104 < nums[i], target < 104
- All the integers in nums are unique.
- nums is sorted in ascending order.

 ===========================================

### Approach:

As we get the sorted array , so instead of using n operation to find the elements , we can use binary search to make the searching effecient.

We initialize two pointers , one (low) on first and another (high) on the last element of array.

Then we will find the mid element of the array by ( low + high ) / 2 , and compare the element on mid with target element , by that we will decide whether to move low or high and try again.

This numerously decrease the number of operation of searching , for example, to search an element in an array of 10,00,000 elements inside it , the algorithm will take only 20 operations to find the element in worst case.

### Time Complexity : O(log(n))
