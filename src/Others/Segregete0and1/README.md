## Segregate 0s and 1s in Array (Java)

This project demonstrates two approaches to segregate `0`s and `1`s in an array using Java.

### Problem Statement

Given an array containing only `0`s and `1`s, rearrange the array so that all `0`s come before all `1`s.

### Example

```java
Input  : [0, 1, 1, 0, 1, 0]
Output : [0, 0, 0, 1, 1, 1]
```

---

### Approaches Used

#### Two Pass Solution
- Count total `0`s and `1`s.
- Fill the array with `0`s first, then `1`s.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

#### Optimized One Pass Solution (Two Pointer)
- Use two pointers:
    - `i` from start
    - `j` from end
- Swap when `arr[i] == 1` and `arr[j] == 0`.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

### Sample Output

```text
0 1 1 0 1 0
0 0 0 1 1 1
```

---

### Concepts Used

- Arrays
- Two Pointer Technique
- In-place Swapping

---

