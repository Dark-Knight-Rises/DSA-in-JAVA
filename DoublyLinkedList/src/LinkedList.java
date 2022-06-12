public class LinkedList {
    Node start, last;

    LinkedList() {
        start = null;
        last = null;
    }

    public void createArray(int[] arr) {
        Node newNode = new Node(arr[0]);
        start = newNode;
        last = newNode;
        for (int i = 1; i < arr.length; i++) {
            newNode = new Node(arr[i]);
            last.next = newNode;
            newNode.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return start == null ? true : false;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        int count = 1;
        Node temp = start;
        while (temp != last) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void displayFromFront() {
        if (isEmpty()) {
            System.out.println("Linkedlist is empty");
        } else {
            Node temp = start;
            System.out.print("X <--> ");
            while (temp != null) {
                System.out.print(temp.data + " <--> ");
                temp = temp.next;
            }
            System.out.println("X");
        }
    }

    public void displayFromLast() {
        Node temp = last;
        System.out.print("X <--> ");
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.prev;
        }
        System.out.println("X");
    }

    public void insert(int pos, int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            // list is empty. inserting on first position regardless of pos
            start = newNode;
            last = newNode;
        } else {
            if (pos == 0) {
                start.prev = newNode;
                newNode.next = start;
                start = newNode;
            } else {
                Node temp = start;
                for (int i = 0; i < pos - 1; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                newNode.prev = temp;
                if (temp.next != null) {
                    temp.next.prev = newNode;
                }
                temp.next = newNode;
            }
        }
        resetLast();
    }

    public int delete(int pos) {
        int x = -1;
        if (isEmpty()) {
            System.out.println("Empty list ");
            return x;
        }
        if (pos == 1) {
            x = start.data;
            start = start.next;
        } else {
            Node temp = start;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
            x = temp.data;
        }
        resetLast();
        return x;
    }

    public void reverse() {
        if (size() <= 1) {
            return;
        } else {
            Node p = start;
            last = p;
            Node temp;
            while (p != null) {
                if (p.next == null) {
                    start = p;
                }
                temp = p.next;
                p.next = p.prev;
                p.prev = temp;
                p = p.prev;
            }
        }
    }

    public void makeCircular() {
        if (size() == 1) {
            start.prev = start;
            start.next = start;
        } else {
            last.next = start;
            start.prev = last;
        }
    }

    public void displayCircular() {
        Node temp = start;
        System.out.print("X <--> ");
        do {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        } while (temp != start);
        System.out.println("X");
    }

    public void insertCircular(int pos, int val) {
        Node newNode = new Node(val);
        if (pos == 0) {
            newNode.prev = last;
            newNode.next = start;
            last.next = newNode;
            start.prev = newNode;
            start = newNode;
        } else {
            Node temp = start;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
            resetLast();
        }
    }

    private void resetLast() {
        if (isEmpty()) {
            return;
        }
        if (size() == 1) {
            last = start;
            return;
        }
        Node temp = start;
        while (temp != null) {
            if (temp.next == null) {
                last = temp;
                break;
            }
            temp = temp.next;
        }
    }
}
