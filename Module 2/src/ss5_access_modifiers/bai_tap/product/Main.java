package ss5_access_modifiers.bai_tap.product;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        ProductManager manager = new ProductManager();
        int choice;
        boolean flag = true;
        String exit;
        do {
            System.out.print("-----------Menu---------\n" +
                    "1. Create\n" +
                    "2. List of product\n" +
                    "3. Update\n" +
                    "4. Delete\n" +
                    "5. Search\n" +
                    "6. Exit\n" +
                    "-------------------------------\n");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    manager.add();
                    break;
                case 2:
                    manager.display();
                    break;
                case 3:
                    manager.update();
                    break;
                case 4:
                    manager.delete();
                    break;
                case 5:
                    manager.search();
                    break;
                case 6:
                    do {
                        System.out.println("Do you want to exit?");
                        exit = sc.nextLine();
                        if (exit.equals("Yes") || exit.equals("yes")) {
                            System.out.println("Goodbye!!!");
                            flag = false;
                            break;
                        } else if (exit.equals("no") || exit.equals("No")) {
                            System.out.println("Continue!!!");
                            break;
                        }
                    } while (true);
                    break;
                default:
                    System.out.println("Please enter from 1 to 4");
                    break;
            }
        } while (flag);
    }
}
