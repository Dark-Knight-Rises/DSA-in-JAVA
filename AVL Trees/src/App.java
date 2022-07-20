import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        AvlTree tree = new AvlTree();
        while (true) {
            System.out.println("===============================================");
            System.out.print("1: create avl from random values\t");
            System.out.println("2: insert in avl recursive");
            System.out.print("3: display avl \t");
            System.out.println("4: exit");
            System.out.print("enter choice: ");
            int ch = in.nextInt();
            switch (ch) {
                case 1: {
                    Random random = new Random();
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = random.nextInt(100) + 1;
                        System.out.print(arr[i] + ", ");
                    }
                    tree.create(arr);
                    System.out.println();
                    break;
                }
                case 2: {
                    tree.insertRecursive();
                    break;
                }
                case 3: {
                    tree.display();
                    break;
                }
                case 4: {
                    System.out.println("exiting...");
                    System.exit(0);
                    break;
                }

                default: {
                    System.out.println("wrong inp try again");
                    break;
                }
            }
            System.out.println("===============================================");
        }
    }
}
