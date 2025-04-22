package ss12_arraylist_linkedlist.bai_tap.product_management.repository;

import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Computer;
import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Phone;
import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Product;

import java.util.ArrayList;

public class ProductRepository implements IProductRepository {
    ArrayList<Product> arrayListProduct = new ArrayList<>();
    IComputerRepository iComputerRepository = new ComputerRepository();
    IPhoneRepository iPhoneRepository = new PhoneRepository();

    @Override
    public ArrayList<Product> search(String name) {
        ArrayList<Product> searchList = new ArrayList<>();
        ArrayList<Computer> computers = iComputerRepository.findAll();
        ArrayList<Phone> phones = iPhoneRepository.findAll();
        arrayListProduct.addAll(computers);
        arrayListProduct.addAll(phones);
        for(Product product:arrayListProduct){
            if(product.getName().contains(name)){
                searchList.add(product);
            }
        }
        return searchList;
    }

}
