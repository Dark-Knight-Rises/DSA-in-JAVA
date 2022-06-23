import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();
        Scanner in = new Scanner(System.in);
        int ch;
        while (true) {
            System.out.println("===============================================");
            System.out.print("1 : create\t");
            System.out.println("2 : display tree inORDER");
            System.out.print("3 : display tree preORDER\t");
            System.out.println("4 : display tree postORDER");
            System.out.println("5 : exit");
            System.out.print("enter choice: ");
            ch = in.nextInt();
            System.out.println("===============================================");
            switch (ch) {
                case 1: {
                    tree.create();
                    break;
                }
                case 2: {
                    tree.inO();
                    break;
                }
                case 3: {
                    tree.preO();
                    break;
                }
                case 4: {
                    tree.postO();
                    break;
                }
                case 5: {
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
