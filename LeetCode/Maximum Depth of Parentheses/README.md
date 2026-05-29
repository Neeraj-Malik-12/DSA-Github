##  1614. Maximum Nesting Depth of the Parentheses

Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

---

Example 1:

Input: s = "(1+(2*3)+((8)/4))+1"

Output: 3

Explanation:
Digit 8 is inside of 3 nested parentheses in the string.

---
Example 2:

Input: s = "(1)+((2))+(((3)))"

Output: 3

Explanation: Digit 3 is inside of 3 nested parentheses in the string.

---

Constraints:

- 1 <= s.length <= 100
- s consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.
- It is guaranteed that parentheses expression s is a VPS.

=========================================

### Approach : 

Very simple approach , just convert the string into a char array and then traverse it using a for loop.

Initialize two variables as "**maxCount**" and "**count**" and increase "**count**" whenever found an open parentheses and decrease it by one when found close parentheses.

But before that, make sure if **count** exceeds **maxCount**, if yes update **maxCount** as **count**.

### Time Complexity : O(n)
### Space Complexity : O(n)

#### Problem Link : https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/