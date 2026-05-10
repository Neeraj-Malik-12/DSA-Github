### Insertion Sort:

This is a sorting technique in which we assume our array is divided into two different arrays , the left one is sorted and right one as unsorted.

Then we pick the first element of unsorted array and compare it with the elements of sorted array and insert it at the optimal place.

That's how the Sorting algorithm got its name " Insertion Sort".

Example: 
arr = {7, 4, 6, 2, 5, 3}

Divide in two arrays : 
{ 7 | 4, 6, 2, 5, 3 }

Now in second iteration , compare the first element ( 4 here ) with sorted array elements ( i.e. 7) and swap if needed.

It would become : { 4, 7 | 6, 2, 5, 3 } , and the iteration continues.

### Complexities : 

- Worst Case : O(n<sup>2</sup>)
- Average Case : O(n<sup>2</sup>)
- Best Case : O(n)

Note that : This sorting is Optimized on its own , because we don't have to write extra code for optimized version of Insertion Sort.