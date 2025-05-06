package ss999_case_study.service;

import ss999_case_study.entity.Employee;
import ss999_case_study.repository.EmployeeRepository;
import ss999_case_study.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository iEmployeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> findAll() {
        return iEmployeeRepository.findAll();
    }

    @Override
    public boolean findId(String id) {
        return iEmployeeRepository.findId(id);
    }

    @Override
    public void add(Employee employee) {
        iEmployeeRepository.add(employee);
    }

    @Override
    public void update(Employee employee) {
        iEmployeeRepository.update(employee);
    }

    @Override
    public void delete(String id) {
        iEmployeeRepository.delete(id);
    }

}
