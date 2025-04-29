package ss999_case_study.controller;

import ss999_case_study.common.ExceptionManagement;

import java.util.Scanner;

public class FunctionManagementController {
    private static Scanner sc = new Scanner(System.in);

    public static void employeeManagement() {
        boolean flag = true;
        do {
            System.out.println("==============================");
            System.out.println("=     Employee Management    =");
            System.out.println("= 1.  Display list employees =");
            System.out.println("= 2.  Add new employee       =");
            System.out.println("= 3.  Edit employee          =");
            System.out.println("= 4.  Return main menu       =");
            System.out.println("==============================");
            System.out.println("Choose function");
            int choice = ExceptionManagement.readInt(sc,"Choose function: ");
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Please choose number from 1 to 4");
                    break;
            }
        } while (flag);
    }


    public static void customerManagement() {
        boolean flag = true;
        do {
            System.out.println("==============================");
            System.out.println("=     Customer Management    =");
            System.out.println("= 1.  Display list customers =");
            System.out.println("= 2.  Add new customer       =");
            System.out.println("= 3.  Edit customer          =");
            System.out.println("= 4.  Return main menu       =");
            System.out.println("==============================");
            System.out.println("Choose function");
            int choice = ExceptionManagement.readInt(sc,"Choose function: ");
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Please choose number from 1 to 4");
                    break;
            }
        } while (flag);
    }

    public static void facilityManagement() {
        boolean flag = true;
        do {
            System.out.println("=========================================");
            System.out.println("=          Customer Management          =");
            System.out.println("= 1.  Display list facility             =");
            System.out.println("= 2.  Add new facility                  =");
            System.out.println("= 3.  Display list facility maintenance =");
            System.out.println("= 4.  Return main menu                  =");
            System.out.println("=========================================");
            int choice = ExceptionManagement.readInt(sc,"Choose function: ");
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Please choose number from 1 to 4");
                    break;
            }
        } while (flag);
    }


    public static void bookingManagement() {
        boolean flag = true;
        do {
            System.out.println("====================================");
            System.out.println("=     Booking Management           =");
            System.out.println("= 1.  Add new booking              =");
            System.out.println("= 2.  Display list booking         =");
            System.out.println("= 3.  Create new contracts         =");
            System.out.println("= 4.  Display list contracts       =");
            System.out.println("= 5.  Edit contracts               =");
            System.out.println("= 6.  Return main menu             =");
            System.out.println("====================================");
            int choice = ExceptionManagement.readInt(sc,"Choose function: ");
            switch (choice) {
                case 1:
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
                    System.out.println("Please choose number from 1 to 6");
                    break;
            }
        } while (flag);
    }

    public static void promotionManagement() {
        boolean flag = true;
        do {
            System.out.println("==========================================");
            System.out.println("=     Promotion  Management              =");
            System.out.println("= 1.  Display list customers use service =");
            System.out.println("= 2.  Display list customers get voucher =");
            System.out.println("= 3.  Return main menu                   =");
            System.out.println("==========================================");
            int choice = ExceptionManagement.readInt(sc,"Choose function: ");
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Please choose number from 1 to 6");
                    break;
            }
        } while (flag);
    }
}
