import java.util.ArrayList;

public class LinkedList {
    Node first, second, third;

    LinkedList() {
        first = null;
        second = null;
        third = null;
    }

    public boolean isEmpty() {
        return first == null ? true : false;
    }

    public boolean isEmpty2() {
        return second == null ? true : false;
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.println("list is empty!");
            return;
        }
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("x");
    }

    public void displayCircular() {
        Node temp = third;
        do {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        } while (temp != third);
        System.out.println("x");
    }

    public void displayList(Node third) {
        Node temp = third;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("x");
    }

    public void displayList2() {
        if (isEmpty2()) {
            System.out.println("list is empty!");
            return;
        }
        Node temp = second;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("x");
    }

    public void addLast(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            first = newNode;
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addLast2(int val) {
        Node newNode = new Node(val);
        if (isEmpty2()) {
            second = newNode;
        } else {
            Node temp = second;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addFirst(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public int getSize() {
        int count = 0;
        Node temp = first;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public int getSum() {
        int sum = 0;
        if (!isEmpty()) {

            Node temp = first;
            while (temp != null) {
                sum += temp.data;
                temp = temp.next;
            }
        }
        return sum;
    }

    public int getMax() {
        if (isEmpty()) {
            return -1;
        }
        Node temp = first;
        int max = first.data;
        while (temp != null) {
            max = max > temp.data ? max : temp.data;
            temp = temp.next;
        }
        return max;
    }

    public int getMin() {
        if (isEmpty()) {
            return -1;
        }
        Node temp = first;
        int min = first.data;
        while (temp != null) {
            min = min < temp.data ? min : temp.data;
            temp = temp.next;
        }
        return min;
    }

    public void search(int key) {
        if (isEmpty()) {
            System.out.println("The list is empty!");
            return;
        }
        Node temp = first;
        int count = 0;
        while (temp != null) {
            count++;
            if (temp.data == key) {
                System.out.println("Found at node number: " + count);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not present");
    }

    public void serachImproved(int key) {
        if (isEmpty()) {
            System.out.println("The list is empty!");
            return;
        }
        Node temp = first;
        Node slow = null;
        int count = 0;
        while (temp != null) {
            count++;
            if (temp.data == key) {
                System.out.println("Found at node number: " + count);
                if (count > 1) {
                    slow.next = temp.next;
                    temp.next = first;
                    first = temp;
                }
                return;
            }
            slow = temp;
            temp = temp.next;
        }
        System.out.println("Not present");
    }

    public void insert(int key, int val) {
        if (key == 0) {
            addFirst(val);
        } else if (key == getSize()) {
            addLast(val);
        } else {
            Node newNode = new Node(val);
            Node temp = first;
            for (int i = 0; i < key - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void insertAtSorted(int val) {
        Node newNode = new Node(val);
        if (isEmpty() || first.data >= val) {
            addFirst(val);
        } else {
            Node temp = first;
            Node q = null;
            while (temp != null && temp.data < val) {
                q = temp;
                temp = temp.next;
            }
            newNode.next = temp;
            q.next = newNode;
        }
    }

    public int delete(int pos) {
        int x = -1;
        if (pos == 1) {
            x = first.data;
            first = first.next;
        } else {
            // any other position
            Node fast = first;
            Node slow = null;
            for (int i = 0; i < pos - 1 && fast != null; i++) {
                slow = fast;
                fast = fast.next;
            }
            if (fast != null) {
                x = fast.data;
                slow.next = fast.next;
            }
        }
        return x;
    }

    public boolean isSorted() {
        int min = Integer.MIN_VALUE;
        Node temp = first;
        while (temp != null) {
            if (min > temp.data) {
                return false;
            }
            min = temp.data;
            temp = temp.next;
        }
        return true;
    }

    public void removeDuplicateFromSorted() {
        ArrayList<Integer> arr = new ArrayList<>();
        Node fast = first.next;
        Node slow = first;
        while (fast != null) {
            if (fast.data == slow.data) {
                arr.add(fast.data);
                slow.next = fast.next;
                fast = slow.next;
            } else {
                slow = fast;
                fast = fast.next;
            }
        }
        System.out.print("THe deleted element(s): ");
        for (Integer x : arr) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }

    public void reverseIterative() {
        Node p = first;
        Node q = null, r = null;
        while (p != null) {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        first = q;
    }

    public void concatenate() {
        Node temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = second;
        second = null;
        System.out.println("After concatenation the final linked list is:");
        displayList();
    }

    public void merge() {
        Node last = null;
        if (first.data < second.data) {
            last = first;
            third = first;
            first = first.next;
            last.next = null;
        } else {
            last = second;
            third = second;
            second = second.next;
            last.next = null;
        }
        while (first != null && second != null) {
            if (first.data < second.data) {
                last.next = first;
                last = first;
                first = first.next;
                last.next = null;
            } else {
                last.next = second;
                last = second;
                second = second.next;
                last.next = null;
            }
        }
        if (first != null) {
            last.next = first;
        }
        if (second != null) {
            last.next = second;
        }
        displayList(third);
    }

    public boolean isLoop() {
        Node fast = third;
        Node slow = third;
        do {
            slow = slow.next;
            fast = fast.next;
            fast = fast != null ? fast.next : null;
        } while (fast != null && slow != null);
        return fast == slow ? true : false;
    }

    public void circularInsert(int[] arr) {
        third = new Node(arr[0]);
        third.next = third;
        Node last = third;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
    }
}
