package ss17_binary_file.bai_tap.binary_file.controller;

import ss17_binary_file.bai_tap.binary_file.entity.Computer;
import ss17_binary_file.bai_tap.binary_file.service.ComputerService;
import ss17_binary_file.bai_tap.binary_file.view.ComputerView;

import java.util.List;
import java.util.Scanner;

public class TypeOfProductController {
    private static Scanner sc = new Scanner(System.in);

    public static void displayForDisplayFunction(){
        ComputerService computerService = new ComputerService();

        boolean flag = true;
        do{
            System.out.println("========================");
            System.out.println("\t\tChọn mặt hàng hiển thị");
            System.out.println("1. Hiển thị máy tính");
            System.out.println("2. Hiển thị điện thoại");
            System.out.println("3. Thoát");
            System.out.println("=========================");
            System.out.println("Chọn mặt hàng mà bạn muốn hiển thị: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    List<Computer> computers = computerService.findAll();
                    ComputerView.display(computers);
                    break;
                case 2:
                    break;
                case 3:
                    flag=false;
                    break;
                default:
                    System.out.println("Vui lòng nhập từ 1-3");
                    break;
            }
        }while (flag);
    }
}
