package ss16_text_file.bai_tap.product_management.service;

import java.util.ArrayList;

public interface IService<T> {
    ArrayList<T> findAll();
    void delete(int id);
    void findId(int id);
    void add(T t);
    void update(T t);
}
