
public class Fibonacci {
    /**
     * fib:
     * 0,1,2,3,4,5,6
     * 0,1,1,2,3,5,8
     * 
     * @param n THE number till which fib is returned
     * @return the fib of that number.
     */
    public int fibIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int sum = 0, p = 0, q = 1;
        for (int i = 2; i <= n; i++) {
            sum = p + q;
            p = q;
            q = sum;
        }
        return sum;
    }

    /**
     * The naive way to apply recursion. In this approach a total of O(2^n) calls
     * are made to
     * the fibRecursive function which is unnecessary. We can reduce the no. of
     * calls to
     * O(n)
     * 
     * @param n number to get the fib in series
     * @return the fibonacci number in the series.
     */
    public int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 2) + fibRecursive(n - 1);
    }

    /**
     * By making an array we can look up the array every time we have to make a call
     * to the fib function. if the value is already present then we donot make
     * another call.
     * it reduces the total no. of calls to n+1 calls time complexity is O(n)
     * 
     * @param n for which fib is required
     * @return fib of that no.
     */
    int[] arr = new int[10];

    public int fibMemoized(int n) {
        if (n <= 1) {
            return n;
        }
        if (arr[n] != 0) {
            return arr[n];
        } else {
            arr[n] = fibMemoized(n - 2) + fibMemoized(n - 1);
        }
        return arr[n];
    }
}
