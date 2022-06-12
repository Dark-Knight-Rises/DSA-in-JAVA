public class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        prev = null;
        this.data = data;
        next = null;
    }
}
