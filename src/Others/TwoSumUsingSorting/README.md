### 1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example :

Input: nums = [2,7,11,15], target = 9

Output: [0,1]

Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

--------------------

### Sorting Approach

Firstly sort the array using In-built sorting function { Arrays.sort( int[ ] x )}

Once the array is sorted use two pointer i and j one at start and another one at last.

Now run a while loop : while( i < j)
and find the elements that satisfy the target sum using if else ladder.


### Why this sorting technique ?
Because the previous approach of two sum require two nested for loops making the time complexity to { n<sup>2</sup> }.

This approach includes an inbuilt sorting technique { T.C. : n(logn) } and a while loop { T.C. : n }.

So, T.C. : ( n(logn) + n) i.e. approx { n(logn) }, which is way better than { n<sup>2</sup> }

