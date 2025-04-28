package ss17_binary_file.bai_tap.binary_file.controller;

import ss17_binary_file.bai_tap.binary_file.common.Flag;
import ss17_binary_file.bai_tap.binary_file.entity.Computer;
import ss17_binary_file.bai_tap.binary_file.entity.Phone;
import ss17_binary_file.bai_tap.binary_file.service.ComputerService;
import ss17_binary_file.bai_tap.binary_file.service.PhoneService;
import ss17_binary_file.bai_tap.binary_file.view.ComputerView;
import ss17_binary_file.bai_tap.binary_file.view.PhoneView;

import java.util.List;
import java.util.Scanner;

public class TypeOfProductController {
    private static Scanner sc = new Scanner(System.in);

    public static void displayForDisplayFunction() {
        ComputerService computerService = new ComputerService();
        PhoneService phoneService = new PhoneService();
        boolean flag = true;
        do {
            System.out.println("========================");
            System.out.println("\t\tChọn mặt hàng hiển thị");
            System.out.println("1. Hiển thị máy tính");
            System.out.println("2. Hiển thị điện thoại");
            System.out.println("3. Thoát");
            System.out.println("=========================");
            System.out.println("Chọn mặt hàng mà bạn muốn hiển thị: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    List<Computer> computers = computerService.findAll();
                    ComputerView.display(computers);
                    break;
                case 2:
                    List<Phone> phones = phoneService.findAll();
                    PhoneView.display(phones);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Vui lòng nhập từ 1-3");
                    break;
            }
        } while (flag);
    }

    public static void displayForAddFunction() {
        ComputerService computerService = new ComputerService();
        PhoneService phoneService = new PhoneService();

        boolean flag = true;
        do {
            System.out.println("========================");
            System.out.println("\t\tChọn mặt hàng muốn thêm");
            System.out.println("1. Thêm máy tính");
            System.out.println("2. Thêm điện thoại");
            System.out.println("3. Thoát");
            System.out.println("=========================");
            System.out.println("Chọn mặt hàng mà bạn muốn thêm: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Computer computer = ComputerView.add();
                    computerService.add(computer);
                    break;
                case 2:
                    Phone phone = PhoneView.add();
                    phoneService.add(phone);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Vui lòng nhập từ 1-3");
                    break;
            }
        } while (flag);
    }

    public static void displayForUpdateFunction() {
        ComputerService computerService = new ComputerService();
        PhoneService phoneService = new PhoneService();

        boolean flag = true;
        do {
            System.out.println("========================");
            System.out.println("\t\tChọn mặt hàng muốn cập nhật");
            System.out.println("1. Cập nhật máy tính");
            System.out.println("2. cập nhât điện thoại");
            System.out.println("3. Thoát");
            System.out.println("=========================");
            System.out.println("Chọn mặt hàng mà bạn muốn cập nhật: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    int id = ComputerView.findId();
                    computerService.findId(id);
                    if (Flag.flag) {
                        Computer computer = ComputerView.update(id);
                        computerService.update(computer);
                        System.out.println("Cập nhật thành công!!!");
                        Flag.flag = false;
                    } else {
                        System.out.println("Không tìm thấy id");
                    }
                    break;
                case 2:
                    int idPhone = PhoneView.findId();
                    phoneService.findId(idPhone);
                    if (Flag.flag) {
                        Phone phone = PhoneView.update(idPhone);
                        phoneService.update(phone);
                        System.out.println("Cập nhật thành công!!!");
                        Flag.flag = false;
                    } else {
                        System.out.println("Không tìm thấy id");
                    }
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Vui lòng nhập từ 1-3");
                    break;
            }
        } while (flag);
    }
}
