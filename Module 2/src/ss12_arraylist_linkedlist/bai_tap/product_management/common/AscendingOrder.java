package ss12_arraylist_linkedlist.bai_tap.product_management.common;

import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Product;

import java.util.Comparator;

public class AscendingOrder implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
