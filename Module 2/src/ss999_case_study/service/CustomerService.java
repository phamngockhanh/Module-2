package ss999_case_study.service;

import ss999_case_study.entity.Customer;
import ss999_case_study.repository.CustomerRepository;
import ss999_case_study.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService{

    ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public boolean findId(String id) {
        return customerRepository.findId(id);
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.update(customer);
    }

    @Override
    public void delete(String id) {
        customerRepository.delete(id);
    }
}
