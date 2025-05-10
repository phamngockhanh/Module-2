package ss1000_practice_exam.repository;

import ss1000_practice_exam.common.ReadAndWriteFile;
import ss1000_practice_exam.entity.Customer;
import ss1000_practice_exam.entity.ForeignerCustomer;
import ss1000_practice_exam.entity.VietNamCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static String FILE_PATH = "C:\\Codegym module 2\\Module 2\\src\\ss1000_practice_exam\\data\\khachHang.csv";

    @Override

    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(FILE_PATH);
        for (String line : stringList) {
            String[] arr = line.split(",");
            Customer customer;
            if (arr[0].startsWith("KHVN")) {
                customer = new VietNamCustomer(arr[0], arr[1], arr[2], Double.parseDouble(arr[3]));
            } else {
                customer = new ForeignerCustomer(arr[0], arr[1], arr[2]);
            }
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void add(Customer customer) {
        List<String> listString = new ArrayList<>();
        if (customer instanceof VietNamCustomer) {
            VietNamCustomer vietNamCustomer = (VietNamCustomer) customer;
            listString.add(vietNamCustomer.getInfo());
        } else {
            ForeignerCustomer foreignerCustomer = (ForeignerCustomer) customer;
            listString.add(foreignerCustomer.getInfo());
        }
        ReadAndWriteFile.writeFileCSV(FILE_PATH, listString, true);
    }

    @Override
    public List<Customer> search(String name) {
        List<Customer> customers = findAll();
        List<Customer> customers1 = new ArrayList<>();
        for (Customer customer : customers) {
            if ((customer.getCustomerName().toLowerCase()).contains(name.toLowerCase())) {
                customers1.add(customer);
            }
        }
        return customers1;
    }


    @Override
    public void update() {

    }
}
