import java.util.Scanner;

public class Queue {
    Node front, rear;
    int size;
    Scanner in = new Scanner(System.in);

    Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return front == null;
    }

    private boolean isFull(Node x) {
        return x == null;
    }

    public void enqueue() {
        System.out.print("enter data: ");
        int x = in.nextInt();
        Node newNode = new Node(x);
        if (isFull(newNode)) {
            System.out.println("the heap mem (q) is full");
        } else {
            if (front == null) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = rear.next;
            }
            size++;
        }
    }

    public int dequeue() {
        int op = -1;
        if (isEmpty()) {
            System.out.println("q is empty!");
        } else {
            op = front.data;
            front = front.next;
            size--;
        }
        return op;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("q is empty!");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("X");
        }
    }

    public int peek() {
        int op = -1;
        if (isEmpty()) {
            System.out.println("q is empty!");
        } else {
            op = front.data;
        }
        return op;
    }
}
