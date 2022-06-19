import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int ch;
        Queue q = new Queue();
        while (true) {
            System.out.println("========================================");
            System.out.print("1: Get size \t");
            System.out.println("2: display");
            System.out.print("3: peek \t");
            System.out.println("4: dequeue");
            System.out.print("5: enqueue \t");
            System.out.println("6: isEMpty?");
            System.out.println("7: Exit");
            System.out.print("enter your choice: ");
            ch = in.nextInt();
            System.out.println("========================================");
            switch (ch) {
                case 1: {
                    System.out.println("size: " + q.getSize());

                    break;
                }
                case 2: {
                    q.display();
                    break;
                }
                case 3: {
                    System.out.println("Peek: " + q.peek());
                    break;
                }
                case 4: {
                    System.out.println(q.dequeue());
                    break;
                }
                case 5: {
                    q.enqueue();
                    break;
                }
                case 6: {
                    System.out.println("isempty? " + q.isEmpty());
                    break;
                }
                case 7: {
                    System.out.println("exiting...");
                    System.exit(0);
                }

                default: {
                    System.out.println("wrong value try again");
                    break;
                }
            }
        }
    }
}
