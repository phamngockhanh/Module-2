package ss17_binary_file.bai_tap.binary_file.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();
    void add(T t);
    boolean delete(int id);
    boolean update(T t);
    void findId(int id);

}
