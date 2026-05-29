## 14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

---

Example 1:

Input: strs = ["flower","flow","flight"]

Output: "fl"

--- 

Example 2:

Input: strs = ["dog","racecar","car"]

Output: ""

Explanation: There is no common prefix among the input strings.

---
Constraints:

- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lowercase English letters if it is non-empty.

============================================================

### Approach : 
We have given several strings in an array.

If we sort the array , the string automatically sort in lexographical ( like words in dictionary ) order.

The very first and very last strings in that sorted array will have the least common in between them , that will help us to find the longest common prefix in the strings of that array.

We will run a for loop until it reaches the minimum of length of the two strings ( first and last ). Then we compare every character of both the strings and if they are equal , we will append them in a string builder , if not , then we will return the string builder.

If the loop ends without returning it means both the strings were equal , so we will also return the string buider after the loop ends.

### Time Complexity : O(n)
### Space Complexity : O(n)

### Problem Link: https://leetcode.com/problems/longest-common-prefix/description/