public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Lamb obj = (a, b) -> {
            return a * b;
        };
        System.out.println((obj.mul(23, 2)));
    }
}
