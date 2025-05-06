package ss999_case_study.controller;

import ss999_case_study.common.ExceptionManagement;

import java.util.Scanner;

public class FuramaController {
    private static Scanner sc = new Scanner(System.in);
    public static void displayMainMenu() {
        boolean flag = true;
        do{
            System.out.println("==========================");
            System.out.println("=       Management       =");
            System.out.println("= 1. Employee Management =");
            System.out.println("= 2. Customer Management =");
            System.out.println("= 3. Facility Management =");
            System.out.println("= 4. Booking Management  =");
            System.out.println("= 5. Promotion Management=");
            System.out.println("= 6.       Exit          =");
            System.out.println("==========================");
            int choice = ExceptionManagement.readInt(sc,"Choose function: ");
            switch (choice){
                case 1:
                    FunctionManagementController.employeeManagement();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Please input number from 1 to 6!!");
            }
        }while(flag);
    }

}
