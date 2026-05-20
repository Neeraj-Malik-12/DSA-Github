## Transpose of a Matrix
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

--- 
Example :

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]

Output: [[1,4,7],[2,5,8],[3,6,9]]

========================

### Approach Used : 
As the matrix have to be flipped over its main diagonal, and the switching of matrix's row and column indices have to be done so we have to access the row and column first.

Notice that the j loops must run either from 0 to " i " 
#### OR 
from i to end of the arr length.

By doing so , we will prevent ourself from doing repeatation of swapping and resulting in same matrix. 
