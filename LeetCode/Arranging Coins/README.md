## 441. Arranging Coins
##Test PR
You have n coins and you want to build a staircase with these coins. The staircase consists of "k" rows where the "i"th row has exactly "i" coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

---

Example 1:

![LeetCode Arranging Coins.jpg](LeetCode%20Arranging%20Coins.jpg)

```text 
Input: n = 5
Output: 2
```
Explanation: Because the 3rd row is incomplete, we return 2.

---

#### Constraints:

- 1 <= n <= 231 - 1

==============================================

## Approach:

We have made a function of finding square root to the nearest integer available , for example : The nearest integer square root of 5 is 2. 

#### Link : https://leetcode.com/problems/sqrtx/description/

here , n = 1 + 2 + 3 + 4 + 5 ..... + k.  ( k are the number of rows.)

i.e. n = k*(k+1)/2

Calculating k , we get : 

```text 
k = (square root(8n + 1)  - 1) / 2
```

So, we have to simply return the square root here to find the number of rows filled.

We can use the function of square root we have made for LeetCode Problem-69.

### Time Complexity : O(log(n))

#### Problem Link: https://leetcode.com/problems/arranging-coins/description/
