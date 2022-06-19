import java.util.Scanner;

public class Queues {
    int size = 0, front = -1, rear = -1;
    int[] array;
    Scanner in = new Scanner(System.in);

    // the best way to implement queues with array is to use circular q.
    Queues(int size) {
        this.size = size;
        array = new int[this.size];
        front = 0;
        rear = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void enqueue() {
        if (isFull()) {
            System.out.println("sorry! q is full");
        } else {
            System.out.print("enter the data: ");
            int data = in.nextInt();
            rear = (rear + 1) % size;
            array[rear] = data;
        }
    }

    public int dequeue() {
        int op = -1;
        if (isEmpty()) {
            System.out.println("sorry! q is empty");
        } else {
            front = (front + 1) % size;
            op = array[front];
        }
        return op;
    }

    public int peek() {
        int op = -1;
        if (isEmpty()) {
            System.out.println("sorry! q is empty");
        } else {
            op = array[(front + 1) % size];
        }
        return op;

    }

    public void display() {
        if (isEmpty()) {
            System.out.println("q is empty! ");
        } else {
            int i = front + 1;
            do {
                System.out.print(array[i] + "<--");
                i = (i + 1) % size;
            } while (i != (rear + 1) % size);
            System.out.println("X");
        }
    }
}
