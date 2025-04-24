package ss16_text_file.bai_tap.product_management.common;

import ss16_text_file.bai_tap.product_management.entity.Product;

import java.util.Comparator;

public class AscendingOrder implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
