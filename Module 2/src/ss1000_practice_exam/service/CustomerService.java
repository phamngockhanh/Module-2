package ss1000_practice_exam.service;

import ss1000_practice_exam.entity.Customer;
import ss1000_practice_exam.repository.CustomerRepository;
import ss1000_practice_exam.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    private static ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public List<Customer> search(String name) {
        return customerRepository.search(name);
    }


    @Override
    public void update() {
        customerRepository.update();
    }
}
