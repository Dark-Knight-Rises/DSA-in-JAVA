import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        LinkedList obj = new LinkedList();
        int ch;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("===============================================");
            System.out.println("1 : Add first");
            System.out.print("2 : add last \t");
            System.out.println("3 : view list");
            System.out.print("4 : size \t");
            System.out.println("5 : sum");
            System.out.print("6 : Max \t");
            System.out.println("7 : Min");
            System.out.print("8 : search 1 \t");
            System.out.println("9 : search 2");
            System.out.print("10 : Insert @ \t");
            System.out.println("11 : Insert in sorted list");
            System.out.print("12 : delete \t");
            System.out.println("13 : check if sorted");
            System.out.print("14 : Remove duplicates from sorted list \t");
            System.out.println("15 : Reverse");
            System.out.print("16 : Add last in 2nd list \t");
            System.out.println("17 : Display second list");
            System.out.print("18 : Concat 2 lists \t");
            System.out.println("19 : Merge 2 sorted lists");
            System.out.print("20 : Check for loops in linked list\t");
            System.out.println("21 : Circular insert");
            System.out.print("22 : Display circular linked list \t");
            System.out.println("23 : exit");
            System.out.print("enter choice: ");
            ch = in.nextInt();
            System.out.println("===============================================");
            switch (ch) {
                case 1: {
                    System.out.print("enter the value to add first: ");
                    int val = in.nextInt();
                    obj.addFirst(val);
                    break;
                }
                case 2: {
                    System.out.print("enter the value to add last: ");
                    int val = in.nextInt();
                    obj.addLast(val);
                    break;
                }
                case 3: {
                    obj.displayList();
                    break;
                }
                case 4: {
                    System.out.println("The size is: " + obj.getSize());
                    break;
                }
                case 5: {
                    System.out.println("The sum of all nodes is: " + obj.getSum());
                    break;
                }
                case 6: {
                    System.out.println("The max of all nodes is: " + obj.getMax());
                    break;
                }
                case 7: {
                    System.out.println("The min of all nodes is: " + obj.getMin());
                    break;
                }
                case 8: {
                    System.out.print("enter the key to search: ");
                    int key = in.nextInt();
                    obj.search(key);
                    break;
                }
                case 9: {
                    System.out.print("enter the key to search: ");
                    int key = in.nextInt();
                    obj.serachImproved(key);
                    break;
                }
                case 10: {
                    if (obj.isEmpty()) {
                        System.out.println("List is empty, inserting at last!");
                        System.out.print("Enter the data: ");
                        int val = in.nextInt();
                        obj.addLast(val);
                    } else {
                        System.out.print("Enter the position after you want to insert your data: ");
                        int key = in.nextInt();
                        if (key >= 0 && key <= obj.getSize()) {
                            System.out.print("Enter the data: ");
                            int val = in.nextInt();
                            obj.insert(key, val);
                        } else {
                            System.out.println("Invalid position!");
                        }
                    }
                    break;
                }
                case 11: {
                    System.out.println("Insert the data you want to enter in a sorted list");
                    int val = in.nextInt();
                    obj.insertAtSorted(val);
                    break;
                }
                case 12: {
                    if (!obj.isEmpty()) {
                        System.out.println("Enter the position you want to delete");
                        int pos = in.nextInt();
                        System.out.println("The deleted element is: " + obj.delete(pos));
                    }
                    break;
                }
                case 13: {
                    if (obj.isEmpty()) {
                        System.out.println("Cannot determine the list is empty");
                    } else {
                        System.out.println("The list is sorted? " + obj.isSorted());
                    }
                    break;
                }
                case 14: {
                    if (obj.isEmpty()) {
                        System.out.println("The list is empty! ");
                    } else {
                        if (obj.isSorted()) {
                            obj.removeDuplicateFromSorted();
                        } else {
                            System.out.println("The list is not sorted! ");
                        }
                    }
                    break;
                }
                case 15: {
                    if (!obj.isEmpty()) {
                        obj.reverseIterative();
                    } else {
                        System.out.println("the list is empty");
                    }
                    break;
                }
                case 16: {
                    System.out.print("enter the value to add last in the SECOND LIST: ");
                    int val = in.nextInt();
                    obj.addLast2(val);
                    break;
                }
                case 17: {
                    if (obj.isEmpty2()) {
                        System.out.println("2nd list doesn't exits");
                    } else {
                        obj.displayList2();
                    }
                    break;
                }
                case 18: {
                    if (obj.isEmpty2()) {
                        System.out.println("2nd list doesn't exits");
                    } else {
                        obj.concatenate();
                    }
                    break;
                }
                case 19: {
                    if (obj.isEmpty2()) {
                        System.out.println("2nd list doesn't exits");
                    } else {
                        System.out.println("After merging: ");
                        obj.merge();
                    }
                    break;
                }
                case 20: {
                    System.out.println("isLoop? " + obj.isLoop());
                    break;
                }
                case 21: {
                    System.out.print("Enter no. of elements: ");
                    int x = in.nextInt();
                    int[] array = new int[x];
                    System.out.println("Now enter the " + x + " elements: ");
                    for (int i = 0; i < x; i++) {
                        array[i] = in.nextInt();
                    }
                    obj.circularInsert(array);
                    break;
                }
                case 22: {
                    obj.displayCircular();
                    break;

                }
                case 23: {
                    System.out.println("Exiting application...");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("wrong input try again");
                    break;
                }
            }
        }
    }
}
