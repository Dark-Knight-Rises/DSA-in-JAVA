public class Combination {
    /**
     * nCr function: n!/(r!(n-r)!)
     * we can calculate combination with factorial function with memoization.
     * 
     * @param n n!
     * @param r r!
     * @return n!/(r!(n-r)!)
     */
    public int nCr(int n, int r) {
        int numerator, denominator, d1, d2;
        numerator = factorial(n);
        d1 = factorial(r);
        d2 = factorial(n - r);
        denominator = d1 * d2;
        return numerator / denominator;
    }

    int arr[] = new int[12];

    /**
     * memoized factorial function to help calculate the nCr function.
     * 
     * @param n factorial of n
     * @return n!
     */
    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        if (arr[n] != 0) {
            return arr[n];
        } else {
            arr[n] = factorial(n - 1) * n;
        }
        return arr[n];
    }

    /**
     * pascal triangle has every extreme position as 1
     * and every other value is the sum of nCr = n-1Cr-1 + n-1Cr
     * 
     * @param n n!
     * @param r r!
     * @return n!/(r!(n-r)!)
     */
    public int nCrPascalTriangle(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        }
        return nCrPascalTriangle(n - 1, r - 1) + nCrPascalTriangle(n - 1, r);
    }
}
