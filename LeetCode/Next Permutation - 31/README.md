### 31. Next Permutation

A permutation of an array of integers is an arrangement of its members into a sequence or linear order.


For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. 

If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].

Similarly, the next permutation of arr = [2,3,1] is [3,1,2].

While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.

Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

---


```
Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]

Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]

Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
```

---

Constraints:

* 1 <= nums.length <= 100
* 0 <= nums[i] <= 100

================================================

#### Appraoch :

A very beautiful concept is present here. 
First we have to understand that what is "Next Permutation".

The next Permutation of an array is that if we remove thecommas in between and made it a number like [1,3,4] then it would be 134.

So, its next permutation would be we have to arrange the digits in such a way that it should be just greater number that could be possibly made using these digits.

Like here, it would be 143, and if we convert it into an array , it would be [1,4,3].


So we have to perform this.
