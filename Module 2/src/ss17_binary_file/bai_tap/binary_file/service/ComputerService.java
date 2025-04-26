package ss17_binary_file.bai_tap.binary_file.service;

import ss17_binary_file.bai_tap.binary_file.entity.Computer;
import ss17_binary_file.bai_tap.binary_file.repository.ComputerRepository;
import ss17_binary_file.bai_tap.binary_file.repository.IComputerRepository;

import java.util.List;

public class ComputerService implements IComputerService {
    IComputerRepository iComputerRepository = new ComputerRepository();

    @Override
    public List<Computer> findAll() {
        return iComputerRepository.findAll();
    }

    @Override
    public void add(Computer computer) {
        iComputerRepository.add(computer);
    }

    @Override
    public boolean delete(int id) {
        return iComputerRepository.delete(id);
    }

    @Override
    public boolean update(Computer computer) {
        return iComputerRepository.update(computer);
    }
}
