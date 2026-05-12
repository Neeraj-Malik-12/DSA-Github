### 852. Peak Index in a Mountain Array
     
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

-----------------

Example 1:

Input: arr = [0,4,0]

Output: 1

------------------

Constraints:

- 3 <= arr.length <= 105
- 0 <= arr[i] <= 106
- arr is guaranteed to be a mountain array.

================================

### Approach:

We will use the binary search to find the mid of the array until it meets the specific conditions.

Assume the array as a mountain , if next element of mid is greater and previous element is lesser, then mid is on an increasing slop.

Similarly, if next element of mid is smaller and previous element is greater , then mid is on a decreasing slope.

That's how we will alter the position of low and high.

### Important Trick:

To prevent the indexOutOfBound error , the low and high should be initialized as 1 and arr.length - 2 respectively.

This is because we have been provided that , the array must contain peak element and minimum size possible is 3 , that means the very first and very last can't be the peak element.

