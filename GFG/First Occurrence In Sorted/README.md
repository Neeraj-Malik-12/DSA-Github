## First Occurrence in Sorted

Given a sorted array arr[] and an integer k, find the position(0-based indexing) at which k is present in the array using binary search. If k doesn't exist in arr[] return -1.

Note: If multiple occurrences are there, please return the smallest index.

Examples:

Input: arr[] = [1, 2, 3, 4, 5], k = 4 

Output: 3

Explanation: 4 appears at index 3.

---------------------

Input: arr[] = [11, 22, 33, 44, 55], k = 445

Output: -1

Explanation: 445 is not present.

-----------------------------------


Constraints:
- 1 ≤ arr.size() ≤ 105
- 1 ≤ arr[i] ≤ 106
- 1 ≤ k ≤ 106

============================================

### Approach:

Following the binary search algorithm , it was not necessary to get the first occurrence of target element if it was present in the array.

To solve this problem , I used a variable named " index ".

And inside the while(low < high) loop, we will extend the else scope further by simply not returning the index value and rather saving it in index variable and further traverse the left part of the array.

if it comes out to be true , then the index will be updated automatically and we will return the index at last.

