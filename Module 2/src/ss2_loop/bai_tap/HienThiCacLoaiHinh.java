package ss2_loop.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void rectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleBottom() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleTop() {
        for (int i = 5; i >0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String exit;
        boolean flag = true;
        do {
            System.out.println("What do you want to print?\n" +
                    "1. Rectangle\n" +
                    "2. Triangle with the right angle at the bottom left\n" +
                    "3. Triangle with the right angle at the top left\n" +
                    "4. Exit");
            System.out.println("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    rectangle();
                    break;
                case 2:
                    triangleBottom();
                    break;
                case 3:
                    triangleTop();
                    break;
                case 4:
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
