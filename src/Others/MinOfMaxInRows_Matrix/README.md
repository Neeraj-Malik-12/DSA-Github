In this problem , we are provided with a matrix. Inside which there are some rows and columns.

Inside the boxes , there are several integer values, which are present in a random manner.

What we have to do is , we have to find the minimum of maximum elements from every row.

### Approach:

First we will find the maximum from every row , and then we will compare it with the variable name " max ".

There would be two loops in this problem . Inside one loop for every row , there is another loop for every column .

The second loop will provide us the maximum value from each row.

After the second loop ends for first iteration of outer loop , the " min " variable will get updated with the minimum element between the updated max value and the maximum possible integer i.e. 2147483647.

So ofcourse , we are just updating the " min " with updated " max " .

#### Time Complexity : O(n<sup>2</sup>)