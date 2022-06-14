public class LinkedList {
    Node first, last;

    LinkedList() {
        first = null;
        last = null;
    }

    public void createArray(int[] arr) {
        Node newNode = new Node(arr[0]);
        first = newNode;
        last = newNode;
        for (int i = 1; i < arr.length; i++) {
            newNode = new Node(arr[i]);
            newNode.prev = last;
            last.next = newNode;
            last = last.next;
            last.next = first;
            first.prev = last;
        }
    }

    public boolean isCircular() {
        if (first.prev == last && last.next == first) {
            return true;
        }
        return false;
    }

    public void display() {
        if (size() == 0) {
            System.out.println("List is empty");
            return;
        }
        Node temp = first;
        System.out.print("X <--> ");
        for (int i = 0; i < size(); i++) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public int size() {
        int cnt = 0;
        if (first == null) {
            return cnt;
        }
        Node temp = first;
        do {
            temp = temp.next;
            cnt++;
        } while (temp != first);
        return cnt;
    }

    public void insert(int pos, int val) {
        Node newNode = new Node(val);
        if (size() == 0) {
            first = newNode;
            first.prev = newNode;
            first.next = newNode;
            last = first;
        } else {
            if (pos == 0) {
                newNode.next = first;
                newNode.prev = last;
                first.prev = newNode;
                last.next = newNode;
                first = newNode;
            } else {
                Node temp = first;
                for (int i = 0; i < pos - 1; i++) {
                    temp = temp.next;
                }
                newNode.prev = temp;
                newNode.next = temp.next;
                temp.next.prev = newNode;
                temp.next = newNode;
                if (temp == last) {
                    last = newNode;
                }
            }
        }
    }

    // public int delete(int pos) {

    // }
}
