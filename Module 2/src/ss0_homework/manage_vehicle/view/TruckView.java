package ss0_homework.manage_vehicle.view;

import ss0_homework.manage_vehicle.common.ManufactureList;
import ss0_homework.manage_vehicle.entity.Motorbike;
import ss0_homework.manage_vehicle.entity.Truck;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayTruck(ArrayList<Truck> trucks) {
        for (Truck truck : trucks) {
            System.out.println(truck);
        }
    }

    public static Truck addTruck() {
        System.out.print("Biển kiểm soát: ");
        String numberPlate = scanner.nextLine();
        System.out.println("Hãng sản xuất: ");
        ArrayList<String> manufactureLists = ManufactureList.manufactureList;
        for (int i = 0; i < manufactureLists.size(); i++) {
            System.out.println((i + 1) + "." + manufactureLists.get(i));
        }
        System.out.println("Chọn hãng sản xuất: ");
        int choice;
        do {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice > manufactureLists.size() || choice < 0) {
                System.out.printf("Vui lòng nhập giá trị trong khoảng từ 1 đến %d", manufactureLists.size());
            }
        } while (choice > manufactureLists.size() || choice <= 0);

        String manuFactureChoice = "";
        for (int i = 0; i < manufactureLists.size(); i++) {
            if ((i + 1) == choice) {
                manuFactureChoice = manufactureLists.get(i);
            }
        }
        String manufacturerName = manuFactureChoice;
        System.out.print("Năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.print("Chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Tải trọng: ");
        int loadCapacity = Integer.parseInt(scanner.nextLine());
        Truck truck = new Truck(numberPlate, manufacturerName, yearOfManufacture, owner,loadCapacity);
        return truck;
    }
}
