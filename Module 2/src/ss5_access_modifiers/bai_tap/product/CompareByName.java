package ss5_access_modifiers.bai_tap.product;

import java.util.Comparator;

public class CompareByName implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
