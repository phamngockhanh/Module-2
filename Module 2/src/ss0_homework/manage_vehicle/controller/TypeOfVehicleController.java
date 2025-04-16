package ss0_homework.manage_vehicle.controller;

import ss0_homework.manage_vehicle.entity.Car;
import ss0_homework.manage_vehicle.entity.Motorbike;
import ss0_homework.manage_vehicle.entity.Truck;
import ss0_homework.manage_vehicle.service.CarService;
import ss0_homework.manage_vehicle.service.MotorbikeService;
import ss0_homework.manage_vehicle.service.TruckService;
import ss0_homework.manage_vehicle.view.CarView;
import ss0_homework.manage_vehicle.view.MotorbikeView;
import ss0_homework.manage_vehicle.view.TruckView;

import java.util.ArrayList;
import java.util.Scanner;

public class TypeOfVehicleController {
   private static Scanner scanner = new Scanner(System.in);
    public static void displayMenuForDisplayFunction() {
        CarService carService = new CarService();
        ArrayList<Car> cars = carService.findAll();
        MotorbikeService motorbikeService= new MotorbikeService();
        ArrayList<Motorbike> motorbikes = motorbikeService.findAll();
        TruckService truckService= new TruckService();
        ArrayList<Truck> trucks = truckService.findAll();
        boolean flag = true;
        do {
            System.out.println("CHỌN LOẠI XE" +
                    "\n 1.Hiển thị xe tải" +
                    "\n 2.Hiện thị ôtô" +
                    "\n 3.Hiển thị  xe máy" +
                    "\n 4.Thoát"
                   );
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Danh sách xe tải: ");
                    TruckView.displayTruck(trucks);
                    break;
                case 2:
                    System.out.println("Danh sách xe ô tô: ");
                    CarView.displayCar(cars);
                    break;
                case 3:
                    System.out.println("Danh sách xe máy: ");
                    MotorbikeView.displayMotorbike(motorbikes);
                    break;
                case 4:
                    CarView.displayCar(cars);
                    break;
                case 5:
                    System.out.println("chức năng tìm kiếm");
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    public static void displayMenuForAddFunction() {
        CarService carService = new CarService();
        MotorbikeService motorbikeService = new MotorbikeService();
        TruckService truckService= new TruckService();
        boolean flag = true;
        do {
            System.out.println("CHỌN LOẠI XE" +
                    "\n 1.Thêm mới xe tải" +
                    "\n 2.Thêm mới ôtô" +
                    "\n 3.Thêm mới  xe máy" +
                    "\n 4.Thoát"
            );
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    Truck truck = TruckView.addTruck();
                    truckService.add(truck);
                    break;
                case 2:
                    Car car = CarView.addCar();
                    carService.add(car);
                    break;
                case 3:
                    Motorbike motorbike = MotorbikeView.addMotorbike();
                    motorbikeService.add(motorbike);
                    break;
                case 4:
                    System.out.println("chức năng sửa");
                    break;
                case 5:
                    System.out.println("chức năng tìm kiếm");
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }


}
