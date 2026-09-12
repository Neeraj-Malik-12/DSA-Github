### 2149. Rearrange Array Elements by Sign

You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the array follows the given conditions:

Every consecutive pair of integers have opposite signs.

For all integers with the same sign, the order in which they were present in nums is preserved.

The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

---

Example 1:

Input: nums = [3,1,-2,-5,2,-4]

Output: [3,-2,1,-5,2,-4]

Explanation:

The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].

The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].

Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions. 

---

Example 2:

Input: nums = [-1,1]

Output: [1,-1]

Explanation:

1 is the only positive integer and -1 the only negative integer in nums.

So nums is rearranged to [1,-1].

---

Constraints:

* 2 <= nums.length <= 2 * 105

* nums.length is even

* 1 <= |nums[i]| <= 105

* nums consists of equal number of positive and negative integers.


=================================================


### Approach :
There are mainly two appraches , lets talk about the brute force(unoptimised) appraoch first.

As we have an aray of same numnber of positive and negative elements , then we  would create two array lists and add the positive elements in firsst one and all negative elements in second one.

Then we will create a third array list which will runs under a for loop from i = 0 to i < nums.length/2.

Then we will add one element from positive list into it and then negative element from negative list in one iteration.

Then we will convert the result array list into an array or simple replace all the elements of nums array by the elements in that result list and return it.

#### Time Complexity in this approach = O(n)
#### Space Complexity in this approach = O(3n) == O(n)

---

The second approach is much simpler and optimised.
It involves two variables , pos = 0 and neg = 1.

As we iterate through the array , we will add the positive elements at arr[pos] and increase it by two and similarly negative elements at arr[neg] and increase it by two. 

And then simply return the array 'arr'.

#### Time Complexity in this approach = O(n)
#### Space Complexity in this approach = O(1)