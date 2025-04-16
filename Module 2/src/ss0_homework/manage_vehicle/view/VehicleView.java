package ss0_homework.manage_vehicle.view;

import ss0_homework.manage_vehicle.common.DeleteFlag;

import java.util.Scanner;

public class VehicleView {
    private static Scanner scanner = new Scanner(System.in);
    public static String findNumberPlate(){
        System.out.println("Nhập biển số mà bạn muốn xóa");
        String numberPlate = scanner.nextLine();
        return numberPlate;
    }

    public static void deleteConfirm(){
        if(!DeleteFlag.flag){
            System.out.println("Không tìm thấy biển số!!!");
        }else{
            System.out.println("Bạn có muốn xóa không?");
            String confirm=scanner.nextLine();
            if(confirm.equals("Có")||confirm.equals("có")||confirm.equals("Co")||confirm.equals("co")){
                DeleteFlag.flagConfirm =true;
                System.out.println("Xóa thành công");
            }else{
                System.out.println("Hủy việc xóa biển số!!!!");
            }
        }
    }

}
