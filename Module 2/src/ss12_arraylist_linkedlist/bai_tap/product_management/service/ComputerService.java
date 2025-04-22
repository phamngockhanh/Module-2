package ss12_arraylist_linkedlist.bai_tap.product_management.service;

import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Computer;
import ss12_arraylist_linkedlist.bai_tap.product_management.repository.ComputerRepository;
import ss12_arraylist_linkedlist.bai_tap.product_management.repository.IComputerRepository;

import java.util.ArrayList;

public class ComputerService implements IComputerService {
    private IComputerRepository iComputerRepository = new ComputerRepository();

    @Override
    public ArrayList<Computer> findAll() {
        return iComputerRepository.findAll();
    }

    @Override
    public void delete(int id) {
        iComputerRepository.delete(id);
    }

    @Override
    public void findId(int id) {
        iComputerRepository.findId(id);
    }

    @Override
    public void add(Computer computer) {
        iComputerRepository.add(computer);
    }

    @Override
    public void update(Computer computer) {
        iComputerRepository.update(computer);
    }


}
