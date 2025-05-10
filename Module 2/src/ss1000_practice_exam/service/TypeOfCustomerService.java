package ss1000_practice_exam.service;

import ss1000_practice_exam.entity.TypOfCustomer;
import ss1000_practice_exam.repository.ITypeOfCustomerRepository;
import ss1000_practice_exam.repository.TypeOfCustomerRepository;

import java.util.List;

public class TypeOfCustomerService implements ITypeOfCustomerService{
    private static ITypeOfCustomerRepository typeOfCustomerRepository = new TypeOfCustomerRepository();
    @Override
    public List<TypOfCustomer> findAll() {
        return typeOfCustomerRepository.findAll();
    }
}
