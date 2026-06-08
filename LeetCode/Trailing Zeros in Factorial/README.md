## 172. Factorial Trailing Zeroes

Given an integer n, return the number of trailing zeroes in n!.

Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

---
Example 1:
```
Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.
``` 

---
Example 2:
```
Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.
```

---



Constraints:

- 0 <= n <= 104

======================================

### Approach :

At first, I was thinking like every newbie , that if I have to count zeros , then why not first calculate the factorial and the count the trailing zeros inside it using a while loop.

But here the question wins, the trick played here was that the numbers provided for factorials were too big to be stored in even " long ".

Then I started thinking in other direction , that is , what if we just check the numbers ( multiplied to get factorial ) whether they are divisible by 5 , if yes , then they will surely contribute to one zero.

But here was another trick for us, the number 25 , 50 , 125 , our logic for these numbers will increase count by one. But they hide more 5s inside them , which can produce more zeros.

That is why this approach, which wil count the number of 5s inside a number , and then number of 5s that could be hidden.


### Time Complexity : O(log<sub>5</sub> n)
### Space Complexity : O(1)

#### Problem Link : https://leetcode.com/problems/factorial-trailing-zeroes/description/