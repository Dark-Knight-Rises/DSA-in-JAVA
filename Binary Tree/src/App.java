import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();
        Scanner in = new Scanner(System.in);
        int ch;
        while (true) {
            System.out.println("===============================================");
            System.out.println("1 : create");
            System.out.print("2 : display tree \t");
            System.out.println("3 : exit");
            System.out.print("enter choice: ");
            ch = in.nextInt();
            System.out.println("===============================================");
            switch (ch) {
                case 1: {
                    tree.create();
                    break;
                }
                case 2: {
                    tree.display();
                    break;
                }
                case 3: {
                    System.out.println("Exiting application...");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("wrong input try again");
                    break;
                }
            }
        }
    }
}
