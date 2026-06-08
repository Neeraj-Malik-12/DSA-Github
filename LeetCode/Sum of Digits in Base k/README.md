## 1837. Sum of Digits in Base K

Given an integer n (in base 10) and a base k, return the sum of the digits of n after converting n from base 10 to base k.

After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.

---
Example 1:
```
Input: n = 34, k = 6
Output: 9
Explanation: 34 (base 10) expressed in base 6 is 54. 5 + 4 = 9.
```

---
Example 2:
```
Input: n = 10, k = 10
Output: 1
Explanation: n is already in base 10. 1 + 0 = 1.
```


Constraints:

- 1 <= n <= 100
- 2 <= k <= 10

======================================

### Approach :

If a number is in base 10 that means,

#### 34(<sub>**10**</sub>) = 3 * (10)<sup>1</sup>  + 4 * (10)<sup>0</sup>
#### 34(<sub>**10**</sub>) = 30  + 4 
#### 34(<sub>**10**</sub>) = 34

If we have to convert the number to base k now , then we have to add the remainder to a variable " sum " when number divided by " k " and update the number by dividing it by " k ".

And then we have to again add the remainder to the sum when the updated number divided by " k ".

For Example : 

#### 34<sub>6</sub> = 34/6 =>  Q<sub>1</sub> : 5  R<sub>1</sub> : 4
#### then 5/6 =>  Q<sub>2</sub> : 0 R<sub>2</sub> : 5 

sum will be R<sub>1</sub> + R<sub>2</sub> = 5 + 4 = 9.
