## 69. Sqrt(x)

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

---
Example 1:

```text 
Input: x = 4
Output: 2
```
Explanation: The square root of 4 is 2, so we return 2.

---

Example 2:

```text 
Input: x = 8
Output: 2
```
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

---
Constraints:

- 0 <= x <= 231 - 1

======================================

## Approach : 

As the square root of a non-negative number always lie between 0 and that number. So we know in which area we havve to search the element.

Now to search we will use binar search , but here is a twist , we have learned a new thing here i.e. a new way to write mid.

The mid was mid = ( low + high )/2 but it could give us the integer overflow error , so we will write it as...

```text 
( low + high + low - low )/2 

OR 

((2*low) + ( high - low )) / 2

OR 

low + ( high - low )/2
```

So the mid from now on will be : low + ( high - low ) / 2.

Also,
mid*mid > x can also give integer overflow error, So, we will write that as : 
```text 
mid > x/mid.
```

### Problem Link : https://leetcode.com/problems/sqrtx/description/

### Time Complexity : O(log(n))