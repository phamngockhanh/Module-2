package ss17_binary_file.bai_tap.product_management.repository;

import ss17_binary_file.bai_tap.product_management.entity.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> search(String name);
    ArrayList<Product> ascendingOrder();
    ArrayList<Product> decreasingOrder();

}
