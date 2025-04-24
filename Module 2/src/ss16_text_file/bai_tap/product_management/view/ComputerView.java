package ss16_text_file.bai_tap.product_management.view;

import ss16_text_file.bai_tap.product_management.common.Flag;
import ss16_text_file.bai_tap.product_management.entity.Computer;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputerView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(ArrayList<Computer> computers) {
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }

    public static Computer add() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập cpu: ");
        String cpu = sc.nextLine();
        System.out.print("Nhập ram: ");
        int ram = Integer.parseInt(sc.nextLine());
        return new Computer(id,name, price, cpu, ram);
    }

    public static int findId() {
        System.out.println("Nhập id mà bạn muốn xóa: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void delete() {
        System.out.println("Bạn có muốn xóa không? Co/Khong");
        String confirm = sc.nextLine();
        if (confirm.equalsIgnoreCase("Co")) {
            Flag.deleteConfirm = true;
            System.out.println("Xoá thành công");
        }else{
            System.out.println("Hủy việc xóa thành công");
        }
    }

    public static Computer update(int id) {
        System.out.print("Cập nhật lại tên: ");
        String name = sc.nextLine();
        System.out.print("Cập nhật lại giá: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Cập nhật lại cpu: ");
        String cpu = sc.nextLine();
        System.out.print("Cập nhật lại ram: ");
        int ram = Integer.parseInt(sc.nextLine());
        return new Computer(id,name, price, cpu, ram);
    }


}
