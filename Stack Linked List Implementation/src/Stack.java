import java.util.Scanner;

public class Stack {
    Node start;
    int size;
    Scanner in = new Scanner(System.in);

    Stack() {
        start = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public int getTop() {
        if (start == null) {
            return -1;
        }
        return getSize() - 1;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int peek() {
        int op = -1;
        if (isEmpty()) {
            System.out.println("Stack is empty! ");
        } else {
            op = start.data;
        }
        return op;
    }

    public int pop() {
        int op = -1;
        if (isEmpty()) {
            System.out.println("Stack underflow! ");
        } else {
            op = start.data;
            start = start.next;
            size--;
        }
        return op;
    }

    public void push() {
        System.out.print("enter the value you wish to push: ");
        int x = in.nextInt();
        Node newNode = new Node(x);
        if (isFull(newNode)) {
            System.out.println("stack overflow");
        } else {
            newNode.next = start;
            start = newNode;
            size++;
        }
    }

    private boolean isFull(Node temp) {
        return temp == null;
    }

    public int peek(int pos) {
        int op = -1;
        if (isEmpty()) {
            System.out.println("stack is empty! ");
        } else {
            Node temp = start;
            for (int i = 0; temp != null && i < pos - 1; i++) {
                temp = temp.next;
            }
            op = temp == null ? -1 : temp.data;
        }
        return op;
    }
}
