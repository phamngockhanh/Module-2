package ss16_text_file.bai_tap.product_management.view;

import ss16_text_file.bai_tap.product_management.common.Flag;
import ss16_text_file.bai_tap.product_management.entity.Phone;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneView {
    private static Scanner sc = new Scanner(System.in);
    public static void display(ArrayList<Phone> phones){
        for(Phone phone : phones){
            System.out.println(phone);
        }
    }

    public static Phone add() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Độ rõ của cam: ");
        int cameraMP = Integer.parseInt(sc.nextLine());
        Phone p1 = new Phone(name,id,price,cameraMP);
        return p1;
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

    public static Phone update(int id) {
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Độ rõ của cam: ");
        int cameraMP = Integer.parseInt(sc.nextLine());
        return new Phone(name, id, price, cameraMP);
    }
}
