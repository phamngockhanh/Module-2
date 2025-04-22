package ss12_arraylist_linkedlist.bai_tap.product_management.view;

import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Computer;
import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    private static Scanner sc = new Scanner(System.in);
    public static String search(){
        System.out.print("Nhập tên mà bạn muốn tìm kiếm: ");
        String name = sc.nextLine();
        return name;
    }

    public static void display(ArrayList<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }


    public static void ascendingOrder(ArrayList<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void decreasingOrder(ArrayList<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
