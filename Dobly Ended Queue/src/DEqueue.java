import java.util.Scanner;

public class DEqueue {
    Node front, rear;
    int size;
    Scanner in = new Scanner(System.in);

    DEqueue() {
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

    public void enqueueFromRear() {
        System.out.print("enter data: ");
        int x = in.nextInt();
        Node newNode = new Node(x);
        if (isFull(newNode)) {
            System.out.println("the heap mem (q) is full");
        } else {
            if (isEmpty()) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = rear.next;
            }
            size++;
        }
    }

    public void enqueueFromFront() {
        System.out.print("enter data: ");
        int x = in.nextInt();
        Node newNode = new Node(x);
        if (isFull(newNode)) {
            System.out.println("the heap mem (q) is full");
        } else {
            if (isEmpty()) {
                front = newNode;
                rear = newNode;
            } else {
                newNode.next = front;
                front = newNode;
            }
            size++;
        }
    }

    public int dequeueFromFront() {
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

    public int dequeueFromRear() {
        int op = -1;
        if (isEmpty()) {
            System.out.println("q is empty!");
        } else {
            op = rear.data;
            if (front == rear) {
                front = null;
                rear = null;
            } else {
                Node temp = front;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                rear = temp;
                rear.next = null;
            }
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
