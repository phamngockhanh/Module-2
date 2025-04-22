package ss12_arraylist_linkedlist.bai_tap.product_management.controller;

import ss0_homework.manage_vehicle.common.DeleteFlag;
import ss12_arraylist_linkedlist.bai_tap.product_management.common.Flag;
import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Computer;
import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Phone;
import ss12_arraylist_linkedlist.bai_tap.product_management.service.ComputerService;
import ss12_arraylist_linkedlist.bai_tap.product_management.service.PhoneService;
import ss12_arraylist_linkedlist.bai_tap.product_management.service.ProductService;
import ss12_arraylist_linkedlist.bai_tap.product_management.view.ComputerView;
import ss12_arraylist_linkedlist.bai_tap.product_management.view.PhoneView;
import ss12_arraylist_linkedlist.bai_tap.product_management.view.ProductView;

import java.util.Scanner;

public class TypeOfProductController {
    public static Scanner sc = new Scanner(System.in);

    public static void menuForDisplayFunction() {
        ComputerService computerService = new ComputerService();
        PhoneService phoneService = new PhoneService();
        boolean flag = true;
        do {
            System.out.println("HIỂN THỊ SẢN PHẨM" +
                    "\n 1.Hiển thị máy tính" +
                    "\n 2.Hiện thị điện thoại" +
                    "\n 3.Thoát"
            );
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    ComputerView.display(computerService.findAll());
                    break;
                case 2:
                    PhoneView.display(phoneService.findAll());
                    break;
                case 3:
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    public static void menuForAddFunction() {
        boolean flag = true;
        do {
            ComputerService computerService = new ComputerService();
            PhoneService phoneService = new PhoneService();
            System.out.println("THÊM SẢN PHẨM" +
                    "\n 1.Thêm máy tính" +
                    "\n 2.Thêm điện thoại" +
                    "\n 3.Thoát"
            );
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    Computer c1 = ComputerView.add();
                    computerService.add(c1);
                    break;
                case 2:
                    Phone p1 = PhoneView.add();
                    phoneService.add(p1);
                    break;
                case 3:
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    public static void menuForDeleteFunction() {
        ComputerService computerService = new ComputerService();
        PhoneService phoneService = new PhoneService();
        boolean flag = true;
        do {
            System.out.println("XÓA SẢN PHẨM" +
                    "\n 1.Xóa máy tính" +
                    "\n 2.Xóa điện thoại" +
                    "\n 3.Thoát"
            );
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    int id = ComputerView.findId();
                    computerService.findId(id);
                    if (!Flag.flag) {
                        System.out.println("Không tìm thấy id này!!");
                    } else {
                        ComputerView.delete();
                        if (Flag.deleteConfirm) {
                            computerService.delete(id);
                            Flag.deleteConfirm = false;
                            Flag.flag = false;
                        }
                    }
                    break;
                case 2:
                    int id1 = PhoneView.findId();
                    phoneService.findId(id1);
                    if (!DeleteFlag.flag) {
                        System.out.println("Không tìm thấy id này!!");
                    } else {
                        phoneService.delete(id1);
                        if (Flag.deleteConfirm) {
                            phoneService.delete(id1);
                            Flag.deleteConfirm = false;
                            Flag.flag = false;
                        }
                    }
                    break;
                case 3:
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    public static void menuForUpdateFunction() {
        boolean flag = true;
        do {
            ComputerService computerService = new ComputerService();
            PhoneService phoneService = new PhoneService();
            System.out.println("Cập nhật sản phẩm" +
                    "\n 1.Cập nhật máy tính" +
                    "\n 2.Cập nhật điện thoại" +
                    "\n 3.Thoát"
            );
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    int id = ComputerView.findId();
                    computerService.findId(id);
                    if (!Flag.flag) {
                        System.out.println("Không tìm thấy id này!!");
                    } else {
                        Computer computer = ComputerView.update(id);
                        computerService.update(computer);
                        Flag.flag = false;
                    }
                    break;
                case 2:
                    int id1 = PhoneView.findId();
                    phoneService.findId(id1);
                    if (!Flag.flag) {
                        System.out.println("Không tìm thấy id này!!");
                    } else {
                        Phone phone = PhoneView.update(id1);
                        phoneService.update(phone);
                        Flag.flag = false;
                    }
                    break;
                case 3:
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    public static void menuForArrangeFunction() {
        boolean flag = true;
        ProductService productService = new ProductService();
        do {
            System.out.println("Sắp xếp theo" +
                    "\n 1.Giá tăng dần" +
                    "\n 2.Giá giảm dần" +
                    "\n 3.Thoát"
            );
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    ProductView.ascendingOrder(productService.ascendingOrder());
                    break;
                case 2:
                    ProductView.decreasingOrder(productService.decreasingOrder());
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
