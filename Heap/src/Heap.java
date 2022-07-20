import java.util.Scanner;

public class Heap {
    int heapCapacity;
    int[] arr;
    int size;
    Scanner in;

    Heap(int heapCapacity) {
        this.heapCapacity = heapCapacity + 1;
        arr = new int[this.heapCapacity];
        in = new Scanner(System.in);
        arr[0] = -1;
        size = 1;
    }

    private boolean isFull() {
        return size == heapCapacity;
    }

    private boolean isEmpty() {
        return size == 1;
    }

    public void insert() {
        if (isFull()) {
            System.out.println("sorry heap is full");
            return;
        }

        System.out.print("enter the value: ");
        int val = in.nextInt();
        insert(val);
        size++;
    }

    private void insert(int val) {
        arr[size] = val;
        if (isEmpty()) {
            return;
        }
        int i = size, temp = arr[size];
        while (val > arr[i / 2] && i > 1) {
            arr[i] = arr[i / 2];
            i /= 2;
        }
        arr[i] = temp;
    }

    public void displayArray() {
        for (int i = 1; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public int delete() {
        if (isEmpty()) {
            System.out.println("sorry heap is empty");
            return -1;
        }
        size--;
        int n = size;
        return delete(n);
    }

    private int delete(int n) {
        int last = arr[n], first = arr[1], i, j;

        arr[1] = last;
        arr[n] = first;

        i = 1;
        j = i * 2;

        while (j < n - 1) {
            j = arr[j] > arr[j + 1] ? j : j + 1;
            if (arr[i] < arr[j]) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i = j;
                j *= 2;
            } else {
                break;
            }
        }
        return first;
    }

    public void displaySorted() {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
