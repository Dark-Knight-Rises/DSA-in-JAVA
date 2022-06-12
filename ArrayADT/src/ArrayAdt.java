import java.util.Arrays;
import java.util.Scanner;

public class ArrayAdt {
    int sizeData = 0, len = 0;
    int data[];
    Scanner in = new Scanner(System.in);

    ArrayAdt(int[] nums) {
        len = nums.length;
        sizeData = len + 10;
        data = new int[sizeData];
        data = Arrays.copyOf(nums, sizeData);
    }

    ArrayAdt(int size) {
        sizeData = size;
        len = 0;
        data = new int[size];
    }

    public void displayArray() {
        for (int i = 0; i < len; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println();
    }

    public void displayArray(int[] res) {
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ", ");
        }
        System.out.println();
    }

    public int getLen() {
        return len;
    }

    public void append() {
        if (len < sizeData) {
            System.out.println("enter number to insert: ");
            int x = in.nextInt();
            data[len++] = x;
        } else {
            System.out.println("Sorry! array is full");
        }
    }

    public void add() {
        System.out.println("Insert the index at which you want to enter and also the element you wish to enter: ");
        int index = in.nextInt();
        int element = in.nextInt();
        if (len < sizeData && index <= len && index >= 0) {
            for (int i = len; i > index; i--) {
                data[i] = data[i - 1];
            }
            data[index] = element;
            len++;
        } else {
            System.out.println("sorry! cannot insert @ " + index);
        }
    }

    public void remove() {
        System.out.println("enter the index you wish to remove: ");
        int index = in.nextInt();
        if (len < 0 || index >= len || index < 0) {
            System.out.println("sorry! cannot remove @ " + index);
        } else {
            for (int i = index; i < len - 1; i++) {
                data[i] = data[i + 1];
            }
            len--;
        }
    }

    /**
     * it will search linearly for the key inserted
     * to improve the time complexity of O(n) we can perform transposition
     * technique.
     * if the element is found then take that key to one step closer to the head of
     * the array
     * so that next time it is serched much faster.
     * eventually it will take O(1) time if it is required frequently.
     * 
     * @return
     */
    public int searchLinear() {
        if (len <= 0) {
            System.out.println("cannot perform search list is empty.");
            return -1;
        }
        System.out.println("enter the key to search: ");
        int key = in.nextInt();
        int temp;
        for (int i = 0; i < len; i++) {
            if (data[i] == key) {
                if (i > 0) {
                    temp = data[i];
                    data[i] = data[i - 1];
                    data[i - 1] = temp;
                    return i - 1;
                }
                return i;
            }
        }
        return -1;
    }

    public int binSearch() {
        if (len <= 0) {
            System.out.println("cannot perform search list is empty.");
            return -1;
        }
        System.out.println("enter the key to search: ");
        int key = in.nextInt();
        int lo = 0, hi = len - 1, mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (data[mid] == key) {
                return mid;
            } else if (key < data[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public int get() {
        System.out.println("enter the index you want to get the value: ");
        int key = in.nextInt();
        if (key >= 0 && key < len) {
            return data[key];
        }
        return -1;
    }

    public int set() {
        System.out.println("enter the index you want to set the value and the element: ");
        int key = in.nextInt();
        int element = in.nextInt();
        if (key >= 0 && key < len) {
            return data[key] = element;
        }
        return -1;
    }

    public int max() {
        int m = data[0];
        for (int i = 1; i < len; i++) {
            if (data[i] > m) {
                m = data[i];
            }
        }
        return m;
    }

    public int min() {
        int m = data[0];
        for (int i = 1; i < len; i++) {
            if (data[i] < m) {
                m = data[i];
            }
        }
        return m;
    }

    public int sum() {
        int s = 0;
        for (int i = 1; i < len; i++) {
            s += i;
        }
        return s;
    }

    public float average() {
        float avg = 0.0f;
        avg = sum() / len;
        return avg;
    }

    public void reverse() {
        int i = 0, j = len - 1, temp;
        while (i < j) {
            temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }
    }

    public void rotateLeft() {
        int f = data[0];
        for (int i = 1; i < len; i++) {
            data[i - 1] = data[i];
        }
        data[len - 1] = f;
    }

    public boolean isSorted() {
        for (int i = 0; i < len - 1; i++) {
            if (data[i] > data[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void parity() {
        int i = 0, j = len - 1, temp;
        while (i < j) {
            while (data[i] < 0) {
                i++;
            }
            while (data[j] >= 0) {
                j--;
            }
            if (i < j) {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
    }

    public void merge() {
        System.out.println("enter size of the array: ");
        int n = in.nextInt();
        int j = 0, k = 0, l = 0;
        int[] nums = new int[n];
        System.out.println("enter all " + n + " elments: ");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        ArrayAdt obj2 = new ArrayAdt(nums);
        int[] res = new int[obj2.len + len];
        System.out.println("the array you entered is:");
        obj2.displayArray();
        while (j < len && k < obj2.len) {
            if (data[j] < nums[k]) {
                res[l] = data[j++];
            } else {
                res[l] = nums[k++];
            }
            l++;
        }
        while (j < len) {
            res[l++] = data[j++];
        }
        while (k < obj2.len) {
            res[l++] = nums[k++];
        }
        System.out.println("The merged array is:");
        displayArray(res);
    }

    public int findMissing() {
        System.out.println("Warning! the sequence should be consistent!");
        int diff = data[0], i;
        for (i = 0; i < len; i++) {
            if (data[i] - i != diff) {
                System.out.print("Found missing elemet at: ");
                break;
            }
        }
        return i;
    }

    public void findMultipleMissing() {
        // we will use hashtable for doing this.
        // the time complexity will reduce to only O(n)
        int m = max();
        int[] hash = new int[m + 1];
        for (int i = 0; i < len; i++) {
            hash[data[i]]++;
        }
        System.out.println("the elements which are missing: ");
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public void maxAndMin() {
        int max = data[0];
        int min = data[0];
        for (int i = 1; i < len; i++) {
            if (data[i] < min) {
                min = data[i];
            } else if (data[i] > max) {
                max = data[i];
            }
        }
        System.out.println("the min: " + min + " and max: " + max);
    }
}
