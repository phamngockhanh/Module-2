package ss5_access_modifiers.bai_tap.product;

import java.util.Scanner;

public class ProductManager {
    private static Product[] products = new Product[100];
    public Scanner sc = new Scanner(System.in);

    static {
        products[0] = new Product(1, "kẹo kera", 158.0);
        products[1] = new Product(2, "Keo Kera2", 158.0);
        products[2] = new Product(3, "Keo Kera3", 158.0);
    }

    public void display() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            } else {
                break;
            }
        }
    }

    public void add() {
        System.out.print("Enter id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter name:");
        String name = sc.nextLine();
        System.out.print("Enter price:");
        double price = Double.parseDouble(sc.nextLine());
        Product sanPham = new Product(id, name, price);
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = sanPham;
                break;
            }
        }
    }

    public void delete() {
        System.out.print("Enter id you want to delete:");
        int id = Integer.parseInt(sc.nextLine());
        boolean found = false;

        for (int i = 0; i < products.length - 1; i++) {
            if (products[i] != null && products[i].getId() == id) {
                found = true;
                for (int j = i; j < products.length - 1; j++) {
                    products[j] = products[j + 1];
                }
                System.out.println("Delete successful!!!");
                break;
            } else if (products[i] == null) {
                break;
            }

        }
        if (!found) {
            System.out.println("Can not find this id!!!");
        }
    }

    public void update() {
        System.out.print("Enter id you want to update:");
        int id = Integer.parseInt(sc.nextLine());
        boolean found = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getId() == id) {
                found = true;
                System.out.println("New product's name: ");
                String newName = sc.nextLine();
                products[i].setName(newName);
                System.out.println("New price's: ");
                double newPrice = sc.nextDouble();
                products[i].setPrice(newPrice);
                System.out.println("Update successful!!!");
                break;
            } else if (products[i] == null) {
                break;
            }
        }
        if (!found) {
            System.out.println("Can not find this id!!!");
        }
    }

    public void search() {
        System.out.print("Enter name's product:");
        String name = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && ((products[i].getName().toLowerCase()).contains(name))) {
                found = true;
                if (products[i] != null && (products[i].getName().toLowerCase()).contains(name)) {
                    System.out.println(products[i]);
                } else if (products[i] == null) {
                    break;
                }
            } else if (products[i] == null) {
                break;
            }
        }
        if (!found) {
            System.out.println("Can not find this name of product!!!");
        }
    }


}
