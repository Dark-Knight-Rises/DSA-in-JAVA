import java.util.Scanner;

public class Chaining {
    Node start, nn, p, q;
    Scanner in;

    Chaining() {
        start = null;
        nn = null;
        p = null;
        q = null;
        in = new Scanner(System.in);
    }

    public String display() {
        String s = "";
        if (!isEmpty()) {
            p = start;
            while (p != null) {
                s += p.data + " -->";
                p = p.next;
            }
            s += "X";
        }
        return s;
    }

    public void sortedInsert(int x) {
        nn = new Node(x);
        if (isEmpty()) {
            start = nn;
        } else {
            p = start;
            while (p != null && nn.data > p.data) {
                q = p;
                p = p.next;
            }
            q.next = nn;
            nn.next = p;
        }
    }

    private boolean isEmpty() {
        return start == null;
    }

    public int search(int key) {
        int op;
        p = start;
        while (p != null && key > p.data) {
            p = p.next;
        }
        op = p != null ? p.data : -1;
        return op == key ? op : -1;
    }
}
