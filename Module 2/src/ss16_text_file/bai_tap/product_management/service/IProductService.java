package ss16_text_file.bai_tap.product_management.service;

import ss16_text_file.bai_tap.product_management.entity.Product;

import java.util.ArrayList;

public interface IProductService {
    ArrayList<Product> search(String name);
    ArrayList<Product> ascendingOrder();
    ArrayList<Product> decreasingOrder();
}
