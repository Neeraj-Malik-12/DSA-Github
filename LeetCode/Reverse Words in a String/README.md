## 151. Reverse Words in a String

Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

---

Example 1:

Input: s = "the sky is blue"

Output: "blue is sky the"

--- 

Example 2:

Input: s = "  hello world  "

Output: "world hello"

Explanation: Your reversed string should not contain leading or trailing spaces.

---
Example 3:

Input: s = "a good   example"

Output: "example good a"

Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

---

Constraints:

- 1 <= s.length <= 104
- s contains English letters (upper-case and lower-case), digits, and spaces ' '.
- There is at least one word in s.

===============================================

### Approach : 
We will solve the problem using two pointer technique, both initialized at the very last position.

Then one stays there and the other moves until a space comes.

As the pointer reaches a not alphabetic character it adds the substring from itself to the stable pointer inside a String builder.

As the wile loops end , we will just add another substring , it will add the string there in string builder if there exist some leftover string in the given problem.

### Time Complexity : O(n)
### Space Complexity : O(n)

### Problem Link : https://leetcode.com/problems/reverse-words-in-a-string/description/