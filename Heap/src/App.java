import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the cap of heap: ");
        int heapCapacity = in.nextInt(), ch;
        Heap h = new Heap(heapCapacity);
        while (true) {
            System.out.println("===========================================");
            System.out.print("1: insert in heap \t");
            System.out.println("2: delete from heap");
            System.out.print("3: show heap \t");
            System.out.println("4: display sorted");
            System.out.println("5: exit");
            System.out.print("enter choice: ");
            ch = in.nextInt();
            switch (ch) {
                case 1: {
                    h.insert();
                    break;
                }
                case 2: {
                    System.out.println(h.delete());
                    break;
                }
                case 3: {
                    h.displayArray();
                    break;
                }
                case 4: {
                    h.displaySorted();
                    break;
                }
                case 5: {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("wrong inp");
                    break;
            }
            System.out.println("===========================================");
        }
    }
}
