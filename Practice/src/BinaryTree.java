import java.util.Scanner;

public class BinaryTree {
    TreeNode root, p, newNode;
    Queues q;
    int x;
    Scanner in = new Scanner(System.in);

    BinaryTree() {
        root = null;
        p = null;
        newNode = null;
        q = new Queues();
    }

    public void create() {
        System.out.print("enter root value: ");
        x = in.nextInt();
        root = new TreeNode(x);
        q.enQ(root);
        while (!q.isEmpty()) {
            p = q.deQ();
            System.out.print("enter left child of " + p.data + ", -1 to null: ");
            x = in.nextInt();
            if (x != -1) {
                newNode = new TreeNode(x);
                p.left = newNode;
                q.enQ(newNode);
            }
            System.out.print("enter right child of " + p.data + ", -1 to null: ");
            x = in.nextInt();
            if (x != -1) {
                newNode = new TreeNode(x);
                p.right = newNode;
                q.enQ(newNode);
            }
        }
    }

    public void inO() {
        System.out.println("InOrder: LEFT, ROOT, RIGHT");
        inOrder(root);
        System.out.println();
    }

    public void preO() {
        System.out.println("PreOrder: ROOT, LEFT, RIGHT");
        preOrder(root);
        System.out.println();
    }

    public void postO() {
        System.out.println("PostOrder: LEFT, RIGHT, ROOT");
        postOrder(root);
        System.out.println();
    }

    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + ", ");
            inOrder(root.right);
        }
        // System.out.println();
    }

    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + ", ");
            inOrder(root.left);
            inOrder(root.right);
        }
        // System.out.println();
    }

    public void postOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            inOrder(root.right);
            System.out.print(root.data + ", ");
        }
        // System.out.println();
    }
}
