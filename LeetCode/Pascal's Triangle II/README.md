## 119. Pascal's Triangle II

Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

![PascalTriangleAnimated2.gif](PascalTriangleAnimated2.gif)

---
Example 1:

Input: rowIndex = 3

Output: [1,3,3,1]

---
Example 2:

Input: rowIndex = 0

Output: [1]

---

Constraints:

- 0 <= rowIndex <= 33

==================================

### Approach:

The code will be same as the Pascal's Triangle 1 , already provided here in the repo,  the main change is that , rather than running the loop for full length , we will just run it till our output row created.

And then we will simply retrieve that row.

| Complexity       | Value              |
| ---------------- |--------------------|
| Time Complexity  | (O(n<sup>2</sup>)) |
| Space Complexity | (O(n<sup>2</sup>)) |


### Problem Link : https://leetcode.com/problems/pascals-triangle-ii/description/