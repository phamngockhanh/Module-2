package ss1000_practice_exam.service;

import ss1000_practice_exam.entity.Customer;

import java.util.List;

public interface IService<T> {
    List<T> findAll();
    void add(Customer customer);
    List<T> search(String name);
    void update();
}
