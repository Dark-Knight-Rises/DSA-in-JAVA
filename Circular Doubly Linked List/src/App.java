import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int ch;
        LinkedList obj = new LinkedList();
        while (true) {
            System.out.println("==============================================");
            System.out.print("1: fill ll with array\t");
            System.out.println("2: display ll");
            System.out.print("3: Insert @ \t");
            System.out.println("4: Delete");
            System.out.print("5: if circular?\t");
            System.out.println("6: exit");
            System.out.print("Enter choice: ");
            ch = in.nextInt();
            System.out.println("==============================================");
            switch (ch) {
                case 1: {
                    System.out.print("enter the size of ll: ");
                    int x = in.nextInt();
                    int[] arr = new int[x];
                    for (int i = 0; i < x; i++) {
                        arr[i] = i + 1;
                    }
                    obj.createArray(arr);
                    break;
                }
                case 2: {
                    obj.display();
                    break;
                }
                case 3: {
                    System.out.println("the position should be in between 0 and " + obj.size());
                    System.out.print("Enter the position after you wish to enter: ");
                    int pos = in.nextInt();
                    if (pos >= 0 && pos <= obj.size()) {
                        System.out.print("enter the data: ");
                        int x = in.nextInt();
                        obj.insert(pos, x);
                    } else {
                        System.out.println("Invalid position");
                    }
                    break;
                }
                case 4: {
                    System.out.println("the position should be in between 1 and " + obj.size());
                    System.out.print("Enter the position you wish to remove: ");
                    int pos = in.nextInt();
                    if (pos >= 1 && pos <= obj.size()) {
                        // System.out.println(obj.delete(pos));

                    } else {
                        System.out.println("invalid position");
                    }
                    break;
                }
                case 5: {
                    System.out.println("isCircular? " + obj.isCircular());
                    break;
                }
                case 6: {
                    System.out.println("exiting...");
                    System.exit(0);
                }
                default: {
                    System.out.println("wrong input, try again");
                    break;
                }
            }
        }
    }
}
