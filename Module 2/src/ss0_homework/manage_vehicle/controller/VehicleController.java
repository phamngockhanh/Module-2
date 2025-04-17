package ss0_homework.manage_vehicle.controller;

import ss0_homework.manage_vehicle.common.DeleteFlag;
import ss0_homework.manage_vehicle.entity.Vehicle;
import ss0_homework.manage_vehicle.service.CarService;
import ss0_homework.manage_vehicle.service.MotorbikeService;
import ss0_homework.manage_vehicle.service.TruckService;
import ss0_homework.manage_vehicle.service.VehicleService;
import ss0_homework.manage_vehicle.view.VehicleView;

import java.util.Scanner;

public class VehicleController {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
//      CarService carService = new CarService();
//      MotorbikeService motorbikeService = new MotorbikeService();
//      TruckService truckService= new TruckService();
        VehicleService vehicleService = new VehicleService();
        boolean flag = true;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG" +
                    "\n Chọn chức năng" +
                    "\n 1.Thêm mới phương tiện" +
                    "\n 2.Hiển thị phương tiện" +
                    "\n 3.Xóa phương tiện" +
                    "\n 4.Thoát" +
                    "\n 5. Exit");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    TypeOfVehicleController.displayMenuForAddFunction();
                    break;
                case 2:
                    TypeOfVehicleController.displayMenuForDisplayFunction();
                    break;
                case 3:
                    // Cách 1:

//                     String numberPlate= VehicleView.findNumberPlate();
//                    carService.findNumberPlate(numberPlate);
//                    motorbikeService.findNumberPlate(numberPlate);
//                    truckService.findNumberPlate(numberPlate);
//                    VehicleView.deleteConfirm();
//                    if(DeleteFlag.flagConfirm){
//                        carService.delete(numberPlate);
//                        motorbikeService.delete(numberPlate);
//                        truckService.delete(numberPlate);
//                    }

                    //Cách 2:

                    String numberPlate = VehicleView.findNumberPlate();
                    Vehicle vehicle = vehicleService.checkNumberPlate(numberPlate);
                    if (vehicle != null) {
                        boolean confirm = VehicleView.deleteConfirm2();
                        if (confirm) {
                            vehicleService.delete(vehicle);
                            System.out.println("Xóa thành công!!");
                        } else {
                            System.out.println("Hủy việc xóa!!");
                        }
                    } else {
                        System.out.println("Không tìm thấy");
                    }
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
