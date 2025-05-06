package ss999_case_study.service;

import ss999_case_study.entity.Contract;

import java.util.List;

public class ContractService implements IContractService {
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
