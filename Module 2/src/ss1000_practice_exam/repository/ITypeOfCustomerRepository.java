package ss1000_practice_exam.repository;

import ss1000_practice_exam.entity.TypOfCustomer;

import java.util.List;

public interface ITypeOfCustomerRepository {
    List<TypOfCustomer>  findAll();
}
