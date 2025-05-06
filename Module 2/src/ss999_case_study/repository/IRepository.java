package ss999_case_study.repository;

import java.util.List;

public interface IRepository<T>{
    List<T> findAll();
    boolean findId(String id);
    void add (T t);
    void update(T t);
    void delete (String id);
}
