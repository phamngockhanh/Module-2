package ss999_case_study.repository;

import ss999_case_study.entity.Contract;

import java.util.List;

public class ContractRepository implements IContractRepository {
    @Override
    public List<Contract> findAll() {
        return List.of();
    }

    @Override
    public boolean findId(String id) {
        return false;
    }

    @Override
    public void add(Contract contract) {

    }

    @Override
    public void update(Contract contract) {

    }

    @Override
    public void delete(String id) {
    }
}
