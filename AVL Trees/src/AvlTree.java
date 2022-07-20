import java.util.Scanner;

public class AvlTree {
    private Node root, nNode, p, q;
    Scanner in = new Scanner(System.in);

    AvlTree() {
        root = null;
        nNode = null;
        q = null;
        p = null;
    }

    public void create(int[] arr) {
        int len = arr.length;
        root = new Node(arr[0]);
        for (int i = 1; i < len; i++) {
            if (!search(arr[i])) {
                nNode = new Node(arr[i]);
                if (nNode.data > q.data) {
                    q.right = nNode;
                } else {
                    q.left = nNode;
                }
            }
        }
    }

    public void insertRecursive() {
        System.out.print("enter data to enter in avl bst: ");
        int x = in.nextInt();
        root = insertRecursive(root, x);
    }

    private Node insertRecursive(Node node, int x) {
        int bf, bfLeft, bfRight;
        if (node == null) {
            nNode = new Node(x);
            return nNode;
        }
        if (x > node.data) {
            node.right = insertRecursive(node.right, x);
        } else if (x < node.data) {
            node.left = insertRecursive(node.left, x);
        }

        // get the node's height
        node.height = getHeight(node);

        // get the balance factor of a node
        bf = balanceFactor(node);

        // perform rebalancing
        if (bf == 2) {
            bfLeft = balanceFactor(root.left);
            if (bfLeft == 1) {
                return llRotation(node);
            } else if (bfLeft == -1) {
                return lrRotation(node);

            }
        } else if (bf == -2) {
            bfRight = balanceFactor(root.right);
            if (bfRight == -1) {
                return rrRotation(node);

            } else if (bfRight == 1) {
                return rlRotation(node);
            }
        }

        return node;
    }

    private Node rlRotation(Node a) {
        // get pointers
        Node b = a.right;
        Node c = b.left;
        Node t3 = c.left, t4 = c.right;

        // update pointers
        c.right = b;
        c.left = a;
        b.left = t4;
        a.right = t3;

        // update height
        a.height = getHeight(a);
        b.height = getHeight(b);
        c.height = getHeight(c);

        // update root
        if (a == root) {
            root = c;
        }
        return c;
    }

    private Node rrRotation(Node a) {

        // get the pointers
        Node b = a.right;
        Node t2 = b.left;

        // update pointers
        b.left = a;
        a.right = t2;

        // update height
        a.height = getHeight(a);
        b.height = getHeight(b);

        // update root
        if (root == a) {
            b = root;
        }
        return b;
    }

    private Node lrRotation(Node a) {
        // get pointers
        Node b = a.left;
        Node c = b.right;
        Node t3 = c.left, t4 = c.right;

        // update pointers
        c.right = a;
        c.left = b;
        a.left = t4;
        b.right = t3;

        // update height
        a.height = getHeight(a);
        b.height = getHeight(b);
        c.height = getHeight(c);

        // update root
        if (a == root) {
            root = c;
        }

        return c;
    }

    private Node llRotation(Node a) {
        // get the pointers
        Node b = a.left;
        Node t2 = b.right;

        // update pointers
        b.right = a;
        a.left = t2;

        // update height
        a.height = getHeight(a);
        b.height = getHeight(b);

        // update root
        if (root == a) {
            root = b;
        }
        return b;
    }

    private int getHeight(Node node) {
        int x, y;
        x = node != null && node.left != null ? node.left.height : 0;
        y = node != null && node.right != null ? node.right.height : 0;
        return x > y ? x + 1 : y + 1;
    }

    private int balanceFactor(Node node) {
        int x, y;
        x = node != null && node.left != null ? node.left.height : 0;
        y = node != null && node.right != null ? node.right.height : 0;
        return x - y;
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        int x = 0, y = 0;
        x = countNodes(node.left);
        y = countNodes(node.right);
        return x + y + 1;
    }

    public boolean search(int key) {
        p = root;
        boolean op = false;
        while (p != null) {
            q = p;
            if (key > p.data) {
                p = p.right;
            } else if (key < p.data) {
                p = p.left;
            } else {
                op = true;
                break;
            }
        }
        return op;
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + ", ");
            inOrder(node.right);
        }
    }

    public void display() {
        System.out.println("INORDER: left, node, right");
        inOrder(root);
        System.out.println();
        System.out.println("PREORDER: node, left, right");
        preOrder(root);
        System.out.println();
        display(root);
        System.out.println("nodes: " + countNodes(root));
    }

    private void preOrder(Node node) {
        System.out.print(node.data + ", ");
        preOrder(node.left);
        preOrder(node.right);
    }

    private void display(Node node) {
        if (node == null) {
            return;
        }
        String str = "";
        if (node.left == null) {
            str += "X";
        } else {
            str += node.left.data;
        }
        str += "<--" + node.data + "-->";
        if (node.right == null) {
            str += "X";
        } else {
            str += node.right.data;
        }
        System.out.println(str);
        display(node.left);
        display(node.right);
    }
}
