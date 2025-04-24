//package ss16_text_file.bai_tap.product_management.repository;
//
//import ss16_text_file.bai_tap.product_management.common.AscendingOrder;
//import ss16_text_file.bai_tap.product_management.common.DecreasingOrder;
//import ss16_text_file.bai_tap.product_management.entity.Computer;
//import ss16_text_file.bai_tap.product_management.entity.Phone;
//import ss16_text_file.bai_tap.product_management.entity.Product;
//
//import java.util.ArrayList;
//
//public class ProductRepository implements IProductRepository {
//    ArrayList<Product> arrayListProduct = new ArrayList<>();
//    IComputerRepository iComputerRepository = new ComputerRepository();
//    IPhoneRepository iPhoneRepository = new PhoneRepository();
//    public boolean isAddProduct = false;
//
//    @Override
//    public ArrayList<Product> search(String name) {
//        ArrayList<Product> searchList = new ArrayList<>();
//        ArrayList<Computer> computers = iComputerRepository.findAll();
//        ArrayList<Phone> phones = iPhoneRepository.findAll();
//        arrayListProduct.addAll(computers);
//        arrayListProduct.addAll(phones);
//        for (Product product : arrayListProduct) {
//            if (product.getName().contains(name)) {
//                searchList.add(product);
//            }
//        }
//        return searchList;
//    }
//
//    public ArrayList<Product> findAll() {
//        ArrayList<Computer> computers = iComputerRepository.findAll();
//        ArrayList<Phone> phones = iPhoneRepository.findAll();
//        arrayListProduct.addAll(computers);
//        arrayListProduct.addAll(phones);
//        return arrayListProduct;
//    }
//
//    @Override
//    public ArrayList<Product> ascendingOrder() {
//        if (!isAddProduct) {
//            isAddProduct = true;
//            findAll();
//        }
//        arrayListProduct.sort(new AscendingOrder());
//        return arrayListProduct;
//    }
//
//    @Override
//    public ArrayList<Product> decreasingOrder() {
//        if (!isAddProduct) {
//            isAddProduct = true;
//            findAll();
//        }
//        arrayListProduct.sort(new DecreasingOrder());
//        return arrayListProduct;
//    }
//
//
//}
