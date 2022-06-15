import java.util.Scanner;

public class Stack {
    int size;
    int top;
    int[] arr;
    Scanner in = new Scanner(System.in);

    Stack(int size) {
        top = -1;
        this.size = size;
        arr = new int[size];
    }

    public int getSize() {
        return size;
    }

    public int getTop() {
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("stack is empty! ");
            return -1;
        }
        return arr[top];
    }

    public int peek(int pos) {
        int index = top - pos - 1;
        return index >= 0 ? arr[index] : -1;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack underflow ");
            return -1;
        }
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push() {
        if (isFull()) {
            System.out.println("stack overflow");
        } else {
            int data;
            System.out.print("enter the data to push: ");
            data = in.nextInt();
            // in.close();
            top++;
            arr[top] = data;
        }
    }
}
