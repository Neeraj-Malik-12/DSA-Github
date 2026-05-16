# 153. Find Minimum in Rotated Sorted Array

## Overview
This problem is solved using **Binary Search** to achieve an efficient time complexity of **O(log n)**.

The main idea is to identify which half of the array is sorted:
- If the current range is already sorted, then the first element is the minimum.
- If the left half is sorted, the minimum must lie in the right half.
- Otherwise, the minimum lies in the left half.

By repeatedly reducing the search space, the minimum element can be found efficiently.

---

## Example 1

### Input
```text
nums = [3,4,5,1,2]
```

### Output
```text
1
```

### Explanation
The array was originally sorted and then rotated.
The minimum element present in the array is `1`.

---

## Example 2

### Input
```text
nums = [4,5,6,7,0,1,2]
```

### Output
```text
0
```

### Explanation
The array was rotated from a sorted order.
The minimum element present in the array is `0`.

---

## Time Complexity
- **O(log n)**

## Space Complexity
- **O(1)**