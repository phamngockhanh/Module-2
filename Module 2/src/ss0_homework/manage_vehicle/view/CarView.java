package ss0_homework.manage_vehicle.view;

import ss0_homework.manage_vehicle.common.ManufactureList;
import ss0_homework.manage_vehicle.entity.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayCar(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static Car addCar() {
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
        System.out.print("Kiểu xe: ");
        String typeOfCar = scanner.nextLine();
        System.out.print("Số chỗ ngồi: ");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());
        Car car = new Car(numberPlate, manufacturerName, yearOfManufacture, typeOfCar, numberOfSeats, owner);
        return car;
    }




}
