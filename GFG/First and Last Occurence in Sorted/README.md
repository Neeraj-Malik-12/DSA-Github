### First and Last in Sorted

Given a sorted array arr[] with possibly some duplicates, find the first and last occurrences of an element x in the given array.

Note: If the number x is not found in the array then return both the indices as -1.

-------------------------

#### Examples:

Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5

Output: [2, 5]

Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5.

--------------------------------

Input: arr[] = [1, 2, 3], x = 4

Output: [-1, -1]

Explanation: No occurrence of 4 in the array, so, output is [-1, -1]

--------------------------------------------

Constraints:
- 1 ≤ arr.size() ≤ 106
- 1 ≤ arr[i], x ≤ 109

=====================================

### Approach : 

For this searching , we will use the binary search twice in the method , the first one will provide us the first occurrence of the element , and the second one will prove the last occurrence.

For the above approach to get implemented , we need to maintain the low and high again to zero after the first while loop ends to enter the next while loop with a fresh start.

#### Note: Always remember that inside while loop the condition should be ( low <= high ).

Because I had made this mistake several time to not apply the condition of equal... because of the regular practice of for loop and other sorting techniques.

That's why solving questions regularly become so important.