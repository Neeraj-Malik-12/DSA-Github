## 344. Reverse String

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

---
```
Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
```

---
```
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
```

Constraints:

- 1 <= s.length <= 105
- s[i] is a printable ascii character.


=============================================

### Approach :

If doing it simply , then we can use a while loop and two pointers , but I want to test my recursion hold.

So , I chose Recursion to solve the problem, first set a base case for returning the recursive calls , then call the function of reverseString again.

#### Time Complexity : O(n)
#### Space Complexity : O(n)


#### Problem Link : https://leetcode.com/problems/reverse-string/description/