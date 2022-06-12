import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        SymmetricMatrix obj = new SymmetricMatrix();
        // obj.fillMatrix();
        // obj.displayMatrix();
        // obj.toSingleDimensionArray();
        // obj.displayArray();
        Scanner in = new Scanner(System.in);
        // System.out.println("enter row and column value for which you wish to get the
        // value.");
        // int x = in.nextInt();
        // int y = in.nextInt();
        // System.out.println(("the value @ " + x + ", " + y + " is: " +
        // obj.displayArray(x, y)));
        obj.fillSingleDimensionArray();
        obj.displayArray();
        in.close();
    }
}
