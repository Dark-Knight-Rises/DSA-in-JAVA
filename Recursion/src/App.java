public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // Power obj = new Power();
        // System.out.println((obj.pow(3, 5)));
        // System.out.println((obj.pow2(3, 5)));
        // System.out.println("Iterative: " + TaylorHorners.taylorIterative(3, 10));
        // System.out.println("Recursive: " + TaylorHorners.taylorRecursive(3, 10));
        // Fibonacci obj = new Fibonacci();
        // System.out.println("Memoized: " + obj.fibMemoized(0));
        // System.out.println("Memoized: " + obj.fibMemoized(5));
        // System.out.println("Memoized: " + obj.fibMemoized(6));
        // Combination obj = new Combination();
        // System.out.println("with factorial: " + obj.nCr(10, 4));
        // System.out.println("with pascal: " + obj.nCrPascalTriangle(10, 4));
        PascalsTriangle obj = new PascalsTriangle();
        System.out.println(obj.pascal(3, 2));
    }
}
