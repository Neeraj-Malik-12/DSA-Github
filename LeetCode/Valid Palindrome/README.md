## 125. Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

---

Example 1:

Input: s = "A man, a plan, a canal: Panama"

Output: true

Explanation: "amanaplanacanalpanama" is a palindrome.

---
Example 2:

Input: s = "race a car"

Output: false

Explanation: "raceacar" is not a palindrome.

---

Constraints:

- 1 <= s.length <= 2 * 105
- s consists only of printable ASCII characters.

====================================================

### Approach:


We will use two pointers , one at very start and another at very end of string.

Then we will move both the pointers and check if the pointer points at an alphabet or number , if yes then compare the two pointers , if no the move that pointer by one.

If they became different at any position , then we will return false and if not , then we will return true.

### Time Complexity : O(n)

### Problem Link : https://leetcode.com/problems/valid-palindrome/description/