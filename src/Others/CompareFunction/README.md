This is the replica of compareTo() function which is a built-in function in Java.

The built-in function works on two strings, let a, b.

Syntax : a.compareTo(b);

This gives an as integer output , if the two strings are exactly same  , then it will give 0 , if ascii value of charAt(i) of string a is greater than that of b , then it will give the difference between them.

If opposite is true then it will again give the difference but in negative number.

If there are two strings which are exactly same till one string comes to an end then the output will be the remaining elements in the longer string ( positive if a is longer and vice-versa )