## 74. Search a 2D Matrix

You are given an m x n integer matrix named "matrix" with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

---
![Search in a 2D matrix.jpg](Search%20in%20a%202D%20matrix.jpg)


Example 1:

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3

Output: true

---

Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13

Output: false

---
Constraints:

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 100
- -104 <= matrix[i][j], target <= 104

===========================================

### Appraoch:

We have a matrix which is sorted in increasing order , think of it like a 1D array which starts from 0 and ends at (rows*columns)-1.

to find the mid of that array we have to find :

```text 
midRows = mid/columns 
        and 
midCols = mid%columns 
```

After finding it , we will simply use the binary search if alter the mid if target is not found.


**Time Complexity :- O(log(m*n))**

**Space Complexity :- O(1)**

### Problem Link : https://leetcode.com/problems/search-a-2d-matrix/description/
