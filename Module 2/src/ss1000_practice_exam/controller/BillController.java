package ss1000_practice_exam.controller;

import ss1000_practice_exam.entity.Customer;
import ss1000_practice_exam.entity.TypOfCustomer;
import ss1000_practice_exam.service.CustomerService;
import ss1000_practice_exam.service.TypeOfCustomerService;
import ss1000_practice_exam.view.CustomerView;
import ss999_case_study.common.RegularExpression;

import java.util.List;
import java.util.Scanner;

public class BillController {
    private static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {
        CustomerService customerService = new CustomerService();
        boolean flag = true;
        do {
            System.out.println("==========================");
            System.out.println("=       CHƯƠNG TRÌNH QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN       =");
            System.out.println("= 1. Thêm mới khách hàng =");
            System.out.println("= 2. Hiển thị thông tin khách hàng =");
            System.out.println("= 3. Tìm kiếm khách hàng =");
            System.out.println("= 4. Thêm mới hóa đơn  =");
            System.out.println("= 5. Chỉnh sửa hóa đơn =");
            System.out.println("= 6. Hiển thị thông tin chi tiết hóa đơn =");
            System.out.println("= 7. Thoát  =");
            System.out.println("==========================");
            int choice = RegularExpression.readInt(sc, "Choose function: ");
            switch (choice) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    List<Customer> customers = customerService.findAll();
                    CustomerView.display(customers);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    flag = false;
                    break;
                default:
                    System.out.println("Please input number from 1 to 6!!");
            }
        } while (flag);
    }


    public static void addMenu() {
        TypeOfCustomerService typeOfCustomerService = new TypeOfCustomerService();
        CustomerService customerService = new CustomerService();
        boolean flag = true;
        do {
            System.out.println("==========================");
            System.out.println("=       THÊM MỚI       =");
            System.out.println("= 1. Thêm khách hàng Việt Nam =");
            System.out.println("= 2. Hiển khách hàng nước ngoài =");
            System.out.println("= 3. Thoát =");

            System.out.println("==========================");
            int choice = RegularExpression.readInt(sc, "Choose function: ");
            switch (choice) {
                case 1:
                    List<TypOfCustomer> typOfCustomers = typeOfCustomerService.findAll();
                    Customer customer = CustomerView.addCustomerVN(typOfCustomers);
                    customerService.add(customer);
                    break;
                case 2:
                    Customer customer2 = CustomerView.addCustomerFr();
                    customerService.add(customer2);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Please input number from 1 to 6!!");
            }
        } while (flag);
    }
}




