public class Queues {
    QNode front, rear, newQNode;

    Queues() {
        front = null;
        rear = null;
        newQNode = null;
    }

    public void enQ(TreeNode data) {
        newQNode = new QNode(data);
        if (isEmpty()) {
            front = newQNode;
            rear = newQNode;
        } else {
            rear.next = newQNode;
            rear = rear.next;
        }
    }

    public TreeNode deQ() {
        TreeNode op = null;
        if (!isEmpty()) {
            op = front.data;
            front = front.next;
        }
        return op;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
