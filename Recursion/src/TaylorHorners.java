
public class TaylorHorners {
    /**
     * the naive approach recursion was using n(n+1) no. of multiplications i.e
     * a time complexity of O(n^2).
     * To improve this we will use horner's rule to bring down the complexity to
     * O(n)
     * 
     * @param x the value of e to the power as in e^x
     * @param n the ammount of accuracy you want
     * @return the value for e^x
     */
    public static double taylorIterative(int x, int n) {
        double s = 1;
        while (n > 0) {
            s = s * x / n + 1;
            n--;
        }
        return s;
    }

    static double r = 1;

    public static double taylorRecursive(int x, int n) {
        if (n == 0) {
            return r;
        }
        r = r * x / n + 1;
        return taylorRecursive(x, n - 1);
    }
}
