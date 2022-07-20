import java.util.Scanner;

public class BinarySearchTree {
    TreeNode root, t, p, q, newNode;
    Scanner in = new Scanner(System.in);

    BinarySearchTree() {
        root = null;
        q = null;
        p = null;
        t = null;
        newNode = null;
    }

    private boolean isEmpty() {
        return root == null;
    }

    public boolean search(int key) {
        boolean op = false;
        p = root;
        while (p != null) {
            q = p;
            if (key < p.data) {
                p = p.left;
            } else if (key > p.data) {
                p = p.right;
            } else {
                op = true;
                break;
            }
        }
        return op;
    }

    public void insert() {
        System.out.print("enter the element to insert: ");
        int val = in.nextInt();
        if (search(val)) {
            return;
        }
        newNode = new TreeNode(val);
        if (isEmpty()) {
            root = newNode;
            return;
        }
        if (val > q.data) {
            q.right = newNode;
        } else {
            q.left = newNode;
        }
    }

    private void inORDER(TreeNode root) {
        if (root == null) {
            return;
        }
        inORDER(root.left);
        System.out.print(root.data + ", ");
        inORDER(root.right);
    }

    public void inO() {
        System.out.println("InOrder: LEFT, ROOT, RIGHT");
        inORDER(root);
        System.out.println();
    }

    public TreeNode delete(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key > root.data) {
            root.right = delete(root.right, key);
        } else if (key < root.data) {
            root.left = delete(root.left, key);
        } else {
            if (root.left != null && root.right != null) {
                if (getHeight(root.left) > getHeight(root.right)) {
                    q = getPredecessor(root.left);
                    root.data = q.data;
                    root.left = delete(root.left, q.data);
                } else {
                    q = getSuccessor(root.right);
                    root.data = q.data;
                    root.right = delete(root.right, q.data);
                }
            } else if (root.left == null && root.right == null) {
                return null;
            } else if (root.right == null) {
                return root.left;
            } else {
                return root.right;
            }
        }
        return root;
    }

    private TreeNode getPredecessor(TreeNode root) {
        t = root;
        while (t.right != null) {
            t = t.right;
        }
        return t;
    }

    private TreeNode getSuccessor(TreeNode root) {
        t = root;
        while (t.left != null) {
            t = t.left;
        }
        return t;

    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int x = 0, y = 0;
        x = getHeight(root.left);
        y = getHeight(root.right);
        return x > y ? x + 1 : y + 1;
    }

    public void delete() {
        System.out.print("enter the node to delete: ");
        int key = in.nextInt();
        delete(root, key);
    }
}
