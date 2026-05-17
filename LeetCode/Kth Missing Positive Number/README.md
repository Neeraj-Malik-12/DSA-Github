## 1539. Kth Missing Positive Number

Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.

---

Example 1:

Input: arr = [2,3,4,7,11], k = 5

Output: 9

Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

---
Example 2:

Input: arr = [1,2,3,4], k = 2

Output: 6

Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.

---

Constraints:

- 1 <= arr.length <= 1000
- 1 <= arr[i] <= 1000
- 1 <= k <= 1000
- arr[i] < arr[j] for 1 <= i < j <= arr.length

===========================================

### Approach :

In a fully sorted array with no missing value ,the value of nums[index] should be equal to index+1.

Keeping that in mind, we can find the number of missing value (if any) at any index.

After reducing the search space , we will reach the optimal space where the kth missing value could be found , then occur a condition where ( low <= high ) will not satisfy and the while loop breaks.

Coming out of the loop , we then have to return high+1+k. Refer to the code written and Problem and dry run it for the given test cases for more clarity.

### Problem Link : https://leetcode.com/problems/kth-missing-positive-number/description/

**Time Complexity :- O( log(n) )**  same as for all binary search algorithms.