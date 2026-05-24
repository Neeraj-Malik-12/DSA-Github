## 169. Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

---

Example 1:

Input: nums = [3,2,3]

Output: 3

---
Example 2:

Input: nums = [2,2,1,1,1,2,2]

Output: 2

---
Constraints:

- n == nums.length
- 1 <= n <= 5 * 104
- -109 <= nums[i] <= 109
- The input is generated such that a majority element will exist in the array.

==========================================================

### Approach :
There are multiple ways to handle this problem , either we can run two for loops to  find the maximum occurrence , but that will make the time complexity to **_O(n<sup>2</sup>)_**

Then there is another approach in which we will first sort the array using Arrays.sort( ) function and then return the middle element of the array because if the element is there for more than n/2 times , then it will definitely occur at the mid positon. 

But that will increase the space complexity as well as the time complexity will be O(nlog(n)), which is also not very optimal.

Then we have an algorithm named " _**MOORE's VOTING ALGORITHM**_ "

In this algorithm , we will assign the first element as majority and then traverse the array nums on time , if nums[i] ==  majority , then we will increase it's vote by one , If not then we will decrease the vote.

Once the vote comes to zero , the element at nums[i] will become majority with vote = 1; then the process repeates.

### Time Complexity : O(n)
### Space Complexity : O(1)

### Problem Link : https://leetcode.com/problems/majority-element/description/
