import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        // int[] nums;
        int choice;
        System.out.println("enter size of the array: ");
        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();
            // nums = new int[n];
            // System.out.println("enter all " + n + " elments: ");
            // for (int i = 0; i < n; i++) {
            // nums[i] = in.nextInt();
            // }
            // ArrayAdt obj = new ArrayAdt(nums);
            ArrayAdt obj = new ArrayAdt(n);
            while (true) {
                System.out.println("==========================");
                System.out.println("1: Append");
                System.out.println("2: Remove from position");
                System.out.println("3: Display");
                System.out.println("4: Get Size");
                System.out.println("5: Insert @ position");
                System.out.println("6: search linearly");
                System.out.println("7: binary search (only works with sorted array)");
                System.out.println("8: Left Rotate array");
                System.out.println("9: get");
                System.out.println("10: set");
                System.out.println("11: max");
                System.out.println("12: min");
                System.out.println("13: average");
                System.out.println("14: sum");
                System.out.println("15: reverse");
                System.out.println("16: parity");
                System.out.println("17: merge");
                System.out.println("18: FIND missing");
                System.out.println("19: FIND min and max");
                System.out.println("20: Exit");
                System.out.println("==========================");
                System.out.print("enter your choice: ");
                choice = in.nextInt();
                // in.close();
                switch (choice) {
                    case 1:
                        obj.append();
                        break;
                    case 2:
                        obj.remove();
                        break;
                    case 3:
                        obj.displayArray();
                        break;
                    case 4:
                        System.out.println("Size: " + obj.getLen());
                        break;
                    case 5:
                        obj.add();
                        break;
                    case 6:
                        System.out.println(obj.searchLinear());
                        break;
                    case 7:
                        System.out.println(obj.binSearch());
                        break;
                    case 8:
                        obj.rotateLeft();
                        break;
                    case 9:
                        System.out.println(obj.get());
                        break;
                    case 10:
                        System.out.println(obj.set());
                        break;
                    case 11:
                        System.out.println(obj.max());
                        break;
                    case 12:
                        System.out.println(obj.min());
                        break;
                    case 13:
                        System.out.println(obj.average());
                        break;
                    case 14:
                        System.out.println(obj.sum());
                        break;
                    case 15:
                        obj.reverse();
                        break;
                    case 16:
                        obj.parity();
                        break;
                    case 17:
                        obj.merge();
                        break;
                    case 18:
                        obj.findMultipleMissing();
                        break;
                    case 19:
                        obj.maxAndMin();
                        break;
                    case 20:
                        System.out.println("exiting the application...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid input. try again!");
                        break;
                }
            }
        }
    }
}
