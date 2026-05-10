### Kth Smallest
Given an integer array arr[] and an integer k, your task is to find and return the kth smallest element in the given array.

Note: The kth smallest element is determined based on the sorted order of the array.

Examples :

Input: arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4

Output: 5

Explanation: 4th smallest element in the given array is 5.

___________________

### Approach:

We know that Selection sort provide us the minimum element in each phase of it, means 1st minimum in 1st phase , 2nd minimum in second phase and so on.

So, we can use the selection sort to find the kth minimum element in the array by running it for i = k-1 .