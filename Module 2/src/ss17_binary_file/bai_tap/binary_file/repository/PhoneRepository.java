package ss17_binary_file.bai_tap.binary_file.repository;

import java.util.List;

public class PhoneRepository implements IRepository{
    @Override
    public List findAll() {
        return List.of();
    }

    @Override
    public void add(Object o) {

    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(Object o) {
        return false;
    }

    @Override
    public void findId(int id) {

    }
}
