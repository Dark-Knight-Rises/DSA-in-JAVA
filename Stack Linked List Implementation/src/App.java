import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int ch;
        Stack stack = new Stack();
        while (true) {
            System.out.println("========================================");
            System.out.print("1: GEt size \t");
            System.out.println("2: Get top");
            System.out.print("3: peek \t");
            System.out.println("4: pop");
            System.out.print("5: push \t");
            System.out.println("6: isEMpty?");
            System.out.print("7: isFull? \t");
            System.out.println("8: Peek @");
            System.out.println("9: Exit");
            System.out.print("enter your choice: ");
            ch = in.nextInt();
            System.out.println("========================================");
            switch (ch) {
                case 1: {
                    System.out.println("size: " + stack.getSize());

                    break;
                }
                case 2: {
                    System.out.println("top: " + stack.getTop());
                    break;
                }
                case 3: {
                    System.out.println("Peek: " + stack.peek());
                    break;
                }
                case 4: {
                    System.out.println(stack.pop());
                    break;
                }
                case 5: {
                    stack.push();
                    break;
                }
                case 6: {
                    System.out.println("isempty? " + stack.isEmpty());
                    break;
                }
                case 7: {
                    // System.out.println("isfull? " + stack.isFull());
                    break;
                }
                case 8: {
                    System.out.print("enter the positon: ");
                    int pos = in.nextInt();
                    System.out.println(stack.peek(pos));
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
