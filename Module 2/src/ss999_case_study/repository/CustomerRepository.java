package ss999_case_study.repository;

import ss999_case_study.common.ReadAndWriteFile;
import ss999_case_study.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static String FILE_PATH = "C:\\Codegym module 2\\Module 2\\src\\ss999_case_study\\data\\customer.csv";

    @Override
    public List<Customer> findAll() {
        List<String> listString = ReadAndWriteFile.readFileCSV(FILE_PATH);
        List<Customer> customers = new ArrayList<>();
        for (String stringLine : listString) {
            String[] arr = stringLine.split(",");
            customers.add(new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]));
        }
        return customers;
    }

    @Override
    public boolean findId(String id) {
        List<Customer> customers = findAll();
        for(Customer customer : customers){
            if(customer.getCustomerId().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfor());
        ReadAndWriteFile.writeFileCSV(FILE_PATH, stringList, true);
    }

    @Override
    public void update(Customer customer) {
        List<Customer> customers = findAll();
        for(int i = 0;i<customers.size();i++){
            if(customer.getCustomerId().equals(customers.get(i).getCustomerId())){
                customers.set(i,customer);
            }
        }
    }

    @Override
    public void delete(String id) {
        List<Customer> customers = findAll();
        for(Customer customer: customers){
            if(customer.getCustomerId().equals(id)){
                customers.remove(customer);
            }
        }
    }
}
