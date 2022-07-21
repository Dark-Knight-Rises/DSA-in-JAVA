import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int key;
        Scanner in = new Scanner(System.in);

        System.out.print("enter size of the hash table: ");
        int size = in.nextInt();
        Probing obj = new Probing(size);
        while (true) {
            System.out.println("============================================");
            System.out.print("1: insert into hash table\t");
            System.out.println("2: display");
            System.out.print("3: search\t");
            System.out.println("4: exit");
            System.out.print("enter choice: ");
            key = in.nextInt();
            switch (key) {
                case 1: {
                    obj.insert();
                    break;
                }
                case 2: {
                    obj.display();
                    break;
                }
                case 3: {
                    obj.search();
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }

                default: {
                    System.out.println("wrong input");
                    break;
                }
            }
        }
    }
}
