package ss12_arraylist_linkedlist.bai_tap.product_management.service;

import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Product;

import java.util.ArrayList;

public interface IProductService {
    ArrayList<Product> search(String name);
}
