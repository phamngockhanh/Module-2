package ss17_binary_file.bai_tap.binary_file.view;

import ss17_binary_file.bai_tap.binary_file.entity.Computer;

import java.util.List;
import java.util.Scanner;

public class ComputerView {
    private static Scanner sc = new Scanner(System.in);
    public static void display(List<Computer> arrayList){
        for(Computer computer:arrayList){
            System.out.println(computer);
        }
    }

    public static Computer add(){
        System.out.println("Nhập id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.println("Nhập price:");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập dung lượng ram:");
        int ram = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập :");
        String chip = sc.nextLine();
        return new Computer(id,name,price,ram,chip);
    }

    public static int findId(){
        System.out.println("Nhập id muốn tìm:");
        int id = Integer.parseInt(sc.nextLine());
        return id;
    }

    public static Computer update(int id){
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.println("Nhập price:");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập dung lượng ram:");
        int ram = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập :");
        String chip = sc.nextLine();
        return new Computer(id,name,price,ram,chip);
    }

    public static void delete(){

    }


}
