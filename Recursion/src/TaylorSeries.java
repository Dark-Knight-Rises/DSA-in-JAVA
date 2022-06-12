/**
 * what is taylor series?
 * what is e^x it is: 1+ x/1 + x^2/2! + x^3/3! + ... + n terms
 * larger the no. of n greater is the accuracy of the result.
 * 
 * sum = 1+2+3+..+n = sum(n-1)+n
 * fact = 1*2*3*..*n = fact(n-1)*n
 * power = x*x*x*...*n times = power(x,n-1)*x
 */
public class TaylorSeries {

    static double f = 1;
    static double p = 1;

    /**
     * 
     * @param x the value of e to the power as in e^x
     * @param n the ammount of accuracy you want
     * @return the value for e^x
     */
    public static double taylor(int x, int n) {
        double r;
        if (n == 0) {
            return 1;
        }
        r = taylor(x, n - 1);
        p *= x;
        f *= n;
        return r + (p / f);
    }
}
