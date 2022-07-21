import java.util.Arrays;
import java.util.Scanner;

public class Probing {
    int[] arr;
    int size, data, index;
    Scanner in;

    Probing(int size) {
        this.size = size;
        arr = new int[this.size];
        in = new Scanner(System.in);
        Arrays.fill(arr, -1);
    }

    private int getHash(int key) {
        return key % size;
    }

    public void insert() {
        System.out.print("enter data to insert: ");
        data = in.nextInt();
        index = getHash(data);
        insert(data, index);
    }

    public void search() {
        System.out.print("enter data to search: ");
        data = in.nextInt();
        index = getHash(data);
        search(data, index);
    }

    private void search(int key, int index) {
        if (arr[index] != key) {
            // must be another value
            // do search probe, return found/not found
            index = searchProbe(index, key);
        }
        if (index != -1) {
            System.out.println("found @ " + index);
            return;
        }
        System.out.println("not found");
    }

    private void insert(int key, int index) {
        if (arr[index] != -1) {
            // some element present already
            // do Probing, get new index, then insert
            index = insertProbe(index);
        }
        arr[index] = key;
    }

    private int insertProbe(int index) {
        while (arr[index] != -1) {
            index = (index + 1) % size;
        }
        return index;
    }

    private int searchProbe(int index, int key) {
        while (arr[index] != -1 && arr[index] != key) {
            index = (index + 1) % size;
        }
        return arr[index] == key ? index : -1;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }
}
