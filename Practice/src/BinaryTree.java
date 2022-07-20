import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {
    TreeNode root, p, newNode, t;
    Queues q;
    int x;
    Scanner in = new Scanner(System.in);
    Stack<TreeNode> stack;

    BinaryTree() {
        root = null;
        p = null;
        t = null;
        stack = new Stack<>();
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

    public void levelOrder() {
        q.enQ(root);
        while (!q.isEmpty()) {
            p = q.deQ();
            if (p.left != null) {
                q.enQ(p.left);
                // System.out.print(p.data + ", ");
            }
            if (p.right != null) {
                q.enQ(p.right);
            }

            System.out.print(p.data + ", ");
        }
        System.out.println();
    }

    public void inOrderIterative() {
        System.out.println("InOrder (Iterative): LEFT, ROOT, RIGHT");
        t = root;
        while (!stack.isEmpty() || t != null) {
            if (t != null) {
                stack.push(t);
                t = t.left;
            } else {
                t = stack.pop();
                System.out.print(t.data + ", ");
                t = t.right;
            }
        }
        System.out.println();
    }

    private int countNodes(TreeNode root) {
        if (root != null) {
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
        return 0;
    }

    private int getHeight(TreeNode root) {
        int a = 0, b = 0;
        if (root != null) {
            a = getHeight(root.left);
            b = getHeight(root.right);
            if (a > b) {
                return a + 1;
            } else {
                return b + 1;
            }
        }
        return 0;

    }

    public void getCountAndHeight() {
        System.out.println("No. of nodes: " + countNodes(root));
        System.out.println("height of tree: " + getHeight(root));
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
