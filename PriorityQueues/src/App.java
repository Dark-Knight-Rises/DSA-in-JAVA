import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> (a[1] - b[1])); min
        // heap
        // max heap
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> (b[1] - a[1]));
        int[][] pair = { { 1, 4 }, { 2, 3 }, { 3, 1 }, { 4, 2 } };
        int m = pair.length;
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            int temp[] = new int[2];
            temp[0] = pair[i][0];
            temp[1] = pair[i][1];
            System.out.println(temp[0] + " , " + temp[1]);
            heap.offer(temp);
        }
        for (int i = 0; i < m; i++) {
            res[i] = heap.poll()[0];
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
