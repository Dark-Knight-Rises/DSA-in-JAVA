import java.util.Scanner;
import java.util.Stack;

public class ImplementQueuesUsingStack {
    Stack<Integer> stack1, stack2;
    Scanner in = new Scanner(System.in);

    ImplementQueuesUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue() {
        System.out.print("enter data: ");
        int data = in.nextInt();
        stack1.push(data);
    }

    public int dequeue() {
        int op = -1;
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("q is empty!");
            } else {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
                op = stack2.pop();
            }
        } else {
            op = stack2.pop();
        }
        return op;
    }

    public boolean isEmpty() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return true;
        }
        return false;
    }
}
