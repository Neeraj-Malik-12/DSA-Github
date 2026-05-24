## 283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.


---
Example 1:

Input: nums = [0,1,0,3,12]

Output: [1,3,12,0,0]

---
Example 2:

Input: nums = [0]

Output: [0]

---
Constraints:

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

===============================================

### Approach : 

We will use two pointers " i " and " j " , both at start position.

If the value at nums[ j ] == 0 then increse " j " by 1.
else swap the values at nums[ i ] and nums[ j ] and increase both pointer by one index.