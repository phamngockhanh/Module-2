package ss12_arraylist_linkedlist.bai_tap.product_management.repository;

import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> search(String name);
}
