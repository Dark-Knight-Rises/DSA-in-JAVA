import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int ch;
        BinarySearchTree tree = new BinarySearchTree();
        while (true) {
            System.out.println("===============================================");
            System.out.print("1 : insert in bst\t");
            System.out.println("2 : display tree inORDER");
            System.out.print("3 : delete a node\t");
            System.out.println("4 :XXXER");
            System.out.print("5 : search in bst\t");
            System.out.println("XXXer");
            System.out.print("7 : XXX\t");
            System.out.println("8 : exit");
            System.out.print("enter choice: ");
            ch = in.nextInt();
            System.out.println("===============================================");
            switch (ch) {
                case 1: {
                    tree.insert();
                    break;
                }
                case 2: {
                    tree.inO();
                    break;
                }
                case 3: {
                    tree.delete();
                    break;
                }
                case 4: {
                    // tree.postO();
                    break;
                }
                case 5: {
                    System.out.print("enter the element to search: ");
                    int key = in.nextInt();
                    System.out.println("element " + key + " found? " + tree.search(key));
                    break;
                }
                case 6: {
                    System.out.println("level order traversal");
                    // tree.levelOrder();
                    break;
                }
                case 7: {
                    // System.out.println("level order traversal");
                    // tree.getCountAndHeight();
                    break;
                }
                case 8: {
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
