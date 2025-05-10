package ss999_case_study.service;

import ss999_case_study.entity.Facility;
import ss999_case_study.repository.FacilityRepository;
import ss999_case_study.repository.IFacilityRepository;

import java.util.List;
import java.util.Map;

public class FacilityService implements IFacilityService{

    IFacilityRepository iFacilityRepository = new FacilityRepository();
    @Override
    public Map<Facility, Integer> getAll() {
        return iFacilityRepository.getAll();
    }

    @Override
    public List<Facility> findAll() {
        return iFacilityRepository.findAll();
    }

    @Override
    public boolean findId(String id) {
        return iFacilityRepository.findId(id);
    }

    @Override
    public void add(Facility facility) {
        iFacilityRepository.add(facility);
    }

    @Override
    public Map<Facility, Integer> getMaintenance() {
       return iFacilityRepository.getMaintenance();
    }

    @Override
    public void update(Facility facility) {
        iFacilityRepository.update(facility);
    }

    @Override
    public void delete(String id) {
        iFacilityRepository.delete(id);
    }
}
