## Factorial

Given a positive integer, n. Find the factorial of n.

Examples :
~~~
Input: n = 5
Output: 120
Explanation: 1 x 2 x 3 x 4 x 5 = 120

Input: n = 4
Output: 24
Explanation: 1 x 2 x 3 x 4 = 24
~~~

Constraints:
- 0 ≤ n ≤ 12


============================================

### Approach:

The factorial of a positive integer n is the product of all positive integers less than or equal to n.

For example, 
~~~
the factorial of 3 = 3*2*1 = 6
~~~

So we can solve the problem using recursion by calling the factorial function again with one lesser value.

NOTE : For implementing recursion , we also have to include a base case to return the function back otherwise it will run infinitely.

### Time Complexity : O(n)
### Space Complexity : O(n) **{ due to recursive stack }**