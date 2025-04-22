package ss12_arraylist_linkedlist.bai_tap.product_management.repository;

import java.util.ArrayList;

public interface IRepository<T> {
    ArrayList<T> findAll();
    void delete(int id);
    void add(T t);
    void findId(int id);
    void update(T t);
}
