import java.util.ArrayList;

public class PascalsTriangle {
    /**
     * pascal's triangle uses combination formula with every value nCr being
     * obtained by adding
     * n-1Cr-1 +n-1Cr
     * 
     * @param n
     * @param r
     * @return
     */
    public int pascal(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        }
        return pascal(n - 1, r - 1) + pascal(n - 1, r);
    }

    public void pascalIterative(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (n >= 0) {

        }
    }
}
