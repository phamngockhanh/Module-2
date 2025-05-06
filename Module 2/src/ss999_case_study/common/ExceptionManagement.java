package ss999_case_study.common;

import java.util.Scanner;

public class ExceptionManagement {
    public static int readInt(Scanner sc, String message) {
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.println(message);
            try {
                number = sc.nextInt();
                isValid = true;
                sc.nextLine();
            } catch (Exception ex) {
                System.out.println("Invalid input. Please enter an integer number.");
                sc.nextLine();
            }
        }
        return number;
    }
}
