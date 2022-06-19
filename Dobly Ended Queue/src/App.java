import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int ch;
        DEqueue q = new DEqueue();
        while (true) {
            System.out.println("========================================");
            System.out.print("1:  enqueue from rear\t");
            System.out.println("2: dequeue from front");
            System.out.print("3: enqueu from front \t");
            System.out.println("4: dequeue from rear");
            System.out.print("5:  display\t");
            System.out.println("6: isEMpty?");
            System.out.print("7: peek \t");
            System.out.println("8: Get size");
            System.out.println("9: Exit");
            System.out.print("enter your choice: ");
            ch = in.nextInt();
            System.out.println("========================================");
            switch (ch) {
                case 1: {
                    q.enqueueFromRear();
                    break;
                }
                case 2: {
                    System.out.println(q.dequeueFromFront());
                    break;
                }
                case 3: {
                    q.enqueueFromFront();
                    break;
                }
                case 4: {
                    System.out.println(q.dequeueFromRear());
                    break;
                }
                case 5: {
                    q.display();
                    break;
                }
                case 6: {
                    System.out.println("isempty? " + q.isEmpty());
                    break;
                }
                case 7: {
                    System.out.println("Peek: " + q.peek());
                    break;
                }
                case 8: {
                    System.out.println("size: " + q.getSize());
                    break;
                }
                case 9: {
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
