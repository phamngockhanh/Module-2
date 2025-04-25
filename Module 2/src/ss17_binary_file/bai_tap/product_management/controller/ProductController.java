package ss17_binary_file.bai_tap.product_management.controller;


//import ss17_binary_file.bai_tap.product_management.service.ProductService;

import ss17_binary_file.bai_tap.product_management.view.ProductView;

import java.util.Scanner;

public class ProductController {
    public static Scanner sc = new Scanner(System.in);

    public static void displayMenu() {
        //ProductService productService = new ProductService();
        boolean flag = true;
        do {
            System.out.print
                    ("====================================\n" +
                            "\t\tQuản lý sản phẩm\n" +
                            "====================================\n" +
                            "1. Thêm sản phẩm\n" +
                            "2. Sửa thông tin sản phẩm\n" +
                            "3. Xóa sản phẩm\n" +
                            "4. Hiển thị danh sách sản phẩm\n" +
                            "5. Tìm kiểm sản phẩm\n" +
                            "6. Sắp xếp sản phẩm\n" +
                            "7. Thoát\n" +
                            "=====================================\n");

            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    TypeOfProductController.menuForAddFunction();
                    break;
                case 2:
                    TypeOfProductController.menuForUpdateFunction();
                    break;
                case 3:
                    TypeOfProductController.menuForDeleteFunction();
                    break;
                case 4:
                    TypeOfProductController.menuForDisplayFunction();
                    break;
                case 5:
                    String name = ProductView.search();
                  //  ProductView.display(productService.search(name));
                    break;
                case 6:
                    TypeOfProductController.menuForArrangeFunction();
                    break;
                case 7:
                    break;
                default:
                    flag = false;
                    break;
            }

        } while (flag);
    }
}
