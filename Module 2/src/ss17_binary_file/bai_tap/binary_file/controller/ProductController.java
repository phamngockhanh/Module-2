package ss17_binary_file.bai_tap.binary_file.controller;

import java.util.Scanner;

public class ProductController {
    private static Scanner sc = new Scanner(System.in);

    public static void displayMenu() {
        boolean flag = true;

        do {
            System.out.println("===========================");
            System.out.println("\t\tQUẢN LÝ SẢN PHẨM");
            System.out.println("1.Hiển thị sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Cập nhật sản phẩm");
            System.out.println("5. Thoát");
            System.out.println("===========================");

            System.out.println("Chọn chức năng");
            int choice  = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    TypeOfProductController.displayForDisplayFunction();
                    break;
                case 2:
                    TypeOfProductController.displayForAddFunction();
                    break;
                case 3:
                    break;
                case 4:
                    TypeOfProductController.displayForUpdateFunction();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập số từ 1 đến 5");
                    break;
            }
        } while (flag);


    }
}
