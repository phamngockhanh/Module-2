package ss1000_practice_exam.repository;

import ss1000_practice_exam.entity.Customer;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();
    void add(Customer customer);
    List<T> search(String name);
    void update();

}
