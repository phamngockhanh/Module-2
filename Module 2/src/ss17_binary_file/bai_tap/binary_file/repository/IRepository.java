package ss17_binary_file.bai_tap.binary_file.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();
    void add (T t);
    boolean delete (int id);
    boolean update (T t);
    void findId(int id);
}
