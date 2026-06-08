//Optimal answer

class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n > 0){
            n /= 5;
            count += n;
        }
        return count;
    }
}


// My Initial Approach

public class Solution {
    public int trailingZeroes(int n) {
        long fact = factorial(n);
        System.out.println("Factorial of " + n + " is " + fact);
        int count = 0;
        while (fact != 0) {
            long last = fact % 10;
            if (last == 0) {
                count++;
                fact /= 10;
            } else {
                return count;
            }
        }
        return count;
    }

    private long factorial(int n) {
        if (n == 1 || n == 0) return 1;
        return n * factorial(n - 1);
    }
}

// My Second Approach

class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        for(int i = n ; i > 0 ; i--){
            if(i % 5 == 0) count++;
        }
        return count;
    }
}
