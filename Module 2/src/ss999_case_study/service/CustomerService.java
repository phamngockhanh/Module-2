package ss999_case_study.service;

import ss999_case_study.entity.Customer;

import java.util.List;

public class CustomerService implements ICustomerService{
    @Override
    public List<Customer> findAll() {
        return List.of();
    }

    @Override
    public boolean findId(String id) {
        return false;
    }

    @Override
    public void add(Customer customer) {

    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(String id) {
    }


}
