## 1021. Remove Outermost Parentheses

A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

For example, "", "( )", "(( ))( )", and "(( )(( )))" are all valid parentheses strings.
A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

---

**Example 1:**

Input: s = "(( )( ))(( ))"

Output: "( )( )( )"

Explanation:
The input string is "(( )( ))(( ))", with primitive decomposition "(( )( ))" + "(( ))".
After removing outer parentheses of each part, this is "( )( )" + "( )" = "( )( )( )".

---

**Example 2:**

Input: s = "(( )( ))(( ))(( )(( )))"

Output: "( )( )( )( )(( ))"

Explanation:
The input string is "(( )( ))(( ))(( )(( )))", with primitive decomposition "(( )( ))" + "(( ))" + "(( )(( )))".
After removing outer parentheses of each part, this is "( )( )" + "( )" + "( )(( ))" = "( )( )( )( )(( ))".

---
Constraints:

- 1 <= s.length <= 105
- s[i] is either '(' or ')'.
- s is a valid parentheses string.

=======================================================

### Approach :

As we have to remove the outer parentheses, so we will first convert the string into a character array to easily traverse the characters one by one.

Then we will set a count integer to 0 initially , then if the char is an open parentheses and if the counter is 1 then append the character (open parentheses in string builder) and count becomes count+1.

This process will neglect the very first parentheses as initially the count was set to 0.


If the char is a close parentheses then we will set the count to count-1 and check if the count is greater than 0 , if greater, then we will append the close parentheses to the string builder.

This process will neglect the very last close parentheses of an open parentheses.

Then we will return the sb.toString();


### Time Complexity : O(n)

### Problem Link : https://leetcode.com/problems/remove-outermost-parentheses/description/