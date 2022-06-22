import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    Node root, child, temp;
    Queue<Node> q;
    Scanner in = new Scanner(System.in);

    BinaryTree() {
        root = null;
        child = null;
        temp = null;
        q = new LinkedList<>();
    }

    public void create() {
        System.out.print("enter the root value: ");
        int x = in.nextInt();
        root = new Node(x);
        q.offer(root);
        while (!q.isEmpty()) {
            child = q.poll();
            System.out.print("enter the left child of " + child.data + ": ");
            x = in.nextInt();
            if (x != -1) {
                temp = new Node(x);
                q.offer(temp);
                child.lChild = temp;
            }
            System.out.print("enter the right child of " + child.data + ": ");
            x = in.nextInt();
            if (x != -1) {
                temp = new Node(x);
                q.offer(temp);
                child.rChild = temp;
            }
        }
    }

    private void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.lChild);
            preOrder(root.rChild);
        }
    }

    public void display() {
        preOrder(root);
        System.out.println();
    }
}
