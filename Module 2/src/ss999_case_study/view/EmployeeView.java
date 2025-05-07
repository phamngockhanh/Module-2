package ss999_case_study.view;

import ss999_case_study.common.ExceptionManagement;
import ss999_case_study.common.RegularExpression;
import ss999_case_study.common.RoleSelectionList;
import ss999_case_study.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    //String fullName, String dateOfBirth, String gender, String phoneNumber, String email, int employeeId, String educationLevelList, String position, double salary
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

    }

    public static Employee add() {
        // Tạo mảng education để người dùng chọn
        ArrayList<String> educationLevelList = RoleSelectionList.educationLevelList;

        // Tạo mảng position để người dùng chọn
        ArrayList<String> positionList = RoleSelectionList.positionList;

        // Nhập id employee
        String employeeId = RegularExpression.checkId(sc, "Enter employee id:", "Employee");

        // Nhập tên
        String fullName = RegularExpression.checkName(sc, "Enter name: ");

        // Nhập ngày
        String dateOfBirth = RegularExpression.checkDate(sc, "Enter date: ");

        // Giới tính
        System.out.println("Enter gender: ");
        String gender = sc.nextLine();

        // Nhập số điện thoại
        String phoneNumber = RegularExpression.checkPhoneNumber(sc, "Enter phone number: ");

        // Nhập email
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        String identityCard = RegularExpression.checkIdentityCard(sc, "Enter identity card: ");

        // Lấy danh sách education
        for (int i = 0; i < educationLevelList.size(); i++) {
            System.out.println(i + 1 + " : " + educationLevelList.get(i));
        }
        int choice;
        do {
            choice = ExceptionManagement.readInt(sc, "Enter your education choice: ");
            if (choice > educationLevelList.size() || choice < 0) {
                System.out.printf("Please enter value around 1 to %d", educationLevelList.size());
            }
        } while (choice > educationLevelList.size() || choice < 0);
        String educationLevel = "";
        for (int i = 0; i < educationLevelList.size(); i++) {
            if (choice == (i + 1)) {
                educationLevel = educationLevelList.get(i);
            }
        }
        for (int i = 0; i < positionList.size(); i++) {
            System.out.println(i + 1 + " : " + positionList.get(i));
        }

        // Lấy danh sách position
        int positionChoice;
        do {
            positionChoice = ExceptionManagement.readInt(sc, "Enter your position choice: ");
            if (positionChoice > positionList.size() || positionChoice < 0) {
                System.out.printf("Please enter value around 1 to %d", positionList.size());
            }
        } while (positionChoice > positionList.size() || positionChoice < 0);
        String position = "";
        for (int i = 0; i < positionList.size(); i++) {
            if (choice == (i + 1)) {
                position = positionList.get(i);
            }
        }
        // Nhập lương
        double salary = RegularExpression.checkSalary(sc, "Enter salary: ");

        return new Employee(fullName, dateOfBirth, gender, phoneNumber, email, identityCard, employeeId, educationLevel, position, salary);
    }

    public static Employee update(String id) {
        // Tạo mảng education để người dùng chọn
        ArrayList<String> educationLevelList = RoleSelectionList.educationLevelList;

        // Tạo mảng position để người dùng chọn
        ArrayList<String> positionList = RoleSelectionList.positionList;

        String fullName = RegularExpression.checkName(sc, "Enter name again: ");

        String dateOfBirth = RegularExpression.checkDate(sc, "Enter date again: ");

        System.out.println("Enter gender: ");
        String gender = sc.nextLine();

        String phoneNumber = RegularExpression.checkPhoneNumber(sc, "Enter phone number again: ");

        System.out.println("Enter email: ");
        String email = sc.nextLine();

        String identityCard = RegularExpression.checkIdentityCard(sc, "Enter identity card again: ");

        // Lấy danh sách education
        for (int i = 0; i < educationLevelList.size(); i++) {
            System.out.println(i + 1 + " : " + educationLevelList.get(i));
        }
        int choice;
        do {
            choice = ExceptionManagement.readInt(sc, "Enter your choice");
            if (choice > educationLevelList.size() || choice < 0) {
                System.out.printf("Please enter value around 1 to %d", educationLevelList.size());
            }
        } while (choice > educationLevelList.size() || choice < 0);
        String educationLevel = "";
        for (int i = 0; i < educationLevelList.size(); i++) {
            if (choice == (i + 1)) {
                educationLevel = educationLevelList.get(i);
            }
        }
        // Lấy danh sách position
        int positionChoice;
        do {
            positionChoice = ExceptionManagement.readInt(sc, "Enter your position choice: ");
            if (positionChoice > positionList.size() || positionChoice < 0) {
                System.out.printf("Please enter value around 1 to %d", positionList.size());
            }
        } while (positionChoice > positionList.size() || positionChoice < 0);
        String position = "";
        for (int i = 0; i < positionList.size(); i++) {
            if (choice == (i + 1)) {
                position = positionList.get(i);
            }
        }

        double salary = RegularExpression.checkSalary(sc, "Enter salary again: ");
        return new Employee(fullName, dateOfBirth, gender, phoneNumber, email, identityCard, id, educationLevel, position, salary);
    }



    public static String findId() {
        System.out.println("Enter id you want to find: ");
        return sc.nextLine();
    }



    public static boolean delete() {
        System.out.println("Do you want to delete? Yes/No");
        String confirm = sc.nextLine();
        return confirm.equalsIgnoreCase("Yes");
    }
}
