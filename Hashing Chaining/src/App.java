import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int key, n, element;
        Scanner in = new Scanner(System.in);
        Hash h = new Hash();

        System.out.print("enter size of the hash table: ");
        int size = in.nextInt();
        Chaining[] objs = new Chaining[size];
        for (int i = 0; i < size; i++) {
            // instantiating every object
            objs[i] = new Chaining();
        }

        while (true) {
            System.out.println("============================================");
            System.out.print("1: insert into hash table\t");
            System.out.println("2: display");
            System.out.println("3: search");
            System.out.println("4: exit");
            System.out.print("enter choice: ");
            key = in.nextInt();
            switch (key) {
                case 1: {
                    System.out.print("enter data: ");
                    element = in.nextInt();
                    n = h.getHash(element, size);
                    objs[n].sortedInsert(element);
                    break;
                }
                case 2: {
                    for (int i = 0; i < size; i++) {
                        String s = "";
                        s += i + 1 + ": ";
                        s += objs[i] == null ? "null" : objs[i].display();
                        // if (objs[i] != null) {
                        // System.out.println(i + 1 + ": " + objs[i].display());
                        // } else {
                        // System.out.println(i + 1 + ": null");
                        // }
                        System.out.println(s);
                    }
                    break;
                }
                case 3: {
                    System.out.print("enter key to search: ");
                    key = in.nextInt();
                    int hash = h.getHash(key, size);
                    int res = objs[hash].search(key);
                    if (res != -1) {
                        System.out.println("key: is found " + res);

                    } else {
                        System.out.println("not found");
                    }
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
            System.out.println("============================================");
        }
    }
}
