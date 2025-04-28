package ss17_binary_file.bai_tap.binary_file.view;

import ss17_binary_file.bai_tap.binary_file.entity.Phone;

import java.util.List;
import java.util.Scanner;

public class PhoneView {
    private static Scanner scanner = new Scanner(System.in);

    public static void display(List<Phone> phones) {
        for (int i = 0; i < phones.size(); i++) {
            System.out.println(phones.get(i));
        }
    }

    public static Phone add() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập cameraMP");
        double cameraMP = Double.parseDouble(scanner.nextLine());
        Phone addPhone = new Phone(id, name, price, cameraMP);
        return addPhone;
    }

    public static int findId() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public static Phone update(int id) {
        System.out.println("Nhập lại tên");
        String name = scanner.nextLine();
        System.out.println("Nhập lại giá");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập lại cameraMP");
        double cameraMP = Double.parseDouble(scanner.nextLine());
        Phone updatePhone = new Phone(id, name, price, cameraMP);
        return updatePhone;
    }
}
